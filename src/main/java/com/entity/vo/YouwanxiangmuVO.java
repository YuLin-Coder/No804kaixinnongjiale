package com.entity.vo;

import com.entity.YouwanxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 游玩项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("youwanxiangmu")
public class YouwanxiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目名称
     */

    @TableField(value = "youwanxiangmu_name")
    private String youwanxiangmuName;


    /**
     * 项目价格
     */

    @TableField(value = "youwanxiangmu_money")
    private Integer youwanxiangmuMoney;


    /**
     * 类型
     */

    @TableField(value = "leixing_types")
    private Integer leixingTypes;


    /**
     * 项目图片
     */

    @TableField(value = "youwanxiangmu_photo")
    private String youwanxiangmuPhoto;


    /**
     * 项目详情
     */

    @TableField(value = "youwanxiangmu_content")
    private String youwanxiangmuContent;


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
	 * 设置：项目名称
	 */
    public String getYouwanxiangmuName() {
        return youwanxiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setYouwanxiangmuName(String youwanxiangmuName) {
        this.youwanxiangmuName = youwanxiangmuName;
    }
    /**
	 * 设置：项目价格
	 */
    public Integer getYouwanxiangmuMoney() {
        return youwanxiangmuMoney;
    }


    /**
	 * 获取：项目价格
	 */

    public void setYouwanxiangmuMoney(Integer youwanxiangmuMoney) {
        this.youwanxiangmuMoney = youwanxiangmuMoney;
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
	 * 设置：项目图片
	 */
    public String getYouwanxiangmuPhoto() {
        return youwanxiangmuPhoto;
    }


    /**
	 * 获取：项目图片
	 */

    public void setYouwanxiangmuPhoto(String youwanxiangmuPhoto) {
        this.youwanxiangmuPhoto = youwanxiangmuPhoto;
    }
    /**
	 * 设置：项目详情
	 */
    public String getYouwanxiangmuContent() {
        return youwanxiangmuContent;
    }


    /**
	 * 获取：项目详情
	 */

    public void setYouwanxiangmuContent(String youwanxiangmuContent) {
        this.youwanxiangmuContent = youwanxiangmuContent;
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
