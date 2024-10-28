package com.dao;

import com.entity.YouwanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanxiangmuView;

/**
 * 游玩项目 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface YouwanxiangmuDao extends BaseMapper<YouwanxiangmuEntity> {

   List<YouwanxiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
