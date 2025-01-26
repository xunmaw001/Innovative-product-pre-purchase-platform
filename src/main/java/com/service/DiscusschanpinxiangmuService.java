package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschanpinxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschanpinxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschanpinxiangmuView;


/**
 * 产品项目评论表
 *
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface DiscusschanpinxiangmuService extends IService<DiscusschanpinxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschanpinxiangmuVO> selectListVO(Wrapper<DiscusschanpinxiangmuEntity> wrapper);
   	
   	DiscusschanpinxiangmuVO selectVO(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
   	
   	List<DiscusschanpinxiangmuView> selectListView(Wrapper<DiscusschanpinxiangmuEntity> wrapper);
   	
   	DiscusschanpinxiangmuView selectView(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschanpinxiangmuEntity> wrapper);
   	

}

