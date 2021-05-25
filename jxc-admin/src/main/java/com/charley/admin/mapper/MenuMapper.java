package com.charley.admin.mapper;

import com.charley.admin.dto.TreeDto;
import com.charley.admin.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author charley
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<TreeDto>  queryAllMenus();
}
