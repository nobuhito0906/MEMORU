package com.jp.memoru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories("com.jp.memoru.repository")
public class MemoruApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoruApplication.class, args);
	}

}
