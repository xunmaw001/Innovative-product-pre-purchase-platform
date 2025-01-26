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


import com.dao.QiyetouziDao;
import com.entity.QiyetouziEntity;
import com.service.QiyetouziService;
import com.entity.vo.QiyetouziVO;
import com.entity.view.QiyetouziView;

@Service("qiyetouziService")
public class QiyetouziServiceImpl extends ServiceImpl<QiyetouziDao, QiyetouziEntity> implements QiyetouziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyetouziEntity> page = this.selectPage(
                new Query<QiyetouziEntity>(params).getPage(),
                new EntityWrapper<QiyetouziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyetouziEntity> wrapper) {
		  Page<QiyetouziView> page =new Query<QiyetouziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyetouziVO> selectListVO(Wrapper<QiyetouziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyetouziVO selectVO(Wrapper<QiyetouziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyetouziView> selectListView(Wrapper<QiyetouziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyetouziView selectView(Wrapper<QiyetouziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
