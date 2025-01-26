package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FabuqiyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FabuqiyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FabuqiyeView;


/**
 * 发布企业
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface FabuqiyeService extends IService<FabuqiyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FabuqiyeVO> selectListVO(Wrapper<FabuqiyeEntity> wrapper);
   	
   	FabuqiyeVO selectVO(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
   	
   	List<FabuqiyeView> selectListView(Wrapper<FabuqiyeEntity> wrapper);
   	
   	FabuqiyeView selectView(@Param("ew") Wrapper<FabuqiyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FabuqiyeEntity> wrapper);
   	

}

