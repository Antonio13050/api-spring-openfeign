package com.api.feign.apispringopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiSpringOpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringOpenfeignApplication.class, args);
	}

}
