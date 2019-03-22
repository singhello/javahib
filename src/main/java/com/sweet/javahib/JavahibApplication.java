package com.sweet.javahib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class JavahibApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavahibApplication.class, args);
	}

}
