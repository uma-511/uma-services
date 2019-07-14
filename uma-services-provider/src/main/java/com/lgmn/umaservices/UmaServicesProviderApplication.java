package com.lgmn.umaservices;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@NacosPropertySource(dataId = "uma-servicesProvider", autoRefreshed = true)
@EnableJpaAuditing
public class UmaServicesProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UmaServicesProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
