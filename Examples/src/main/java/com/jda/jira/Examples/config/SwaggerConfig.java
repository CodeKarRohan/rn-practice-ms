package com.jda.jira.Examples.config;



import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Parameter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket daApi() {
		/*
		ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("clientID").modelRef(new ModelRef("string")).parameterType("header").description("oAuth(2-legged) user specifying the client for the operation").required(true).build();
        
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        
        aParameterBuilder.name("code").modelRef(new ModelRef("string")).parameterType("header").description("Access token for the oAuth(2-legged) user").required(true).build();
        aParameters.add(aParameterBuilder.build());
        */
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(swaggerMetaData())
        		.select().apis(RequestHandlerSelectors.basePackage("com.jda.jira.Examples"))
                .paths(regex("/api/v1/operator.*"))
                .build();
                
                
    }
	
	private ApiInfo swaggerMetaData() {
		return new ApiInfoBuilder().title("Hackthon WMS Opr Health API")
				.description("Example API").contact("Rohan Latkar").version("1.0").build();
	}
}


