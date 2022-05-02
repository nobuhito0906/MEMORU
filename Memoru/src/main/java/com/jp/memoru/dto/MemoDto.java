/**
 * 
 */
package com.jp.memoru.dto;

import java.util.Date;

import lombok.Data;

/**
 * @author nobuhito0906
 *
 * メモDto.
 */
@Data
public class MemoDto {

	/**ID*/
	private Integer id;

	/**メモ*/
	private String memo;

	/**備考*/
	private String remarks;

	/**行動日時*/
	private Date actionDate;
}
