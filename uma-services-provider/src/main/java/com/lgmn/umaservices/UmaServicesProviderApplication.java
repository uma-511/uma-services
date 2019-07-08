package com.lgmn.umaservices;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@NacosPropertySource(dataId = "uma-servicesProvider", autoRefreshed = true)
public class UmaServicesProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UmaServicesProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
