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
 * 产品项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
@TableName("chanpinxiangmu")
public class ChanpinxiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChanpinxiangmuEntity() {
		
	}
	
	public ChanpinxiangmuEntity(T t) {
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
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 项目分类
	 */
					
	private String xiangmufenlei;
	
	/**
	 * 产品图片
	 */
					
	private String chanpintupian;
	
	/**
	 * 产品规格
	 */
					
	private String chanpinguige;
	
	/**
	 * 融资金额
	 */
					
	private Integer rongzijine;
	
	/**
	 * 所筹金额
	 */
					
	private Integer suochoujine;
	
	/**
	 * 生产产地
	 */
					
	private String shengchanchandi;
	
	/**
	 * 上架日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangjiariqi;
	
	/**
	 * 产品详情
	 */
					
	private String chanpinxiangqing;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：产品图片
	 */
	public void setChanpintupian(String chanpintupian) {
		this.chanpintupian = chanpintupian;
	}
	/**
	 * 获取：产品图片
	 */
	public String getChanpintupian() {
		return chanpintupian;
	}
	/**
	 * 设置：产品规格
	 */
	public void setChanpinguige(String chanpinguige) {
		this.chanpinguige = chanpinguige;
	}
	/**
	 * 获取：产品规格
	 */
	public String getChanpinguige() {
		return chanpinguige;
	}
	/**
	 * 设置：融资金额
	 */
	public void setRongzijine(Integer rongzijine) {
		this.rongzijine = rongzijine;
	}
	/**
	 * 获取：融资金额
	 */
	public Integer getRongzijine() {
		return rongzijine;
	}
	/**
	 * 设置：所筹金额
	 */
	public void setSuochoujine(Integer suochoujine) {
		this.suochoujine = suochoujine;
	}
	/**
	 * 获取：所筹金额
	 */
	public Integer getSuochoujine() {
		return suochoujine;
	}
	/**
	 * 设置：生产产地
	 */
	public void setShengchanchandi(String shengchanchandi) {
		this.shengchanchandi = shengchanchandi;
	}
	/**
	 * 获取：生产产地
	 */
	public String getShengchanchandi() {
		return shengchanchandi;
	}
	/**
	 * 设置：上架日期
	 */
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
	/**
	 * 设置：产品详情
	 */
	public void setChanpinxiangqing(String chanpinxiangqing) {
		this.chanpinxiangqing = chanpinxiangqing;
	}
	/**
	 * 获取：产品详情
	 */
	public String getChanpinxiangqing() {
		return chanpinxiangqing;
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
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
