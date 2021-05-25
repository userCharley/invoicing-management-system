package com.charley.admin.service;

import com.charley.admin.pojo.RoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色菜单表 服务类
 * </p>
 *
 * @author charley
 */
public interface IRoleMenuService extends IService<RoleMenu> {

    List<Integer> queryRoleHasAllMenusByRoleId(Integer roleId);

    List<String>  findAuthoritiesByRoleName(List<String> roleNames);
}
