package com.charley.admin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.charley.admin.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.charley.admin.query.GoodsQuery;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author charley
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    IPage<Goods>  queryGoodsByParams(IPage<Goods> page, @Param("goodsQuery") GoodsQuery goodsQuery);
}
