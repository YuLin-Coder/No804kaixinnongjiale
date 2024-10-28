package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.YouwanxiangmuOrderDao;
import com.entity.YouwanxiangmuOrderEntity;
import com.service.YouwanxiangmuOrderService;
import com.entity.view.YouwanxiangmuOrderView;

/**
 * 游玩项目 服务实现类
 * @author 
 * @since 2021-04-10
 */
@Service("youwanxiangmuOrderService")
@Transactional
public class YouwanxiangmuOrderServiceImpl extends ServiceImpl<YouwanxiangmuOrderDao, YouwanxiangmuOrderEntity> implements YouwanxiangmuOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YouwanxiangmuOrderView> page =new Query<YouwanxiangmuOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
