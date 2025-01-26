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

import com.entity.GetidingdanEntity;
import com.entity.view.GetidingdanView;

import com.service.GetidingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 个体订单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@RestController
@RequestMapping("/getidingdan")
public class GetidingdanController {
    @Autowired
    private GetidingdanService getidingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GetidingdanEntity getidingdan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuqiye")) {
			getidingdan.setQiyemingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("geti")) {
			getidingdan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GetidingdanEntity> ew = new EntityWrapper<GetidingdanEntity>();

                if(fahuoriqistart!=null) ew.ge("fahuoriqi", fahuoriqistart);
                if(fahuoriqiend!=null) ew.le("fahuoriqi", fahuoriqiend);

		PageUtils page = getidingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, getidingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GetidingdanEntity getidingdan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqiend,
		HttpServletRequest request){
        EntityWrapper<GetidingdanEntity> ew = new EntityWrapper<GetidingdanEntity>();
                if(fahuoriqistart!=null) ew.ge("fahuoriqi", fahuoriqistart);
                if(fahuoriqiend!=null) ew.le("fahuoriqi", fahuoriqiend);

		PageUtils page = getidingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, getidingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GetidingdanEntity getidingdan){
       	EntityWrapper<GetidingdanEntity> ew = new EntityWrapper<GetidingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( getidingdan, "getidingdan")); 
        return R.ok().put("data", getidingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GetidingdanEntity getidingdan){
        EntityWrapper< GetidingdanEntity> ew = new EntityWrapper< GetidingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( getidingdan, "getidingdan")); 
		GetidingdanView getidingdanView =  getidingdanService.selectView(ew);
		return R.ok("查询个体订单成功").put("data", getidingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GetidingdanEntity getidingdan = getidingdanService.selectById(id);
        return R.ok().put("data", getidingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GetidingdanEntity getidingdan = getidingdanService.selectById(id);
        return R.ok().put("data", getidingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GetidingdanEntity getidingdan, HttpServletRequest request){
    	getidingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(getidingdan);

        getidingdanService.insert(getidingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GetidingdanEntity getidingdan, HttpServletRequest request){
    	getidingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(getidingdan);

        getidingdanService.insert(getidingdan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GetidingdanEntity getidingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(getidingdan);
        getidingdanService.updateById(getidingdan);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        getidingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GetidingdanEntity> wrapper = new EntityWrapper<GetidingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuqiye")) {
			wrapper.eq("qiyemingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("geti")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = getidingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
