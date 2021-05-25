package com.charley.admin.service;

import com.charley.admin.pojo.Goods;
import com.charley.admin.query.GoodsQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author charley
 */
public interface IGoodsService extends IService<Goods> {

    Map<String, Object> goodsList(GoodsQuery goodsQuery);


    String genGoodsCode();

    void saveGoods(Goods goods);

    void updateGoods(Goods goods);

    void deleteGoods(Integer id);

    void updateStock(Goods goods);

    void deleteStock(Integer id);
}
