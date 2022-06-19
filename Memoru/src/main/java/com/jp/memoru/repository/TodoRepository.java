/**
 * 
 */
package com.jp.memoru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.memoru.entity.TodoEntity;

/**
 * @author nobuhito0906
 *
 */
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

	List<TodoEntity> findByUserId(String userId);
}