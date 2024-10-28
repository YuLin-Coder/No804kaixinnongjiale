package com.entity.model;

import com.entity.YouwanxiangmuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 游玩项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-10
 */
public class YouwanxiangmuOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约用户
     */
    private Integer yonghuId;


    /**
     * 预约游玩项目
     */
    private Integer youwanxiangmuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuyueOrderTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：预约用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约游玩项目
	 */
    public Integer getYouwanxiangmuId() {
        return youwanxiangmuId;
    }


    /**
	 * 设置：预约游玩项目
	 */
    public void setYouwanxiangmuId(Integer youwanxiangmuId) {
        this.youwanxiangmuId = youwanxiangmuId;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYuyueOrderTime() {
        return yuyueOrderTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYuyueOrderTime(Date yuyueOrderTime) {
        this.yuyueOrderTime = yuyueOrderTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
