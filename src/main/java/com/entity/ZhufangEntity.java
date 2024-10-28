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
 * 住房
 *
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang")
public class ZhufangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhufangEntity() {

	}

	public ZhufangEntity(T t) {
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
     * 住房编号
     */
    @TableField(value = "zhufang_name")

    private String zhufangName;


    /**
     * 住房价格（天）
     */
    @TableField(value = "zhufang_money")

    private Integer zhufangMoney;


    /**
     * 住房类型
     */
    @TableField(value = "zhufang_types")

    private Integer zhufangTypes;


    /**
     * 类型
     */
    @TableField(value = "leixing_types")

    private Integer leixingTypes;


    /**
     * 住房图片
     */
    @TableField(value = "zhufang_photo")

    private String zhufangPhoto;


    /**
     * 住房详情
     */
    @TableField(value = "zhufang_content")

    private String zhufangContent;


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
	 * 设置：住房编号
	 */
    public String getZhufangName() {
        return zhufangName;
    }


    /**
	 * 获取：住房编号
	 */

    public void setZhufangName(String zhufangName) {
        this.zhufangName = zhufangName;
    }
    /**
	 * 设置：住房价格（天）
	 */
    public Integer getZhufangMoney() {
        return zhufangMoney;
    }


    /**
	 * 获取：住房价格（天）
	 */

    public void setZhufangMoney(Integer zhufangMoney) {
        this.zhufangMoney = zhufangMoney;
    }
    /**
	 * 设置：住房类型
	 */
    public Integer getZhufangTypes() {
        return zhufangTypes;
    }


    /**
	 * 获取：住房类型
	 */

    public void setZhufangTypes(Integer zhufangTypes) {
        this.zhufangTypes = zhufangTypes;
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
	 * 设置：住房图片
	 */
    public String getZhufangPhoto() {
        return zhufangPhoto;
    }


    /**
	 * 获取：住房图片
	 */

    public void setZhufangPhoto(String zhufangPhoto) {
        this.zhufangPhoto = zhufangPhoto;
    }
    /**
	 * 设置：住房详情
	 */
    public String getZhufangContent() {
        return zhufangContent;
    }


    /**
	 * 获取：住房详情
	 */

    public void setZhufangContent(String zhufangContent) {
        this.zhufangContent = zhufangContent;
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
        return "Zhufang{" +
            "id=" + id +
            ", zhufangName=" + zhufangName +
            ", zhufangMoney=" + zhufangMoney +
            ", zhufangTypes=" + zhufangTypes +
            ", leixingTypes=" + leixingTypes +
            ", zhufangPhoto=" + zhufangPhoto +
            ", zhufangContent=" + zhufangContent +
            ", createTime=" + createTime +
        "}";
    }
}
