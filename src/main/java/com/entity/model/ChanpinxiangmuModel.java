package com.entity.model;

import com.entity.ChanpinxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 产品项目
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
public class ChanpinxiangmuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
