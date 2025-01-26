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


import com.dao.GetidingdanDao;
import com.entity.GetidingdanEntity;
import com.service.GetidingdanService;
import com.entity.vo.GetidingdanVO;
import com.entity.view.GetidingdanView;

@Service("getidingdanService")
public class GetidingdanServiceImpl extends ServiceImpl<GetidingdanDao, GetidingdanEntity> implements GetidingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GetidingdanEntity> page = this.selectPage(
                new Query<GetidingdanEntity>(params).getPage(),
                new EntityWrapper<GetidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GetidingdanEntity> wrapper) {
		  Page<GetidingdanView> page =new Query<GetidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GetidingdanVO> selectListVO(Wrapper<GetidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GetidingdanVO selectVO(Wrapper<GetidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GetidingdanView> selectListView(Wrapper<GetidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GetidingdanView selectView(Wrapper<GetidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
