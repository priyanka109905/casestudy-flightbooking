
package com.booking.swagger;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths((Predicate<String>) PathSelectors.any())
				.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.booking")).build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Booking API Documentation", "API for Booking Microservice", "1.0", "Free to use",
				new springfox.documentation.service.Contact("Priyanka Borase", "http://Youtube.com",
						"priyankaborase22@gmail.com"),
				"API Licence", "http://Youtube.com", Collections.emptyList());
	}
}
