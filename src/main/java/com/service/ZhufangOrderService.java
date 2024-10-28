package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhufangOrderEntity;
import java.util.Map;

/**
 * 住房预约 服务类
 * @author 
 * @since 2021-04-10
 */
public interface ZhufangOrderService extends IService<ZhufangOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}