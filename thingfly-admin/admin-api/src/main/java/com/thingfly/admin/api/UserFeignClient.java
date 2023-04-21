package com.thingfly.admin.api;

import com.thingfly.admin.dto.UserAuthDTO;
import com.thingfly.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName UserFeignClient
 * @Description 根据用户名获取用户信息的feign
 * @Author Nanf_bunan
 * @Time 2023/3/28 14:55
 * @Version 1.0
 */
@FeignClient(value = "thingfly-admin")
public interface UserFeignClient {

    @GetMapping("/api/v1/users/username/{username}")
    R<UserAuthDTO> getUserByUsername(@PathVariable String username);
}
