package com.charley.admin.controller;


import com.charley.admin.model.RespBean;
import com.charley.admin.pojo.Goods;
import com.charley.admin.query.GoodsQuery;
import com.charley.admin.service.IGoodsService;
import com.charley.admin.service.IGoodsTypeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author charley
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private IGoodsService goodsService;

    @Resource
    private IGoodsTypeService goodsTypeService;

    @RequestMapping("index")
    public String index(){
        return "goods/goods";
    }



    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> goodsList(GoodsQuery goodsQuery){
        return goodsService.goodsList(goodsQuery);
    }


    /**
     * 添加|更新商品页
     * @param id
     * @param typeId
     * @param model
     * @return
     */
    @RequestMapping("addOrUpdateGoodsPage")
    public String addOrUpdateGoodsPage(Integer id, Integer typeId,Model model){
        if(null !=id){
            Goods goods = goodsService.getById(id);
            // 更新处理
            model.addAttribute("goods",goods);
            model.addAttribute("goodsType",goodsTypeService.getById(goods.getTypeId()));
        }else{
            //添加处理
            if(null !=typeId){
                model.addAttribute("goodsType",goodsTypeService.getById(typeId));
            }

        }

        return "goods/add_update";
    }

    /**
     * 商品类别选择页
     * @param typeId
     * @param model
     * @return
     */
    @RequestMapping("toGoodsTypePage")
    public String toGoodsTypePage(Integer typeId, Model model){
        if(null !=typeId){
            model.addAttribute("typeId",typeId);
        }
        return "goods/goods_type";
    }

    /**
     * 添加商品接口
     * @param goods
     * @return
     */
    @RequestMapping("save")
    @ResponseBody
    public RespBean saveGoods(Goods goods){
        goodsService.saveGoods(goods);
        return RespBean.success("商品记录添加成功");
    }


    /**
     * 更新商品接口
     * @param goods
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public RespBean updateGoods(Goods goods){
        goodsService.updateGoods(goods);
        return RespBean.success("商品记录更新成功");
    }

    @RequestMapping("delete")
    @ResponseBody
    public RespBean deleteGoods(Integer id){
        goodsService.deleteGoods(id);
        return RespBean.success("商品记录删除成功");
    }
}
