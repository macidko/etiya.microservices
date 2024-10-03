package com.etiya.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Yapılandırma Anotasyonu: Bu sınıfın, Spring konteynerine tanıtılan bir yapılandırma sınıfı olduğunu belirtir.
// Bu sınıf içinde tanımlanan metodlar, uygulama başlatıldığında Spring konteynerine yüklenir.
@Configuration
public class GatewayConfig {

//    RouteLocator: Gateway'de yönlendirme (routing) ayarlarını tanımlamak için kullanılan bir arayüzdür.
//    RouteLocatorBuilder: Yönlendirme ayarlarını yapılandırmak için kullanılan bir yardımcı sınıftır.
//    @Bean: Spring konteynerine bir bean (bileşen) tanımlamak için kullanılan bir anotasyondur.
//    @Configuration: Bu sınıfın, Spring uygulama bağlamında bir yapılandırma sınıfı olduğunu belirtir.
    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("customerservice", r -> r.path("/customerservice/**")
                        .uri("http://localhost:8080"))
                .route("productservice", r -> r.path("/productservice/**")
                        .uri("http://localhost:8081"))
                .build();
    }
}
