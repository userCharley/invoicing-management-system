package com.charley.admin.service;

import com.charley.admin.pojo.Customer;
import com.charley.admin.query.CustomerQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author charley
 */
public interface ICustomerService extends IService<Customer> {

    Map<String, Object> customerList(CustomerQuery customerQuery);

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer[] ids);

    Customer findCustomerByName(String name);
}
