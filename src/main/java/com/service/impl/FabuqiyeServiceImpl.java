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


import com.dao.FabuqiyeDao;
import com.entity.FabuqiyeEntity;
import com.service.FabuqiyeService;
import com.entity.vo.FabuqiyeVO;
import com.entity.view.FabuqiyeView;

@Service("fabuqiyeService")
public class FabuqiyeServiceImpl extends ServiceImpl<FabuqiyeDao, FabuqiyeEntity> implements FabuqiyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FabuqiyeEntity> page = this.selectPage(
                new Query<FabuqiyeEntity>(params).getPage(),
                new EntityWrapper<FabuqiyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FabuqiyeEntity> wrapper) {
		  Page<FabuqiyeView> page =new Query<FabuqiyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FabuqiyeVO> selectListVO(Wrapper<FabuqiyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FabuqiyeVO selectVO(Wrapper<FabuqiyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FabuqiyeView> selectListView(Wrapper<FabuqiyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FabuqiyeView selectView(Wrapper<FabuqiyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
