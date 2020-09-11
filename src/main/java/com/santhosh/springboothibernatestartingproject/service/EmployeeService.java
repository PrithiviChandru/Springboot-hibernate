package com.santhosh.springboothibernatestartingproject.service;

import java.util.List;

import com.santhosh.springboothibernatestartingproject.model.Employee;

public interface EmployeeService {
List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee emp);
	
	void delete(int id);

}
