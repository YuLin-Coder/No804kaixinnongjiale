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
 * 住房预约
 *
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang_order")
public class ZhufangOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhufangOrderEntity() {

	}

	public ZhufangOrderEntity(T t) {
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
     * 预约用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约住房
     */
    @TableField(value = "zhufang_id")

    private Integer zhufangId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuyue_order_time",fill = FieldFill.UPDATE)

    private Date yuyueOrderTime;


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
	 * 设置：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：预约用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约住房
	 */
    public Integer getZhufangId() {
        return zhufangId;
    }


    /**
	 * 获取：预约住房
	 */

    public void setZhufangId(Integer zhufangId) {
        this.zhufangId = zhufangId;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYuyueOrderTime() {
        return yuyueOrderTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYuyueOrderTime(Date yuyueOrderTime) {
        this.yuyueOrderTime = yuyueOrderTime;
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
        return "ZhufangOrder{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhufangId=" + zhufangId +
            ", yuyueOrderTime=" + yuyueOrderTime +
            ", createTime=" + createTime +
        "}";
    }
}
