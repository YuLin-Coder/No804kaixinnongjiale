package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.YouwanxiangmuOrderEntity;

import com.service.YouwanxiangmuOrderService;
import com.entity.view.YouwanxiangmuOrderView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.service.YouwanxiangmuService;
import com.entity.YouwanxiangmuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 游玩项目
 * 后端接口
 * @author
 * @email
 * @date 2021-04-10
*/
@RestController
@Controller
@RequestMapping("/youwanxiangmuOrder")
public class YouwanxiangmuOrderController {
    private static final Logger logger = LoggerFactory.getLogger(YouwanxiangmuOrderController.class);

    @Autowired
    private YouwanxiangmuOrderService youwanxiangmuOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private YouwanxiangmuService youwanxiangmuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = youwanxiangmuOrderService.queryPage(params);

        //字典表数据转换
        List<YouwanxiangmuOrderView> list =(List<YouwanxiangmuOrderView>)page.getList();
        for(YouwanxiangmuOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YouwanxiangmuOrderEntity youwanxiangmuOrder = youwanxiangmuOrderService.selectById(id);
        if(youwanxiangmuOrder !=null){
            //entity转view
            YouwanxiangmuOrderView view = new YouwanxiangmuOrderView();
            BeanUtils.copyProperties( youwanxiangmuOrder , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(youwanxiangmuOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //级联表
            YouwanxiangmuEntity youwanxiangmu = youwanxiangmuService.selectById(youwanxiangmuOrder.getYouwanxiangmuId());
            if(youwanxiangmu != null){
                BeanUtils.copyProperties( youwanxiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYouwanxiangmuId(youwanxiangmu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YouwanxiangmuOrderEntity youwanxiangmuOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,youwanxiangmuOrder:{}",this.getClass().getName(),youwanxiangmuOrder.toString());
        youwanxiangmuOrder.setCreateTime(new Date());
        youwanxiangmuOrderService.insert(youwanxiangmuOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YouwanxiangmuOrderEntity youwanxiangmuOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,youwanxiangmuOrder:{}",this.getClass().getName(),youwanxiangmuOrder.toString());
        youwanxiangmuOrderService.updateById(youwanxiangmuOrder);//根据id更新
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        youwanxiangmuOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = youwanxiangmuOrderService.queryPage(params);

        //字典表数据转换
        List<YouwanxiangmuOrderView> list =(List<YouwanxiangmuOrderView>)page.getList();
        for(YouwanxiangmuOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YouwanxiangmuOrderEntity youwanxiangmuOrder = youwanxiangmuOrderService.selectById(id);
            if(youwanxiangmuOrder !=null){
                //entity转view
        YouwanxiangmuOrderView view = new YouwanxiangmuOrderView();
                BeanUtils.copyProperties( youwanxiangmuOrder , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(youwanxiangmuOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    YouwanxiangmuEntity youwanxiangmu = youwanxiangmuService.selectById(youwanxiangmuOrder.getYouwanxiangmuId());
                if(youwanxiangmu != null){
                    BeanUtils.copyProperties( youwanxiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYouwanxiangmuId(youwanxiangmu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YouwanxiangmuOrderEntity youwanxiangmuOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,youwanxiangmuOrder:{}",this.getClass().getName(),youwanxiangmuOrder.toString());
        if(youwanxiangmuOrder.getYuyueOrderTime().getTime() > (new Date().getTime()+(1000*60*60*24*7))){
            return R.error("预约时间不能大于七天");
        }
        youwanxiangmuOrder.setCreateTime(new Date());
        youwanxiangmuOrderService.insert(youwanxiangmuOrder);
        return R.ok();
    }


}

