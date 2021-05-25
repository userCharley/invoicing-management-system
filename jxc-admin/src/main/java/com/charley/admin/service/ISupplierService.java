package com.charley.admin.service;

import com.charley.admin.pojo.Supplier;
import com.charley.admin.query.SupplierQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 供应商表 服务类
 * </p>
 *
 * @author charley
 */
public interface ISupplierService extends IService<Supplier> {

    Map<String, Object> supplierList(SupplierQuery supplierQuery);
    
    Supplier findSupplierByName(String name);

    void saveSupplier(Supplier supplier);

    void updateSupplier(Supplier supplier);

    void deleteSupplier(Integer[] ids);
}
