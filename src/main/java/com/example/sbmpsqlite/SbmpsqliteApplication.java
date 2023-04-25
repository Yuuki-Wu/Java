package com.example.sbmpsqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.example.sbmpsqlite.mapper")
public class SbmpsqliteApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbmpsqliteApplication.class, args);
		Environment bean = context.getBean(Environment.class);
		System.out.println("---启动完成,当前使用端口:[" + bean.getProperty("local.server.port") + "]---");
	}

}