package com.ncr.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncr.todo.model.ToDoList;
import com.ncr.todo.repository.ToDoRepository;

@Service
public class TodoService {
	
	@Autowired
	ToDoRepository toDoRepository;
	
	public Iterable<ToDoList> getData() {
		return toDoRepository.getData();
	}

}
