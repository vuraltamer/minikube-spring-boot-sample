package com.vspringtest;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableMongoRepositories("com.vspringtest.dao.repo")
@EnableSwagger2
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	/*
	* Dozer Bean Mapper COnfiguration
	*
	* */
	@Bean
	public Mapper mapper() {
		return new DozerBeanMapper();
	}


	/*
	 * Swagger Configuration
	 *
	 * */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.vspringtest.controller"))
				.paths(PathSelectors.any())
				.build().pathMapping("/").apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}

	@Bean
	public ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("User Management API through Swagger UI").version("1.0").license("(C) Copyright Test")
				.description("User Management API Rest Web Services");
		return builder.build();
	}

}
