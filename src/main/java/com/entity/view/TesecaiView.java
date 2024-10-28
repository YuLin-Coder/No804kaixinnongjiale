package com.entity.view;

import com.entity.TesecaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 特色菜
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("tesecai")
public class TesecaiView extends TesecaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 菜品口味的值
		*/
		private String kouweiValue;
		/**
		* 类型的值
		*/
		private String leixingValue;



	public TesecaiView() {

	}

	public TesecaiView(TesecaiEntity tesecaiEntity) {
		try {
			BeanUtils.copyProperties(this, tesecaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 菜品口味的值
			*/
			public String getKouweiValue() {
				return kouweiValue;
			}
			/**
			* 设置： 菜品口味的值
			*/
			public void setKouweiValue(String kouweiValue) {
				this.kouweiValue = kouweiValue;
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
