package br.com.andrebaroni.burger.store.api.infra.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.andrebaroni.burger.store.api.application.controller"))
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .apiInfo(this.apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Burger Store API",
                "Burger Store API - André Baroni",
                "1.0.0",
                "Use this app to study",
                new Contact("André Baroni", "", ""),
                "",
                "",
                Collections.emptyList()
        );
    }
}
