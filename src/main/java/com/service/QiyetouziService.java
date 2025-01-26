package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyetouziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyetouziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyetouziView;


/**
 * 企业投资
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface QiyetouziService extends IService<QiyetouziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyetouziVO> selectListVO(Wrapper<QiyetouziEntity> wrapper);
   	
   	QiyetouziVO selectVO(@Param("ew") Wrapper<QiyetouziEntity> wrapper);
   	
   	List<QiyetouziView> selectListView(Wrapper<QiyetouziEntity> wrapper);
   	
   	QiyetouziView selectView(@Param("ew") Wrapper<QiyetouziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyetouziEntity> wrapper);
   	

}

