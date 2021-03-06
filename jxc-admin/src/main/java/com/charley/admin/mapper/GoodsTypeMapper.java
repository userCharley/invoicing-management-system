package com.charley.admin.mapper;

import com.charley.admin.dto.TreeDto;
import com.charley.admin.pojo.GoodsType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品类别表 Mapper 接口
 * </p>
 *
 * @author charley
 */
public interface GoodsTypeMapper extends BaseMapper<GoodsType> {

    List<TreeDto>  queryAllGoodsTypes();
}
