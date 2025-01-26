package com.entity.view;

import com.entity.QiyedingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@TableName("qiyedingdan")
public class QiyedingdanView  extends QiyedingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyedingdanView(){
	}
 
 	public QiyedingdanView(QiyedingdanEntity qiyedingdanEntity){
 	try {
			BeanUtils.copyProperties(this, qiyedingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
