package com.dao;

import com.entity.DiscusschanpinxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpinxiangmuVO;
import com.entity.view.DiscusschanpinxiangmuView;


/**
 * 产品项目评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public interface DiscusschanpinxiangmuDao extends BaseMapper<DiscusschanpinxiangmuEntity> {
	
	List<DiscusschanpinxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
	
	DiscusschanpinxiangmuVO selectVO(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
	
	List<DiscusschanpinxiangmuView> selectListView(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);

	List<DiscusschanpinxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
	
	DiscusschanpinxiangmuView selectView(@Param("ew") Wrapper<DiscusschanpinxiangmuEntity> wrapper);
	

}
