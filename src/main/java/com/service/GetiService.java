package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GetiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GetiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GetiView;


/**
 * 个体
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface GetiService extends IService<GetiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GetiVO> selectListVO(Wrapper<GetiEntity> wrapper);
   	
   	GetiVO selectVO(@Param("ew") Wrapper<GetiEntity> wrapper);
   	
   	List<GetiView> selectListView(Wrapper<GetiEntity> wrapper);
   	
   	GetiView selectView(@Param("ew") Wrapper<GetiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GetiEntity> wrapper);
   	

}

