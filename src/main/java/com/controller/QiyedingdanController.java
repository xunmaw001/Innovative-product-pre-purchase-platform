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

import com.entity.QiyedingdanEntity;
import com.entity.view.QiyedingdanView;

import com.service.QiyedingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 企业订单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@RestController
@RequestMapping("/qiyedingdan")
public class QiyedingdanController {
    @Autowired
    private QiyedingdanService qiyedingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiyedingdanEntity qiyedingdan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuqiye")) {
			qiyedingdan.setQiyemingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("touziqiye")) {
			qiyedingdan.setTouzizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiyedingdanEntity> ew = new EntityWrapper<QiyedingdanEntity>();

                if(fahuoriqistart!=null) ew.ge("fahuoriqi", fahuoriqistart);
                if(fahuoriqiend!=null) ew.le("fahuoriqi", fahuoriqiend);

		PageUtils page = qiyedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyedingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiyedingdanEntity qiyedingdan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fahuoriqiend,
		HttpServletRequest request){
        EntityWrapper<QiyedingdanEntity> ew = new EntityWrapper<QiyedingdanEntity>();
                if(fahuoriqistart!=null) ew.ge("fahuoriqi", fahuoriqistart);
                if(fahuoriqiend!=null) ew.le("fahuoriqi", fahuoriqiend);

		PageUtils page = qiyedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyedingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiyedingdanEntity qiyedingdan){
       	EntityWrapper<QiyedingdanEntity> ew = new EntityWrapper<QiyedingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiyedingdan, "qiyedingdan")); 
        return R.ok().put("data", qiyedingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiyedingdanEntity qiyedingdan){
        EntityWrapper< QiyedingdanEntity> ew = new EntityWrapper< QiyedingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiyedingdan, "qiyedingdan")); 
		QiyedingdanView qiyedingdanView =  qiyedingdanService.selectView(ew);
		return R.ok("查询企业订单成功").put("data", qiyedingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiyedingdanEntity qiyedingdan = qiyedingdanService.selectById(id);
        return R.ok().put("data", qiyedingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiyedingdanEntity qiyedingdan = qiyedingdanService.selectById(id);
        return R.ok().put("data", qiyedingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiyedingdanEntity qiyedingdan, HttpServletRequest request){
    	qiyedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyedingdan);

        qiyedingdanService.insert(qiyedingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiyedingdanEntity qiyedingdan, HttpServletRequest request){
    	qiyedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyedingdan);

        qiyedingdanService.insert(qiyedingdan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiyedingdanEntity qiyedingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiyedingdan);
        qiyedingdanService.updateById(qiyedingdan);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiyedingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiyedingdanEntity> wrapper = new EntityWrapper<QiyedingdanEntity>();
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
		if(tableName.equals("touziqiye")) {
			wrapper.eq("touzizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = qiyedingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
