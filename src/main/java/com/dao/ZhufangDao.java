package com.dao;

import com.entity.ZhufangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhufangView;

/**
 * 住房 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface ZhufangDao extends BaseMapper<ZhufangEntity> {

   List<ZhufangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
