package com.marco.buki.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name = "BukiOpenApi")
    public OpenAPI easystoryOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Buki Application API")
                        .description("Buki API implemented with Spring Boot RESTful service and documented using springdoc-openapi and OpenAPI 3.0"));
    }
}
