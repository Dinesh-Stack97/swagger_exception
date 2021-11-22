package com.Spring.Swagger.app.Spring_Boot_Swagger_App.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket customerApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()//select the base package
				   .apis(RequestHandlerSelectors.basePackage("com.Spring.Swagger.app.Spring_Boot_Swagger_App.controller"))
				   .paths(PathSelectors.any())//for which path we need to generate
				   .build();//used to build documentation
				
	}

}
