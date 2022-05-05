/**
 * 
 */
package com.jp.memoru.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author nobuhito0906
 *
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseEntity implements Serializable {

	private Date createDate;

	private String createUser;

	private Date updateDate;

	private String updateUser;

	private Integer version;
}
