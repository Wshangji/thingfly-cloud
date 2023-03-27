package com.thingfly.auth.security.details.client;

import com.thingfly.auth.comm.enums.PasswordEncoderTypeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * @ClassName ClientDetailsServiceImpl
 * @Description
 * @Author Nanf_bunan
 * @Time 2023/3/27 16:06
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class ClientDetailsServiceImpl implements ClientDetailsService {
    @Override
    @Cacheable(cacheNames = "auth", key = "'oauth-client:'+#clientId")
    public ClientDetails loadClientByClientId(String clientId) {
        // 后面通过feign从管理端获取，目前写死
        BaseClientDetails clientDetails = new BaseClientDetails(
                "thingfly",
                "",
                "all",
                "password,client_credentials,refresh_token,authorization_code",
                "",
                "http://www.baidu.com"

        );
        clientDetails.setClientSecret(PasswordEncoderTypeEnum.NOOP.getPrefix() + "thingfly");
        clientDetails.setAccessTokenValiditySeconds(3600);
        clientDetails.setRefreshTokenValiditySeconds(36000000);
        return clientDetails;
    }
}
