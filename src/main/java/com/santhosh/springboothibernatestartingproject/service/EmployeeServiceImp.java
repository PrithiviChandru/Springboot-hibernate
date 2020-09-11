package com.santhosh.springboothibernatestartingproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santhosh.springboothibernatestartingproject.dao.EmployeeDao;
import com.santhosh.springboothibernatestartingproject.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
		 
	}

	@Transactional
	@Override
	public void save(Employee emp) {
		employeeDao.save(emp);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
		
	}

}
