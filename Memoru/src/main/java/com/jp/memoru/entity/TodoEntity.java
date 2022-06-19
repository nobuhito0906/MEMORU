/**
 * 
 */
package com.jp.memoru.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author nobuhito0906
 *
 */
@Data
@Entity
@Table(name = "todo")
@EqualsAndHashCode(callSuper = false)
public class TodoEntity extends BaseEntity {

	/**
	 * シリアルバージョンUID.
	 */
	//	private static final long serialVersionUID = 5864813675009241509L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	private String memo;

	private String remarks;

	private String actionDate;

	private String actionTime;

	private String alreadyFlag;

	private String userId;

}
