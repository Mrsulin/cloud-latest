package com.sulin.cloud.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GatewayConfig {

    /**
     #      routes:
     #        - id: PRODUCT-PROVIDER
     #          uri: http://localhost:8001
     #          predicates:
     #            - Path=/product/**  注意**不能少
     *  第二种书写方式  配置路由
     * @param locatorBuilder builder
     * @return routLocator
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder locatorBuilder) {
        return locatorBuilder.routes()
                .route("PRODUCT-PROVIDER", r -> r.path("/product/**").uri("http://localhost:8001")).build();

    }
}
