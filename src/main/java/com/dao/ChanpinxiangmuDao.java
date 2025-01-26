package com.dao;

import com.entity.ChanpinxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinxiangmuVO;
import com.entity.view.ChanpinxiangmuView;


/**
 * 产品项目
 * 
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public interface ChanpinxiangmuDao extends BaseMapper<ChanpinxiangmuEntity> {
	
	List<ChanpinxiangmuVO> selectListVO(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
	
	ChanpinxiangmuVO selectVO(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
	
	List<ChanpinxiangmuView> selectListView(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);

	List<ChanpinxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
	
	ChanpinxiangmuView selectView(@Param("ew") Wrapper<ChanpinxiangmuEntity> wrapper);
	

}
