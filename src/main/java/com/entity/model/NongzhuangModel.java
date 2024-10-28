package com.entity.model;

import com.entity.NongzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 农庄
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-10
 */
public class NongzhuangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 农庄名称
     */
    private String nongzhuangName;


    /**
     * 农庄面积
     */
    private String nongzhuangMianji;


    /**
     * 农庄图片
     */
    private String nongzhuangPhoto;


    /**
     * 餐桌数量
     */
    private Integer nongzhuangChanzuo;


    /**
     * 住房数量
     */
    private Integer nongzhuangZhufang;


    /**
     * 住房数量
     */
    private String nongzhuangXiangmu;


    /**
     * 联系方式
     */
    private String nongzhuangPhone;


    /**
     * 详情信息
     */
    private String nongzhuangContent;


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
	 * 获取：农庄名称
	 */
    public String getNongzhuangName() {
        return nongzhuangName;
    }


    /**
	 * 设置：农庄名称
	 */
    public void setNongzhuangName(String nongzhuangName) {
        this.nongzhuangName = nongzhuangName;
    }
    /**
	 * 获取：农庄面积
	 */
    public String getNongzhuangMianji() {
        return nongzhuangMianji;
    }


    /**
	 * 设置：农庄面积
	 */
    public void setNongzhuangMianji(String nongzhuangMianji) {
        this.nongzhuangMianji = nongzhuangMianji;
    }
    /**
	 * 获取：农庄图片
	 */
    public String getNongzhuangPhoto() {
        return nongzhuangPhoto;
    }


    /**
	 * 设置：农庄图片
	 */
    public void setNongzhuangPhoto(String nongzhuangPhoto) {
        this.nongzhuangPhoto = nongzhuangPhoto;
    }
    /**
	 * 获取：餐桌数量
	 */
    public Integer getNongzhuangChanzuo() {
        return nongzhuangChanzuo;
    }


    /**
	 * 设置：餐桌数量
	 */
    public void setNongzhuangChanzuo(Integer nongzhuangChanzuo) {
        this.nongzhuangChanzuo = nongzhuangChanzuo;
    }
    /**
	 * 获取：住房数量
	 */
    public Integer getNongzhuangZhufang() {
        return nongzhuangZhufang;
    }


    /**
	 * 设置：住房数量
	 */
    public void setNongzhuangZhufang(Integer nongzhuangZhufang) {
        this.nongzhuangZhufang = nongzhuangZhufang;
    }
    /**
	 * 获取：住房数量
	 */
    public String getNongzhuangXiangmu() {
        return nongzhuangXiangmu;
    }


    /**
	 * 设置：住房数量
	 */
    public void setNongzhuangXiangmu(String nongzhuangXiangmu) {
        this.nongzhuangXiangmu = nongzhuangXiangmu;
    }
    /**
	 * 获取：联系方式
	 */
    public String getNongzhuangPhone() {
        return nongzhuangPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setNongzhuangPhone(String nongzhuangPhone) {
        this.nongzhuangPhone = nongzhuangPhone;
    }
    /**
	 * 获取：详情信息
	 */
    public String getNongzhuangContent() {
        return nongzhuangContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setNongzhuangContent(String nongzhuangContent) {
        this.nongzhuangContent = nongzhuangContent;
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
