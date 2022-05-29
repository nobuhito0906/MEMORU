/**
 * 
 */
package com.jp.memoru.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.memoru.domain.MemoDomain;
import com.jp.memoru.dto.MemoDto;
import com.jp.memoru.service.MemoService;

/**
 * @author nobuhito0906
 *
 */
@Service
public class MemoServiceImpl implements MemoService {

	@Autowired
	private MemoDomain memoDomain;

	@Override
	public List<MemoDto> get(String userId) {

		return memoDomain.getMemoList(userId);
	}

}
