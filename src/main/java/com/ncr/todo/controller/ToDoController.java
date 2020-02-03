package com.ncr.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncr.todo.model.ToDoList;
import com.ncr.todo.service.TodoService;

import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
public class ToDoController {

	@Autowired
	TodoService toDoService;
	
	@ApiOperation(value="",notes="")
	@GetMapping(value="/api/getData")
	public Iterable<ToDoList> getData() {
		return toDoService.getData();
	}
	
}
