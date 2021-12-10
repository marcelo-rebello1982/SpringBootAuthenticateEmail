package com.hellokoding.account.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false)
                .select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Testing swagger")
                .description("The best spring course out there")
                .version("1.0")
                .contact(new Contact(" xxx xxx", "https://github.com/marcelo-rebello1982", "mp.rebello.martins@gmail.com"))
                .license("Apache alguma license qualquer")
                .licenseUrl("Essa license ta nesse link aqui")
                .build();
    }
}


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RestController;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Collections;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//     //https://github.com/gilsonsilvati/spring-boot-multiple-datasource/tree/master/src/main
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false)
//                .select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfo("API Rest", "API REST", "Versão 1.0", "http://www.xxx.com.br",
//                new Contact("M@RCELO M@RTINS ", "http://www.xxx.com.br", "mp.rebello.martins@gmail.com"), "opensource",
//                "http://www.livroteste.com.br/terms", Collections.emptyList());
//    }
//}