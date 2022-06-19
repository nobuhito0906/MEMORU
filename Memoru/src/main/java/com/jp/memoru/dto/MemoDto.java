/**
 * 
 */
package com.jp.memoru.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author nobuhito0906
 *
 * メモDto.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MemoDto extends BaseDto {

	/**ID*/
	private Integer id;

	/**メモ*/
	private String memo;

	/**備考*/
	private String remarks;

	/**行動日時*/
	private String actionDate;

	/**行動日時*/
	private String actionTime;

	/**行動済フラグ*/
	private boolean actionFlag;
}
