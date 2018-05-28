package com.nexo.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nexo.ai.*")
@EnableAutoConfiguration
@SpringBootApplication
public class CloudantExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudantExampleApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CloudantExampleApplication.class);
	}
}
