/**
 * 
 */
package com.jp.memoru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.memoru.entity.TodoEntity;

/**
 * @author nobuhito0906
 *
 */
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
