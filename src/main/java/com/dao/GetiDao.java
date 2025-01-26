package com.dao;

import com.entity.GetiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GetiVO;
import com.entity.view.GetiView;


/**
 * 个体
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface GetiDao extends BaseMapper<GetiEntity> {
	
	List<GetiVO> selectListVO(@Param("ew") Wrapper<GetiEntity> wrapper);
	
	GetiVO selectVO(@Param("ew") Wrapper<GetiEntity> wrapper);
	
	List<GetiView> selectListView(@Param("ew") Wrapper<GetiEntity> wrapper);

	List<GetiView> selectListView(Pagination page,@Param("ew") Wrapper<GetiEntity> wrapper);
	
	GetiView selectView(@Param("ew") Wrapper<GetiEntity> wrapper);
	

}
