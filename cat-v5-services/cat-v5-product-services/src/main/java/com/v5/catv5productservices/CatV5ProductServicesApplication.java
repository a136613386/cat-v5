package com.v5.catv5productservices;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.cat.v5.mapper")
@ImportResource("classpath:dubbo-provider.xml")
public class CatV5ProductServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatV5ProductServicesApplication.class, args);
	}

}

