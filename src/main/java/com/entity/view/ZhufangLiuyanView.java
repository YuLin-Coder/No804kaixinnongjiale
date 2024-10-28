package com.entity.view;

import com.entity.ZhufangLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 住房留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang_liuyan")
public class ZhufangLiuyanView extends ZhufangLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 口味
			*/
			private Integer kouweiTypes;
				/**
				* 口味的值
				*/
				private String kouweiValue;

		//级联表 zhufang
			/**
			* 住房编号
			*/
			private String zhufangName;
			/**
			* 住房价格（天）
			*/
			private Integer zhufangMoney;
			/**
			* 住房类型
			*/
			private Integer zhufangTypes;
				/**
				* 住房类型的值
				*/
				private String zhufangValue;
			/**
			* 类型
			*/
			private Integer leixingTypes;
				/**
				* 类型的值
				*/
				private String leixingValue;
			/**
			* 住房图片
			*/
			private String zhufangPhoto;
			/**
			* 住房详情
			*/
			private String zhufangContent;

	public ZhufangLiuyanView() {

	}

	public ZhufangLiuyanView(ZhufangLiuyanEntity zhufangLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhufangLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 口味
					*/
					public Integer getKouweiTypes() {
						return kouweiTypes;
					}
					/**
					* 设置： 口味
					*/
					public void setKouweiTypes(Integer kouweiTypes) {
						this.kouweiTypes = kouweiTypes;
					}


						/**
						* 获取： 口味的值
						*/
						public String getKouweiValue() {
							return kouweiValue;
						}
						/**
						* 设置： 口味的值
						*/
						public void setKouweiValue(String kouweiValue) {
							this.kouweiValue = kouweiValue;
						}











				//级联表的get和set zhufang
					/**
					* 获取： 住房编号
					*/
					public String getZhufangName() {
						return zhufangName;
					}
					/**
					* 设置： 住房编号
					*/
					public void setZhufangName(String zhufangName) {
						this.zhufangName = zhufangName;
					}
					/**
					* 获取： 住房价格（天）
					*/
					public Integer getZhufangMoney() {
						return zhufangMoney;
					}
					/**
					* 设置： 住房价格（天）
					*/
					public void setZhufangMoney(Integer zhufangMoney) {
						this.zhufangMoney = zhufangMoney;
					}
					/**
					* 获取： 住房类型
					*/
					public Integer getZhufangTypes() {
						return zhufangTypes;
					}
					/**
					* 设置： 住房类型
					*/
					public void setZhufangTypes(Integer zhufangTypes) {
						this.zhufangTypes = zhufangTypes;
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
					* 获取： 类型
					*/
					public Integer getLeixingTypes() {
						return leixingTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setLeixingTypes(Integer leixingTypes) {
						this.leixingTypes = leixingTypes;
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
					/**
					* 获取： 住房图片
					*/
					public String getZhufangPhoto() {
						return zhufangPhoto;
					}
					/**
					* 设置： 住房图片
					*/
					public void setZhufangPhoto(String zhufangPhoto) {
						this.zhufangPhoto = zhufangPhoto;
					}
					/**
					* 获取： 住房详情
					*/
					public String getZhufangContent() {
						return zhufangContent;
					}
					/**
					* 设置： 住房详情
					*/
					public void setZhufangContent(String zhufangContent) {
						this.zhufangContent = zhufangContent;
					}










}
