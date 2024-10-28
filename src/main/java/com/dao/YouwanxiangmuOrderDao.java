package com.dao;

import com.entity.YouwanxiangmuOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanxiangmuOrderView;

/**
 * 游玩项目 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface YouwanxiangmuOrderDao extends BaseMapper<YouwanxiangmuOrderEntity> {

   List<YouwanxiangmuOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
