package com.charley.admin.service.impl;

import com.charley.admin.pojo.RoleMenu;
import com.charley.admin.mapper.RoleMenuMapper;
import com.charley.admin.service.IRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色菜单表 服务实现类
 * </p>
 *
 * @author charley
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

    @Override
    public List<Integer> queryRoleHasAllMenusByRoleId(Integer roleId) {
        return this.baseMapper.queryRoleHasAllMenusByRoleId(roleId);
    }

    @Override
    public List<String> findAuthoritiesByRoleName(List<String> roleNames) {
        return this.baseMapper.findAuthoritiesByRoleName(roleNames);
    }
}
