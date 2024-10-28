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

import com.dao.ZhufangLiuyanDao;
import com.entity.ZhufangLiuyanEntity;
import com.service.ZhufangLiuyanService;
import com.entity.view.ZhufangLiuyanView;

/**
 * 住房留言 服务实现类
 * @author 
 * @since 2021-04-10
 */
@Service("zhufangLiuyanService")
@Transactional
public class ZhufangLiuyanServiceImpl extends ServiceImpl<ZhufangLiuyanDao, ZhufangLiuyanEntity> implements ZhufangLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZhufangLiuyanView> page =new Query<ZhufangLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
