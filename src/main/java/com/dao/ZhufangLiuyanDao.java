package com.dao;

import com.entity.ZhufangLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhufangLiuyanView;

/**
 * 住房留言 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface ZhufangLiuyanDao extends BaseMapper<ZhufangLiuyanEntity> {

   List<ZhufangLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
