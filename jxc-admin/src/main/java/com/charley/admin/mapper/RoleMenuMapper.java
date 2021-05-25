package com.charley.admin.mapper;

import com.charley.admin.pojo.RoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色菜单表 Mapper 接口
 * </p>
 *
 * @author charley
 * @since 2021-01-22
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    List<Integer>  queryRoleHasAllMenusByRoleId(Integer roleId);

    List<String>  findAuthoritiesByRoleName(List<String> roleNames);
}
