package com.v5.catv5background;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
@Import(FdfsClientConfig.class)
public class CatV5BackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatV5BackgroundApplication.class, args);
	}

}

