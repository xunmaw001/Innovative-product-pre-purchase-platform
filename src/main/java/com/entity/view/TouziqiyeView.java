package com.entity.view;

import com.entity.TouziqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投资企业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:51
 */
@TableName("touziqiye")
public class TouziqiyeView  extends TouziqiyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TouziqiyeView(){
	}
 
 	public TouziqiyeView(TouziqiyeEntity touziqiyeEntity){
 	try {
			BeanUtils.copyProperties(this, touziqiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
