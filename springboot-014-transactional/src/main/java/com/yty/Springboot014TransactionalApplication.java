package com.yty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.transaction.annotation.EnableTransactionManagement;


// Generated by https://start.springboot.io
// 优质的 spring/boot/data/security/cloud 框架中文文档尽在 => https://springdoc.cn

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.yty.dao")
public class Springboot014TransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot014TransactionalApplication.class, args);
	}

}