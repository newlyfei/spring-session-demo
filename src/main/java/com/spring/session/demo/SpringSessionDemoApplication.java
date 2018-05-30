package com.spring.session.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringSessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionDemoApplication.class, args);
	}
}
