package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GetidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GetidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GetidingdanView;


/**
 * 个体订单
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface GetidingdanService extends IService<GetidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GetidingdanVO> selectListVO(Wrapper<GetidingdanEntity> wrapper);
   	
   	GetidingdanVO selectVO(@Param("ew") Wrapper<GetidingdanEntity> wrapper);
   	
   	List<GetidingdanView> selectListView(Wrapper<GetidingdanEntity> wrapper);
   	
   	GetidingdanView selectView(@Param("ew") Wrapper<GetidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GetidingdanEntity> wrapper);
   	

}

