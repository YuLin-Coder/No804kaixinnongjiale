package com.entity.vo;

import com.entity.ZhufangOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 住房预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang_order")
public class ZhufangOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "yuyue_order_time")
    private Date yuyueOrderTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
