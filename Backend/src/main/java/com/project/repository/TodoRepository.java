package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.reactapi.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}
