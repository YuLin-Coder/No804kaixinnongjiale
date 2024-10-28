package com.entity.vo;

import com.entity.TesecaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 特色菜
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("tesecai")
public class TesecaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
