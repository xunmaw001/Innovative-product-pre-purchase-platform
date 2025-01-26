package com.entity.view;

import com.entity.DiscusschanpinxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 11:32:52
 */
@TableName("discusschanpinxiangmu")
public class DiscusschanpinxiangmuView  extends DiscusschanpinxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschanpinxiangmuView(){
	}
 
 	public DiscusschanpinxiangmuView(DiscusschanpinxiangmuEntity discusschanpinxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discusschanpinxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
