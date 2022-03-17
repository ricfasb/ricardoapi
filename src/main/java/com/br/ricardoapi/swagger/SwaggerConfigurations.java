package com.br.ricardoapi.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.ricardoapi.orm.Pessoa;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigurations {
	
	@Bean
	public Docket ricardoSpringAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.br.ricardoapi."))
				.paths(PathSelectors.ant("/**"))
				.build()
				.ignoredParameterTypes(Pessoa.class);
	}
	
	
}
