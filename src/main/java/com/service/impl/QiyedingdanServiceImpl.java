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


import com.dao.QiyedingdanDao;
import com.entity.QiyedingdanEntity;
import com.service.QiyedingdanService;
import com.entity.vo.QiyedingdanVO;
import com.entity.view.QiyedingdanView;

@Service("qiyedingdanService")
public class QiyedingdanServiceImpl extends ServiceImpl<QiyedingdanDao, QiyedingdanEntity> implements QiyedingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyedingdanEntity> page = this.selectPage(
                new Query<QiyedingdanEntity>(params).getPage(),
                new EntityWrapper<QiyedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyedingdanEntity> wrapper) {
		  Page<QiyedingdanView> page =new Query<QiyedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyedingdanVO> selectListVO(Wrapper<QiyedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyedingdanVO selectVO(Wrapper<QiyedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyedingdanView> selectListView(Wrapper<QiyedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyedingdanView selectView(Wrapper<QiyedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
