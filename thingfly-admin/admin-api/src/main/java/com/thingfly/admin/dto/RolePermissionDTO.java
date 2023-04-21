package com.thingfly.admin.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @ClassName RolePermissionDTO
 * @Description 角色权限DTO
 * @Author Nanf_bunan
 * @Time 2023/3/27 22:51
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class RolePermissionDTO {
    private Long roleId;
    private List<Long> permissionIds;
    private Long menuId;
}
