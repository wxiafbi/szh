package com.xxzx.szh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxzx.szh.mapper")
public class SzhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzhApplication.class, args);
	}

}
