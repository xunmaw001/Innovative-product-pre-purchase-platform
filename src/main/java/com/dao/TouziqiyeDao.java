package com.dao;

import com.entity.TouziqiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TouziqiyeVO;
import com.entity.view.TouziqiyeView;


/**
 * 投资企业
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface TouziqiyeDao extends BaseMapper<TouziqiyeEntity> {
	
	List<TouziqiyeVO> selectListVO(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
	
	TouziqiyeVO selectVO(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
	
	List<TouziqiyeView> selectListView(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);

	List<TouziqiyeView> selectListView(Pagination page,@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
	
	TouziqiyeView selectView(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
	

}
