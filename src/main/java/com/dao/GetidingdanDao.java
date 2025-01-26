package com.dao;

import com.entity.GetidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GetidingdanVO;
import com.entity.view.GetidingdanView;


/**
 * 个体订单
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface GetidingdanDao extends BaseMapper<GetidingdanEntity> {
	
	List<GetidingdanVO> selectListVO(@Param("ew") Wrapper<GetidingdanEntity> wrapper);
	
	GetidingdanVO selectVO(@Param("ew") Wrapper<GetidingdanEntity> wrapper);
	
	List<GetidingdanView> selectListView(@Param("ew") Wrapper<GetidingdanEntity> wrapper);

	List<GetidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GetidingdanEntity> wrapper);
	
	GetidingdanView selectView(@Param("ew") Wrapper<GetidingdanEntity> wrapper);
	

}
