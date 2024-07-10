package com.example.common.config;

import com.example.common.util.TrustAll;
import feign.Client;
import org.springframework.context.annotation.Bean;

public class IgnoreSSLCheckConfiguration {

    @Bean
    public Client feignClient() {
        return new Client.Default(TrustAll.socketFactory(), new TrustAll.hostnameVerifier());
    }
}
