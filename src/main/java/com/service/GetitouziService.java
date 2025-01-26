package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GetitouziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GetitouziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GetitouziView;


/**
 * 个体投资
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface GetitouziService extends IService<GetitouziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GetitouziVO> selectListVO(Wrapper<GetitouziEntity> wrapper);
   	
   	GetitouziVO selectVO(@Param("ew") Wrapper<GetitouziEntity> wrapper);
   	
   	List<GetitouziView> selectListView(Wrapper<GetitouziEntity> wrapper);
   	
   	GetitouziView selectView(@Param("ew") Wrapper<GetitouziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GetitouziEntity> wrapper);
   	

}

