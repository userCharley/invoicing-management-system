package com.charley.admin.mapper;

import com.charley.admin.pojo.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author charley
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<String>  findRolesByUserName(String userName);
}
