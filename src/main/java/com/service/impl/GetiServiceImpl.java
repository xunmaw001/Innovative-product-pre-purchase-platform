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


import com.dao.GetiDao;
import com.entity.GetiEntity;
import com.service.GetiService;
import com.entity.vo.GetiVO;
import com.entity.view.GetiView;

@Service("getiService")
public class GetiServiceImpl extends ServiceImpl<GetiDao, GetiEntity> implements GetiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GetiEntity> page = this.selectPage(
                new Query<GetiEntity>(params).getPage(),
                new EntityWrapper<GetiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GetiEntity> wrapper) {
		  Page<GetiView> page =new Query<GetiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GetiVO> selectListVO(Wrapper<GetiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GetiVO selectVO(Wrapper<GetiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GetiView> selectListView(Wrapper<GetiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GetiView selectView(Wrapper<GetiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
