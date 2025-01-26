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
 * 企业订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@TableName("qiyedingdan")
public class QiyedingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyedingdanEntity() {
		
	}
	
	public QiyedingdanEntity(T t) {
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
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 发货日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fahuoriqi;
	
	/**
	 * 配送进度
	 */
					
	private String peisongjindu;
	
	/**
	 * 配送备注
	 */
					
	private String peisongbeizhu;
	
	/**
	 * 投资账号
	 */
					
	private String touzizhanghao;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
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
	 * 设置：发货日期
	 */
	public void setFahuoriqi(Date fahuoriqi) {
		this.fahuoriqi = fahuoriqi;
	}
	/**
	 * 获取：发货日期
	 */
	public Date getFahuoriqi() {
		return fahuoriqi;
	}
	/**
	 * 设置：配送进度
	 */
	public void setPeisongjindu(String peisongjindu) {
		this.peisongjindu = peisongjindu;
	}
	/**
	 * 获取：配送进度
	 */
	public String getPeisongjindu() {
		return peisongjindu;
	}
	/**
	 * 设置：配送备注
	 */
	public void setPeisongbeizhu(String peisongbeizhu) {
		this.peisongbeizhu = peisongbeizhu;
	}
	/**
	 * 获取：配送备注
	 */
	public String getPeisongbeizhu() {
		return peisongbeizhu;
	}
	/**
	 * 设置：投资账号
	 */
	public void setTouzizhanghao(String touzizhanghao) {
		this.touzizhanghao = touzizhanghao;
	}
	/**
	 * 获取：投资账号
	 */
	public String getTouzizhanghao() {
		return touzizhanghao;
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

}
