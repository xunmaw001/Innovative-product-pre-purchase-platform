package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschanpinxiangmuEntity;
import com.entity.view.DiscusschanpinxiangmuView;

import com.service.DiscusschanpinxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 产品项目评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@RestController
@RequestMapping("/discusschanpinxiangmu")
public class DiscusschanpinxiangmuController {
    @Autowired
    private DiscusschanpinxiangmuService discusschanpinxiangmuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschanpinxiangmuEntity discusschanpinxiangmu, 
		HttpServletRequest request){

        EntityWrapper<DiscusschanpinxiangmuEntity> ew = new EntityWrapper<DiscusschanpinxiangmuEntity>();


		PageUtils page = discusschanpinxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschanpinxiangmu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschanpinxiangmuEntity discusschanpinxiangmu, 
		HttpServletRequest request){
        EntityWrapper<DiscusschanpinxiangmuEntity> ew = new EntityWrapper<DiscusschanpinxiangmuEntity>();

		PageUtils page = discusschanpinxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschanpinxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschanpinxiangmuEntity discusschanpinxiangmu){
       	EntityWrapper<DiscusschanpinxiangmuEntity> ew = new EntityWrapper<DiscusschanpinxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschanpinxiangmu, "discusschanpinxiangmu")); 
        return R.ok().put("data", discusschanpinxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschanpinxiangmuEntity discusschanpinxiangmu){
        EntityWrapper< DiscusschanpinxiangmuEntity> ew = new EntityWrapper< DiscusschanpinxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschanpinxiangmu, "discusschanpinxiangmu")); 
		DiscusschanpinxiangmuView discusschanpinxiangmuView =  discusschanpinxiangmuService.selectView(ew);
		return R.ok("查询产品项目评论表成功").put("data", discusschanpinxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschanpinxiangmuEntity discusschanpinxiangmu = discusschanpinxiangmuService.selectById(id);
        return R.ok().put("data", discusschanpinxiangmu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschanpinxiangmuEntity discusschanpinxiangmu = discusschanpinxiangmuService.selectById(id);
        return R.ok().put("data", discusschanpinxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschanpinxiangmuEntity discusschanpinxiangmu, HttpServletRequest request){
    	discusschanpinxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschanpinxiangmu);

        discusschanpinxiangmuService.insert(discusschanpinxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschanpinxiangmuEntity discusschanpinxiangmu, HttpServletRequest request){
    	discusschanpinxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschanpinxiangmu);

        discusschanpinxiangmuService.insert(discusschanpinxiangmu);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusschanpinxiangmuEntity discusschanpinxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschanpinxiangmu);
        discusschanpinxiangmuService.updateById(discusschanpinxiangmu);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschanpinxiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusschanpinxiangmuEntity> wrapper = new EntityWrapper<DiscusschanpinxiangmuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschanpinxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
