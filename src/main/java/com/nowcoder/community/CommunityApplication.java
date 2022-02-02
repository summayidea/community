package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication//配置文件
public class CommunityApplication {

	@PostConstruct
	public void init(){
		//解决netty启动冲突问题
		System.out.println("es.set.netty.runtmr.available.processor");
	}

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
