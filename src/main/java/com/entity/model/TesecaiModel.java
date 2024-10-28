package com.entity.model;

import com.entity.TesecaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 特色菜
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-10
 */
public class TesecaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 菜品名称
     */
    private String tesecaiName;


    /**
     * 菜品价格
     */
    private Integer tesecaiMoney;


    /**
     * 菜品口味
     */
    private Integer kouweiTypes;


    /**
     * 类型
     */
    private Integer leixingTypes;


    /**
     * 菜品图片
     */
    private String tesecaiPhoto;


    /**
     * 菜品详情
     */
    private String tesecaiContent;


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
	 * 获取：菜品名称
	 */
    public String getTesecaiName() {
        return tesecaiName;
    }


    /**
	 * 设置：菜品名称
	 */
    public void setTesecaiName(String tesecaiName) {
        this.tesecaiName = tesecaiName;
    }
    /**
	 * 获取：菜品价格
	 */
    public Integer getTesecaiMoney() {
        return tesecaiMoney;
    }


    /**
	 * 设置：菜品价格
	 */
    public void setTesecaiMoney(Integer tesecaiMoney) {
        this.tesecaiMoney = tesecaiMoney;
    }
    /**
	 * 获取：菜品口味
	 */
    public Integer getKouweiTypes() {
        return kouweiTypes;
    }


    /**
	 * 设置：菜品口味
	 */
    public void setKouweiTypes(Integer kouweiTypes) {
        this.kouweiTypes = kouweiTypes;
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
	 * 获取：菜品图片
	 */
    public String getTesecaiPhoto() {
        return tesecaiPhoto;
    }


    /**
	 * 设置：菜品图片
	 */
    public void setTesecaiPhoto(String tesecaiPhoto) {
        this.tesecaiPhoto = tesecaiPhoto;
    }
    /**
	 * 获取：菜品详情
	 */
    public String getTesecaiContent() {
        return tesecaiContent;
    }


    /**
	 * 设置：菜品详情
	 */
    public void setTesecaiContent(String tesecaiContent) {
        this.tesecaiContent = tesecaiContent;
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
