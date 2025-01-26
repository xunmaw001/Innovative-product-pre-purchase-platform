package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 个体投资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@TableName("getitouzi")
public class GetitouziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GetitouziEntity() {
		
	}
	
	public GetitouziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投资单号
	 */
					
	private String touzidanhao;
	
	/**
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 项目分类
	 */
					
	private String xiangmufenlei;
	
	/**
	 * 投资金额
	 */
					
	private Integer suochoujine;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 投资日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date touziriqi;
	
	/**
	 * 信息备注
	 */
					
	private String xinxibeizhu;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 收货地址
	 */
					
	private String shouhuodizhi;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投资单号
	 */
	public void setTouzidanhao(String touzidanhao) {
		this.touzidanhao = touzidanhao;
	}
	/**
	 * 获取：投资单号
	 */
	public String getTouzidanhao() {
		return touzidanhao;
	}
	/**
	 * 设置：产品名称
	 */
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
	/**
	 * 设置：项目分类
	 */
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
	/**
	 * 设置：投资金额
	 */
	public void setSuochoujine(Integer suochoujine) {
		this.suochoujine = suochoujine;
	}
	/**
	 * 获取：投资金额
	 */
	public Integer getSuochoujine() {
		return suochoujine;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：投资日期
	 */
	public void setTouziriqi(Date touziriqi) {
		this.touziriqi = touziriqi;
	}
	/**
	 * 获取：投资日期
	 */
	public Date getTouziriqi() {
		return touziriqi;
	}
	/**
	 * 设置：信息备注
	 */
	public void setXinxibeizhu(String xinxibeizhu) {
		this.xinxibeizhu = xinxibeizhu;
	}
	/**
	 * 获取：信息备注
	 */
	public String getXinxibeizhu() {
		return xinxibeizhu;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：收货地址
	 */
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
