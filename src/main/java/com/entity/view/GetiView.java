package com.entity.view;

import com.entity.GetiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个体
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
@TableName("geti")
public class GetiView  extends GetiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GetiView(){
	}
 
 	public GetiView(GetiEntity getiEntity){
 	try {
			BeanUtils.copyProperties(this, getiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
