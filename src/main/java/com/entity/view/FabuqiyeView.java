package com.entity.view;

import com.entity.FabuqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发布企业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
@TableName("fabuqiye")
public class FabuqiyeView  extends FabuqiyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FabuqiyeView(){
	}
 
 	public FabuqiyeView(FabuqiyeEntity fabuqiyeEntity){
 	try {
			BeanUtils.copyProperties(this, fabuqiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
