package com.dao;

import com.entity.ZhufangOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhufangOrderView;

/**
 * 住房预约 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface ZhufangOrderDao extends BaseMapper<ZhufangOrderEntity> {

   List<ZhufangOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
