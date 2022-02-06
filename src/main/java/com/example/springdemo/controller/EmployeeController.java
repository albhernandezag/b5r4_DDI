package com.example.springdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdemo.domain.Employee;
import com.example.springdemo.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@RequestMapping("home")
	public List<Employee> showData() {
		List<Employee> list = service.getAllEmployee();
		return list;
 	}
} 
