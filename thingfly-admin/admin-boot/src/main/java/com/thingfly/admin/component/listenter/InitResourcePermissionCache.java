package com.thingfly.admin.component.listenter;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName InitResourcePermissionCache
 * @Description
 * @Author Nanf_bunan
 * @Time 2023/3/28 17:15
 * @Version 1.0
 */
@Component
@AllArgsConstructor
public class InitResourcePermissionCache implements CommandLineRunner {

    private ISysPermissionService iSysPermissionService;

    @Override
    public void run(String... args) {
        iSysPermissionService.refreshPermRolesRules();
    }
}
