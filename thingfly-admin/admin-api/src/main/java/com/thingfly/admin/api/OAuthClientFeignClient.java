package com.thingfly.admin.api;

import com.thingfly.admin.dto.OAuth2ClientDTO;
import com.thingfly.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName OAuthClientFeignClient
 * @Description 获取客户端信息的feign
 * @Author Nanf_bunan
 * @Time 2023/3/28 14:54
 * @Version 1.0
 */
@FeignClient(value = "thingfly-admin", contextId = "oauth-client")
public interface OAuthClientFeignClient {

    @GetMapping("/api/oauth-clients/getOAuth2ClientById")
    R<OAuth2ClientDTO> getOAuth2ClientById(@RequestParam String clientId);
}
