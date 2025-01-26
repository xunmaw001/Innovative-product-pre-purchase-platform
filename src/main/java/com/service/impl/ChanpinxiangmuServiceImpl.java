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


import com.dao.ChanpinxiangmuDao;
import com.entity.ChanpinxiangmuEntity;
import com.service.ChanpinxiangmuService;
import com.entity.vo.ChanpinxiangmuVO;
import com.entity.view.ChanpinxiangmuView;

@Service("chanpinxiangmuService")
public class ChanpinxiangmuServiceImpl extends ServiceImpl<ChanpinxiangmuDao, ChanpinxiangmuEntity> implements ChanpinxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinxiangmuEntity> page = this.selectPage(
                new Query<ChanpinxiangmuEntity>(params).getPage(),
                new EntityWrapper<ChanpinxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinxiangmuEntity> wrapper) {
		  Page<ChanpinxiangmuView> page =new Query<ChanpinxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinxiangmuVO> selectListVO(Wrapper<ChanpinxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinxiangmuVO selectVO(Wrapper<ChanpinxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinxiangmuView> selectListView(Wrapper<ChanpinxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinxiangmuView selectView(Wrapper<ChanpinxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
