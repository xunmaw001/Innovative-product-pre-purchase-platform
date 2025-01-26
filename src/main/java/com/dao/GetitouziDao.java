package com.dao;

import com.entity.GetitouziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GetitouziVO;
import com.entity.view.GetitouziView;


/**
 * 个体投资
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface GetitouziDao extends BaseMapper<GetitouziEntity> {
	
	List<GetitouziVO> selectListVO(@Param("ew") Wrapper<GetitouziEntity> wrapper);
	
	GetitouziVO selectVO(@Param("ew") Wrapper<GetitouziEntity> wrapper);
	
	List<GetitouziView> selectListView(@Param("ew") Wrapper<GetitouziEntity> wrapper);

	List<GetitouziView> selectListView(Pagination page,@Param("ew") Wrapper<GetitouziEntity> wrapper);
	
	GetitouziView selectView(@Param("ew") Wrapper<GetitouziEntity> wrapper);
	

}
