package com.dao;

import com.entity.FabuqiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FabuqiyeVO;
import com.entity.view.FabuqiyeView;


/**
 * 发布企业
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface FabuqiyeDao extends BaseMapper<FabuqiyeEntity> {
	
	List<FabuqiyeVO> selectListVO(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
	
	FabuqiyeVO selectVO(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
	
	List<FabuqiyeView> selectListView(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);

	List<FabuqiyeView> selectListView(Pagination page,@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
	
	FabuqiyeView selectView(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
	

}
