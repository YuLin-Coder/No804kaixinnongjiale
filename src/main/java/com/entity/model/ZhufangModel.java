package com.entity.model;

import com.entity.ZhufangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 住房
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-10
 */
public class ZhufangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 类型
     */
    private Integer leixingTypes;


    /**
     * 住房图片
     */
    private String zhufangPhoto;


    /**
     * 住房详情
     */
    private String zhufangContent;


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
	 * 获取：住房编号
	 */
    public String getZhufangName() {
        return zhufangName;
    }


    /**
	 * 设置：住房编号
	 */
    public void setZhufangName(String zhufangName) {
        this.zhufangName = zhufangName;
    }
    /**
	 * 获取：住房价格（天）
	 */
    public Integer getZhufangMoney() {
        return zhufangMoney;
    }


    /**
	 * 设置：住房价格（天）
	 */
    public void setZhufangMoney(Integer zhufangMoney) {
        this.zhufangMoney = zhufangMoney;
    }
    /**
	 * 获取：住房类型
	 */
    public Integer getZhufangTypes() {
        return zhufangTypes;
    }


    /**
	 * 设置：住房类型
	 */
    public void setZhufangTypes(Integer zhufangTypes) {
        this.zhufangTypes = zhufangTypes;
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
	 * 获取：住房图片
	 */
    public String getZhufangPhoto() {
        return zhufangPhoto;
    }


    /**
	 * 设置：住房图片
	 */
    public void setZhufangPhoto(String zhufangPhoto) {
        this.zhufangPhoto = zhufangPhoto;
    }
    /**
	 * 获取：住房详情
	 */
    public String getZhufangContent() {
        return zhufangContent;
    }


    /**
	 * 设置：住房详情
	 */
    public void setZhufangContent(String zhufangContent) {
        this.zhufangContent = zhufangContent;
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
