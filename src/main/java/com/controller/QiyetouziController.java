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

import com.entity.QiyetouziEntity;
import com.entity.view.QiyetouziView;

import com.service.QiyetouziService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 企业投资
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@RestController
@RequestMapping("/qiyetouzi")
public class QiyetouziController {
    @Autowired
    private QiyetouziService qiyetouziService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiyetouziEntity qiyetouzi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuqiye")) {
			qiyetouzi.setQiyemingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("touziqiye")) {
			qiyetouzi.setTouzizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiyetouziEntity> ew = new EntityWrapper<QiyetouziEntity>();


		PageUtils page = qiyetouziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyetouzi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiyetouziEntity qiyetouzi, 
		HttpServletRequest request){
        EntityWrapper<QiyetouziEntity> ew = new EntityWrapper<QiyetouziEntity>();

		PageUtils page = qiyetouziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyetouzi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiyetouziEntity qiyetouzi){
       	EntityWrapper<QiyetouziEntity> ew = new EntityWrapper<QiyetouziEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiyetouzi, "qiyetouzi")); 
        return R.ok().put("data", qiyetouziService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiyetouziEntity qiyetouzi){
        EntityWrapper< QiyetouziEntity> ew = new EntityWrapper< QiyetouziEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiyetouzi, "qiyetouzi")); 
		QiyetouziView qiyetouziView =  qiyetouziService.selectView(ew);
		return R.ok("查询企业投资成功").put("data", qiyetouziView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiyetouziEntity qiyetouzi = qiyetouziService.selectById(id);
        return R.ok().put("data", qiyetouzi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiyetouziEntity qiyetouzi = qiyetouziService.selectById(id);
        return R.ok().put("data", qiyetouzi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiyetouziEntity qiyetouzi, HttpServletRequest request){
    	qiyetouzi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyetouzi);

        qiyetouziService.insert(qiyetouzi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiyetouziEntity qiyetouzi, HttpServletRequest request){
    	qiyetouzi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyetouzi);

        qiyetouziService.insert(qiyetouzi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiyetouziEntity qiyetouzi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiyetouzi);
        qiyetouziService.updateById(qiyetouzi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiyetouziService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiyetouziEntity> wrapper = new EntityWrapper<QiyetouziEntity>();
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

		int count = qiyetouziService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
