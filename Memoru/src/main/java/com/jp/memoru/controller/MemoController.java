package com.jp.memoru.controller;

import java.util.ArrayList;
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

	@RequestMapping("memo")
	public List<MemoDto> get(String userId) {

		log.debug("userId:{}", userId);

		return new ArrayList<>();
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
