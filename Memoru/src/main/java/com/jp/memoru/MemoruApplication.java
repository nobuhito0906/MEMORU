package com.jp.memoru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.jp.memoru.repository")
public class MemoruApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoruApplication.class, args);
	}

}
