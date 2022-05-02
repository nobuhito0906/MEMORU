/**
 * 
 */
package com.jp.memoru.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.memoru.dto.MemoDto;

/**
 * @author nobuhito0906
 *
 * メモ関連機能ドメイン.
 */
@Component
public class MemoDomain {

	/**
	 * ユーザに紐づくメモを取得する.
	 * @param userId ユーザID
	 * @return メモリスト
	 */
	public List<MemoDto> getMemo(String userId) {

		return new ArrayList<>();
	}
}
