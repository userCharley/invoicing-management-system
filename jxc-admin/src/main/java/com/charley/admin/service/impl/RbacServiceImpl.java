package com.charley.admin.service.impl;

import com.charley.admin.service.IRbacService;
import com.charley.admin.service.IRoleMenuService;
import com.charley.admin.service.IUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author charley
 * @version 1.0
 */
@Service
public class RbacServiceImpl  implements IRbacService {
    @Resource
    private IUserRoleService userRoleService;

    @Resource
    private IRoleMenuService roleMenuService;

    @Override
    public List<String> findRolesByUserName(String userName) {
        return userRoleService.findRolesByUserName(userName);
    }


    @Override
    public List<String> findAuthoritiesByRoleName(List<String> roleNames) {
        return roleMenuService.findAuthoritiesByRoleName(roleNames);
    }
}
