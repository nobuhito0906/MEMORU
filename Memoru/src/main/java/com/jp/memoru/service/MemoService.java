/**
 * 
 */
package com.jp.memoru.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.memoru.dto.MemoDto;

/**
 * @author nobuhito0906
 *
 */
@Service
public interface MemoService {

	public abstract List<MemoDto> get();
}
