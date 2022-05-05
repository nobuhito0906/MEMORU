/**
 * 
 */
package com.jp.memoru.entity;

import java.util.Date;

import javax.persistence.Entity;
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

	private Integer id;

	private String memo;

	private String remarks;

	private Date actionDate;

	private String userId;
}
