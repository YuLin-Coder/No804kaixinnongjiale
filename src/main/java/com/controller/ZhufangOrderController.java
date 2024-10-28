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

import com.entity.ZhufangOrderEntity;

import com.service.ZhufangOrderService;
import com.entity.view.ZhufangOrderView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.service.ZhufangService;
import com.entity.ZhufangEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 住房预约
 * 后端接口
 * @author
 * @email
 * @date 2021-04-10
*/
@RestController
@Controller
@RequestMapping("/zhufangOrder")
public class ZhufangOrderController {
    private static final Logger logger = LoggerFactory.getLogger(ZhufangOrderController.class);

    @Autowired
    private ZhufangOrderService zhufangOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private ZhufangService zhufangService;


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
        PageUtils page = zhufangOrderService.queryPage(params);

        //字典表数据转换
        List<ZhufangOrderView> list =(List<ZhufangOrderView>)page.getList();
        for(ZhufangOrderView c:list){
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
        ZhufangOrderEntity zhufangOrder = zhufangOrderService.selectById(id);
        if(zhufangOrder !=null){
            //entity转view
            ZhufangOrderView view = new ZhufangOrderView();
            BeanUtils.copyProperties( zhufangOrder , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(zhufangOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //级联表
            ZhufangEntity zhufang = zhufangService.selectById(zhufangOrder.getZhufangId());
            if(zhufang != null){
                BeanUtils.copyProperties( zhufang , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setZhufangId(zhufang.getId());
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
    public R save(@RequestBody ZhufangOrderEntity zhufangOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhufangOrder:{}",this.getClass().getName(),zhufangOrder.toString());
        zhufangOrder.setCreateTime(new Date());
        zhufangOrderService.insert(zhufangOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhufangOrderEntity zhufangOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhufangOrder:{}",this.getClass().getName(),zhufangOrder.toString());
        zhufangOrderService.updateById(zhufangOrder);//根据id更新
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhufangOrderService.deleteBatchIds(Arrays.asList(ids));
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
        PageUtils page = zhufangOrderService.queryPage(params);

        //字典表数据转换
        List<ZhufangOrderView> list =(List<ZhufangOrderView>)page.getList();
        for(ZhufangOrderView c:list){
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
        ZhufangOrderEntity zhufangOrder = zhufangOrderService.selectById(id);
            if(zhufangOrder !=null){
                //entity转view
        ZhufangOrderView view = new ZhufangOrderView();
                BeanUtils.copyProperties( zhufangOrder , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(zhufangOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    ZhufangEntity zhufang = zhufangService.selectById(zhufangOrder.getZhufangId());
                if(zhufang != null){
                    BeanUtils.copyProperties( zhufang , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setZhufangId(zhufang.getId());
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
    public R add(@RequestBody ZhufangOrderEntity zhufangOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhufangOrder:{}",this.getClass().getName(),zhufangOrder.toString());
        if(zhufangOrder.getYuyueOrderTime().getTime() > (new Date().getTime()+(1000*60*60*24*7))){
            return R.error("预约时间不能大于七天");
        }
        zhufangOrder.setCreateTime(new Date());
        zhufangOrderService.insert(zhufangOrder);
        return R.ok();
    }


}

