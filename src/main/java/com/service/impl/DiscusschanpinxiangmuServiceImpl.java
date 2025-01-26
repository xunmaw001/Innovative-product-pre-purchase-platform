package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschanpinxiangmuDao;
import com.entity.DiscusschanpinxiangmuEntity;
import com.service.DiscusschanpinxiangmuService;
import com.entity.vo.DiscusschanpinxiangmuVO;
import com.entity.view.DiscusschanpinxiangmuView;

@Service("discusschanpinxiangmuService")
public class DiscusschanpinxiangmuServiceImpl extends ServiceImpl<DiscusschanpinxiangmuDao, DiscusschanpinxiangmuEntity> implements DiscusschanpinxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschanpinxiangmuEntity> page = this.selectPage(
                new Query<DiscusschanpinxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscusschanpinxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschanpinxiangmuEntity> wrapper) {
		  Page<DiscusschanpinxiangmuView> page =new Query<DiscusschanpinxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschanpinxiangmuVO> selectListVO(Wrapper<DiscusschanpinxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschanpinxiangmuVO selectVO(Wrapper<DiscusschanpinxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschanpinxiangmuView> selectListView(Wrapper<DiscusschanpinxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschanpinxiangmuView selectView(Wrapper<DiscusschanpinxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
