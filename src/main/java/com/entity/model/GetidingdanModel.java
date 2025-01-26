package com.entity.model;

import com.entity.GetidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 个体订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
public class GetidingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
			
}
