package com.thingfly.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thingfly.admin.pojo.entity.SysPermission;

import java.util.List;

/**
 * @ClassName ISysPermissionService
 * @Description
 * @Author Nanf_bunan
 * @Time 2023/4/21 14:40
 * @Version 1.0
 */
public interface ISysPermissionService extends IService<SysPermission> {
    /**
     * 刷新Redis缓存中角色菜单的权限规则，角色和菜单信息变更调用
     */
    boolean refreshPermRolesRules();

    List<SysPermission> listPermRoles();
}
