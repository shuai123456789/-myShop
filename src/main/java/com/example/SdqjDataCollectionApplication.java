package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan({"com.tl.mapper"})
public class SdqjDataCollectionApplication {

//12367888knm;kfrfs
	public static void main(String[] args) {
		SpringApplication.run(SdqjDataCollectionApplication.class, args);
		System.out.println("导线温度consumer_webt启动成功！");
	}
}
