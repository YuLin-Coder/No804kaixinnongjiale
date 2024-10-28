package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouwanxiangmuOrderEntity;
import java.util.Map;

/**
 * 游玩项目 服务类
 * @author 
 * @since 2021-04-10
 */
public interface YouwanxiangmuOrderService extends IService<YouwanxiangmuOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}