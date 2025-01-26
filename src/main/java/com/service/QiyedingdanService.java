package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyedingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyedingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyedingdanView;


/**
 * 企业订单
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface QiyedingdanService extends IService<QiyedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyedingdanVO> selectListVO(Wrapper<QiyedingdanEntity> wrapper);
   	
   	QiyedingdanVO selectVO(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
   	
   	List<QiyedingdanView> selectListView(Wrapper<QiyedingdanEntity> wrapper);
   	
   	QiyedingdanView selectView(@Param("ew") Wrapper<QiyedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyedingdanEntity> wrapper);
   	

}

