package com.entity.view;

import com.entity.ZhufangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 住房
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang")
public class ZhufangView extends ZhufangEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 住房类型的值
		*/
		private String zhufangValue;
		/**
		* 类型的值
		*/
		private String leixingValue;



	public ZhufangView() {

	}

	public ZhufangView(ZhufangEntity zhufangEntity) {
		try {
			BeanUtils.copyProperties(this, zhufangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 住房类型的值
			*/
			public String getZhufangValue() {
				return zhufangValue;
			}
			/**
			* 设置： 住房类型的值
			*/
			public void setZhufangValue(String zhufangValue) {
				this.zhufangValue = zhufangValue;
			}
			/**
			* 获取： 类型的值
			*/
			public String getLeixingValue() {
				return leixingValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setLeixingValue(String leixingValue) {
				this.leixingValue = leixingValue;
			}














}
