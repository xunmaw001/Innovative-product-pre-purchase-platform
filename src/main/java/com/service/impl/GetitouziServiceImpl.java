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


import com.dao.GetitouziDao;
import com.entity.GetitouziEntity;
import com.service.GetitouziService;
import com.entity.vo.GetitouziVO;
import com.entity.view.GetitouziView;

@Service("getitouziService")
public class GetitouziServiceImpl extends ServiceImpl<GetitouziDao, GetitouziEntity> implements GetitouziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GetitouziEntity> page = this.selectPage(
                new Query<GetitouziEntity>(params).getPage(),
                new EntityWrapper<GetitouziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GetitouziEntity> wrapper) {
		  Page<GetitouziView> page =new Query<GetitouziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GetitouziVO> selectListVO(Wrapper<GetitouziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GetitouziVO selectVO(Wrapper<GetitouziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GetitouziView> selectListView(Wrapper<GetitouziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GetitouziView selectView(Wrapper<GetitouziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
