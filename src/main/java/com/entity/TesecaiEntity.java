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
 * 特色菜
 *
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("tesecai")
public class TesecaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TesecaiEntity() {

	}

	public TesecaiEntity(T t) {
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
     * 菜品名称
     */
    @TableField(value = "tesecai_name")

    private String tesecaiName;


    /**
     * 菜品价格
     */
    @TableField(value = "tesecai_money")

    private Integer tesecaiMoney;


    /**
     * 菜品口味
     */
    @TableField(value = "kouwei_types")

    private Integer kouweiTypes;


    /**
     * 类型
     */
    @TableField(value = "leixing_types")

    private Integer leixingTypes;


    /**
     * 菜品图片
     */
    @TableField(value = "tesecai_photo")

    private String tesecaiPhoto;


    /**
     * 菜品详情
     */
    @TableField(value = "tesecai_content")

    private String tesecaiContent;


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
	 * 设置：菜品名称
	 */
    public String getTesecaiName() {
        return tesecaiName;
    }


    /**
	 * 获取：菜品名称
	 */

    public void setTesecaiName(String tesecaiName) {
        this.tesecaiName = tesecaiName;
    }
    /**
	 * 设置：菜品价格
	 */
    public Integer getTesecaiMoney() {
        return tesecaiMoney;
    }


    /**
	 * 获取：菜品价格
	 */

    public void setTesecaiMoney(Integer tesecaiMoney) {
        this.tesecaiMoney = tesecaiMoney;
    }
    /**
	 * 设置：菜品口味
	 */
    public Integer getKouweiTypes() {
        return kouweiTypes;
    }


    /**
	 * 获取：菜品口味
	 */

    public void setKouweiTypes(Integer kouweiTypes) {
        this.kouweiTypes = kouweiTypes;
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
	 * 设置：菜品图片
	 */
    public String getTesecaiPhoto() {
        return tesecaiPhoto;
    }


    /**
	 * 获取：菜品图片
	 */

    public void setTesecaiPhoto(String tesecaiPhoto) {
        this.tesecaiPhoto = tesecaiPhoto;
    }
    /**
	 * 设置：菜品详情
	 */
    public String getTesecaiContent() {
        return tesecaiContent;
    }


    /**
	 * 获取：菜品详情
	 */

    public void setTesecaiContent(String tesecaiContent) {
        this.tesecaiContent = tesecaiContent;
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
        return "Tesecai{" +
            "id=" + id +
            ", tesecaiName=" + tesecaiName +
            ", tesecaiMoney=" + tesecaiMoney +
            ", kouweiTypes=" + kouweiTypes +
            ", leixingTypes=" + leixingTypes +
            ", tesecaiPhoto=" + tesecaiPhoto +
            ", tesecaiContent=" + tesecaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
