/**
 * 
 */
package com.jp.memoru.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author nobuhito0906
 *
 */
@Data
public class BaseEntity {

	/**作成日時*/
	private Date createDate;

	/**作成ユーザ*/
	private String createUser;

	/**更新日時*/
	private Date updateDate;

	/**更新ユーザ*/
	private String updateUser;

	/**バージョン*/
	private Integer version;

}
