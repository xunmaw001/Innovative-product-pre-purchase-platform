package com.dao;

import com.entity.QiyedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyedingdanVO;
import com.entity.view.QiyedingdanView;


/**
 * 企业订单
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface QiyedingdanDao extends BaseMapper<QiyedingdanEntity> {
	
	List<QiyedingdanVO> selectListVO(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
	
	QiyedingdanVO selectVO(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
	
	List<QiyedingdanView> selectListView(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);

	List<QiyedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
	
	QiyedingdanView selectView(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
	

}
