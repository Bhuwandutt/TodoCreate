package com.ncr.todo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncr.todo.model.ToDoList;

@Repository
public class ToDoRepository {
@Autowired
ToDoCrudRepository toDoCrudRepository;

public Iterable<ToDoList> getData() {
	return toDoCrudRepository.findAll();
	}


}
