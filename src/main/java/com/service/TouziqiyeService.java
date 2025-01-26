package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TouziqiyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TouziqiyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TouziqiyeView;


/**
 * 投资企业
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface TouziqiyeService extends IService<TouziqiyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TouziqiyeVO> selectListVO(Wrapper<TouziqiyeEntity> wrapper);
   	
   	TouziqiyeVO selectVO(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
   	
   	List<TouziqiyeView> selectListView(Wrapper<TouziqiyeEntity> wrapper);
   	
   	TouziqiyeView selectView(@Param("ew") Wrapper<TouziqiyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TouziqiyeEntity> wrapper);
   	

}

