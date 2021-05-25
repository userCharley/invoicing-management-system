package com.charley.admin.service;

import com.charley.admin.pojo.User;
import com.charley.admin.query.UserQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author charley
 */
public interface IUserService extends IService<User> {



    /**
     * 根据用户名查询用户记录
     * @param userName
     * @return
     */
    public User findUserByUserName(String userName);


    void updateUserInfo(User user);

    void updateUserPassword(String userName, String oldPassword, String newPassword, String confirmPassword);

    Map<String, Object> userList(UserQuery userQuery);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer[] ids);
}
