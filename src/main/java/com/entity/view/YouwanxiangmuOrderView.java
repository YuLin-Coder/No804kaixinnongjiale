package com.entity.view;

import com.entity.YouwanxiangmuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 游玩项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("youwanxiangmu_order")
public class YouwanxiangmuOrderView extends YouwanxiangmuOrderEntity implements Serializable {
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

		//级联表 youwanxiangmu
			/**
			* 项目名称
			*/
			private String youwanxiangmuName;
			/**
			* 项目价格
			*/
			private Integer youwanxiangmuMoney;
			/**
			* 类型
			*/
			private Integer leixingTypes;
				/**
				* 类型的值
				*/
				private String leixingValue;
			/**
			* 项目图片
			*/
			private String youwanxiangmuPhoto;
			/**
			* 项目详情
			*/
			private String youwanxiangmuContent;

	public YouwanxiangmuOrderView() {

	}

	public YouwanxiangmuOrderView(YouwanxiangmuOrderEntity youwanxiangmuOrderEntity) {
		try {
			BeanUtils.copyProperties(this, youwanxiangmuOrderEntity);
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




				//级联表的get和set youwanxiangmu
					/**
					* 获取： 项目名称
					*/
					public String getYouwanxiangmuName() {
						return youwanxiangmuName;
					}
					/**
					* 设置： 项目名称
					*/
					public void setYouwanxiangmuName(String youwanxiangmuName) {
						this.youwanxiangmuName = youwanxiangmuName;
					}
					/**
					* 获取： 项目价格
					*/
					public Integer getYouwanxiangmuMoney() {
						return youwanxiangmuMoney;
					}
					/**
					* 设置： 项目价格
					*/
					public void setYouwanxiangmuMoney(Integer youwanxiangmuMoney) {
						this.youwanxiangmuMoney = youwanxiangmuMoney;
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
					* 获取： 项目图片
					*/
					public String getYouwanxiangmuPhoto() {
						return youwanxiangmuPhoto;
					}
					/**
					* 设置： 项目图片
					*/
					public void setYouwanxiangmuPhoto(String youwanxiangmuPhoto) {
						this.youwanxiangmuPhoto = youwanxiangmuPhoto;
					}
					/**
					* 获取： 项目详情
					*/
					public String getYouwanxiangmuContent() {
						return youwanxiangmuContent;
					}
					/**
					* 设置： 项目详情
					*/
					public void setYouwanxiangmuContent(String youwanxiangmuContent) {
						this.youwanxiangmuContent = youwanxiangmuContent;
					}


















}
