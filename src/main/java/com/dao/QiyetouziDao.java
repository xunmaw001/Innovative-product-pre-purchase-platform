package com.dao;

import com.entity.QiyetouziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyetouziVO;
import com.entity.view.QiyetouziView;


/**
 * 企业投资
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface QiyetouziDao extends BaseMapper<QiyetouziEntity> {
	
	List<QiyetouziVO> selectListVO(@Param("ew") Wrapper<QiyetouziEntity> wrapper);
	
	QiyetouziVO selectVO(@Param("ew") Wrapper<QiyetouziEntity> wrapper);
	
	List<QiyetouziView> selectListView(@Param("ew") Wrapper<QiyetouziEntity> wrapper);

	List<QiyetouziView> selectListView(Pagination page,@Param("ew") Wrapper<QiyetouziEntity> wrapper);
	
	QiyetouziView selectView(@Param("ew") Wrapper<QiyetouziEntity> wrapper);
	

}
