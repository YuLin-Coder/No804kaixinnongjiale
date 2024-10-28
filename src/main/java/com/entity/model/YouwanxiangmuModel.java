package com.entity.model;

import com.entity.YouwanxiangmuEntity;

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
public class YouwanxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 项目图片
     */
    private String youwanxiangmuPhoto;


    /**
     * 项目详情
     */
    private String youwanxiangmuContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：项目名称
	 */
    public String getYouwanxiangmuName() {
        return youwanxiangmuName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setYouwanxiangmuName(String youwanxiangmuName) {
        this.youwanxiangmuName = youwanxiangmuName;
    }
    /**
	 * 获取：项目价格
	 */
    public Integer getYouwanxiangmuMoney() {
        return youwanxiangmuMoney;
    }


    /**
	 * 设置：项目价格
	 */
    public void setYouwanxiangmuMoney(Integer youwanxiangmuMoney) {
        this.youwanxiangmuMoney = youwanxiangmuMoney;
    }
    /**
	 * 获取：类型
	 */
    public Integer getLeixingTypes() {
        return leixingTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setLeixingTypes(Integer leixingTypes) {
        this.leixingTypes = leixingTypes;
    }
    /**
	 * 获取：项目图片
	 */
    public String getYouwanxiangmuPhoto() {
        return youwanxiangmuPhoto;
    }


    /**
	 * 设置：项目图片
	 */
    public void setYouwanxiangmuPhoto(String youwanxiangmuPhoto) {
        this.youwanxiangmuPhoto = youwanxiangmuPhoto;
    }
    /**
	 * 获取：项目详情
	 */
    public String getYouwanxiangmuContent() {
        return youwanxiangmuContent;
    }


    /**
	 * 设置：项目详情
	 */
    public void setYouwanxiangmuContent(String youwanxiangmuContent) {
        this.youwanxiangmuContent = youwanxiangmuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
