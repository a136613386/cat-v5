package com.cat.catv5background;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class CatV5BackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatV5BackgroundApplication.class, args);
	}

}

