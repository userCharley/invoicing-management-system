package com.charley.admin.service;

import com.charley.admin.pojo.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户角色表 服务类
 * </p>
 *
 * @author charley
 */
public interface IUserRoleService extends IService<UserRole> {

    List<String> findRolesByUserName(String userName);
}
