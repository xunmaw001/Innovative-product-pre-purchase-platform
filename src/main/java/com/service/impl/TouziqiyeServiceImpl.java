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


import com.dao.TouziqiyeDao;
import com.entity.TouziqiyeEntity;
import com.service.TouziqiyeService;
import com.entity.vo.TouziqiyeVO;
import com.entity.view.TouziqiyeView;

@Service("touziqiyeService")
public class TouziqiyeServiceImpl extends ServiceImpl<TouziqiyeDao, TouziqiyeEntity> implements TouziqiyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TouziqiyeEntity> page = this.selectPage(
                new Query<TouziqiyeEntity>(params).getPage(),
                new EntityWrapper<TouziqiyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TouziqiyeEntity> wrapper) {
		  Page<TouziqiyeView> page =new Query<TouziqiyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TouziqiyeVO> selectListVO(Wrapper<TouziqiyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TouziqiyeVO selectVO(Wrapper<TouziqiyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TouziqiyeView> selectListView(Wrapper<TouziqiyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TouziqiyeView selectView(Wrapper<TouziqiyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
