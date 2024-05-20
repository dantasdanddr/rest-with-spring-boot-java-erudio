package br.com.dantas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
		return new OpenAPI()
			.info(new Info()
				.title("RESTFull API with Java 21 and Spring Boot 3.2.0")
				.version("v1")
				.description("Some description about your API")
				.termsOfService("https://github.com/dantasdanddr/rest-with-spring-boot-java-erudio")
				.license(
					new License()
						.name("Apache 2.0")
						.url("https://github.com/dantasdanddr/rest-with-spring-boot-java-erudio")
					)
				);
	}

}
