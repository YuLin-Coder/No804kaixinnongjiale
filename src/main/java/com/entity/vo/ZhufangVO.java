package com.entity.vo;

import com.entity.ZhufangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 住房
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("zhufang")
public class ZhufangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
