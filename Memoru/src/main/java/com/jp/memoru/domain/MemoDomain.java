/**
 * 
 */
package com.jp.memoru.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jp.memoru.dto.MemoDto;
import com.jp.memoru.entity.TodoEntity;
import com.jp.memoru.repository.TodoRepository;

/**
 * @author nobuhito0906
 *
 * メモ関連機能ドメイン.
 */
@Component
public class MemoDomain {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(MemoDomain.class);

	@Autowired
	private TodoRepository todoRepository;

	private static final String ID = "1";

	/**
	 * ユーザに紐づくメモを取得する.
	 * @param userId ユーザID
	 * @return メモリスト
	 */
	public List<MemoDto> getMemoList(String userId) {

		//		if (StringUtils.equals(userId, ID)) {
		//			return Arrays.asList(getMemo(userId));
		//		}

		List<TodoEntity> entityList = todoRepository.findByUserId(userId);
		//		List<TodoEntity> entityList = todoRepository.findAll();

		logger.debug("entityList:", entityList);
		//		logger.info("entityList:", ToStringBuilder.reflectionToString(entityList, ToStringStyle.MULTI_LINE_STYLE));

		List<MemoDto> dtoList = entityList.stream().map(entity -> {
			MemoDto dto = new MemoDto();
			dto.setId(entity.getId());
			dto.setMemo(entity.getMemo());
			dto.setRemarks(entity.getRemarks());
			dto.setActionDate(entity.getActionDate());
			dto.setActionTime(entity.getActionTime());
			dto.setActionFlag(BooleanUtils.toBoolean(entity.getAlreadyFlag(), "1", "0"));
			dto.setVersion(entity.getVersion());

			return dto;
		}).collect(Collectors.toList());

		return dtoList;
	}

	public MemoDto getMemo(String id) {
		Optional<TodoEntity> entity = todoRepository.findById(Integer.valueOf(id));

		MemoDto dto = new MemoDto();

		if (entity.isPresent()) {
			TodoEntity todo = entity.get();
			dto.setId(todo.getId());
			dto.setMemo(todo.getMemo());
			dto.setRemarks(todo.getRemarks());
			dto.setActionDate(todo.getActionDate());
			dto.setActionFlag(BooleanUtils.toBoolean(todo.getAlreadyFlag(), "1", "0"));

		}
		return dto;

	}

}
