package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 游玩项目
 *
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("youwanxiangmu")
public class YouwanxiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouwanxiangmuEntity() {

	}

	public YouwanxiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目名称
     */
    @TableField(value = "youwanxiangmu_name")

    private String youwanxiangmuName;


    /**
     * 项目价格
     */
    @TableField(value = "youwanxiangmu_money")

    private Integer youwanxiangmuMoney;


    /**
     * 类型
     */
    @TableField(value = "leixing_types")

    private Integer leixingTypes;


    /**
     * 项目图片
     */
    @TableField(value = "youwanxiangmu_photo")

    private String youwanxiangmuPhoto;


    /**
     * 项目详情
     */
    @TableField(value = "youwanxiangmu_content")

    private String youwanxiangmuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：项目名称
	 */
    public String getYouwanxiangmuName() {
        return youwanxiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setYouwanxiangmuName(String youwanxiangmuName) {
        this.youwanxiangmuName = youwanxiangmuName;
    }
    /**
	 * 设置：项目价格
	 */
    public Integer getYouwanxiangmuMoney() {
        return youwanxiangmuMoney;
    }


    /**
	 * 获取：项目价格
	 */

    public void setYouwanxiangmuMoney(Integer youwanxiangmuMoney) {
        this.youwanxiangmuMoney = youwanxiangmuMoney;
    }
    /**
	 * 设置：类型
	 */
    public Integer getLeixingTypes() {
        return leixingTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setLeixingTypes(Integer leixingTypes) {
        this.leixingTypes = leixingTypes;
    }
    /**
	 * 设置：项目图片
	 */
    public String getYouwanxiangmuPhoto() {
        return youwanxiangmuPhoto;
    }


    /**
	 * 获取：项目图片
	 */

    public void setYouwanxiangmuPhoto(String youwanxiangmuPhoto) {
        this.youwanxiangmuPhoto = youwanxiangmuPhoto;
    }
    /**
	 * 设置：项目详情
	 */
    public String getYouwanxiangmuContent() {
        return youwanxiangmuContent;
    }


    /**
	 * 获取：项目详情
	 */

    public void setYouwanxiangmuContent(String youwanxiangmuContent) {
        this.youwanxiangmuContent = youwanxiangmuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Youwanxiangmu{" +
            "id=" + id +
            ", youwanxiangmuName=" + youwanxiangmuName +
            ", youwanxiangmuMoney=" + youwanxiangmuMoney +
            ", leixingTypes=" + leixingTypes +
            ", youwanxiangmuPhoto=" + youwanxiangmuPhoto +
            ", youwanxiangmuContent=" + youwanxiangmuContent +
            ", createTime=" + createTime +
        "}";
    }
}
