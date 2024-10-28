package com.dao;

import com.entity.YouwanxiangmuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanxiangmuLiuyanView;

/**
 * 游玩项目留言 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface YouwanxiangmuLiuyanDao extends BaseMapper<YouwanxiangmuLiuyanEntity> {

   List<YouwanxiangmuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
