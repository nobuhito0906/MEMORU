package com.jp.memoru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jp.memoru.dto.MemoDto;
import com.jp.memoru.service.MemoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author negoto0906
 * 
 * メモコントローラクラス.
 *
 */
@RestController
@Slf4j
public class MemoController {

	@Autowired
	private MemoService memoService;

	@GetMapping("/memo")
	public List<MemoDto> get(@RequestParam("userId") String userId) {

		log.debug("userId:{}", userId);
		log.info("userId:{}", userId);
		return memoService.get(userId);

	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info("name:{}", name);

		return String.format("Hello %s!", name);
	}

	@RequestMapping("/")
	public String login() {
		log.debug("hello World!");

		return "hello World!";
	}
}
