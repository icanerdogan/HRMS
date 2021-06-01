package com.icanerdogan.HRMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

import springfox.documentation.builders.PathSelectors;
>>>>>>> hafta 8
>>>>>>> hafta 8
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

<<<<<<< HEAD
@SpringBootApplication
=======
<<<<<<< HEAD
@SpringBootApplication
=======
@SpringBootApplication()
>>>>>>> hafta 8
>>>>>>> hafta 8
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.icanerdogan.HRMS"))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
				.paths(PathSelectors.any())
>>>>>>> hafta 8
>>>>>>> hafta 8
				.build();
	}
}
