package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinxiangmuView;


/**
 * 产品项目
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface ChanpinxiangmuService extends IService<ChanpinxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinxiangmuVO> selectListVO(Wrapper<ChanpinxiangmuEntity> wrapper);
   	
   	ChanpinxiangmuVO selectVO(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
   	
   	List<ChanpinxiangmuView> selectListView(Wrapper<ChanpinxiangmuEntity> wrapper);
   	
   	ChanpinxiangmuView selectView(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinxiangmuEntity> wrapper);
   	

}

