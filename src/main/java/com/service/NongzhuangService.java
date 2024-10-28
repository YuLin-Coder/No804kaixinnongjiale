package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongzhuangEntity;
import java.util.Map;

/**
 * 农庄 服务类
 * @author 
 * @since 2021-04-10
 */
public interface NongzhuangService extends IService<NongzhuangEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}