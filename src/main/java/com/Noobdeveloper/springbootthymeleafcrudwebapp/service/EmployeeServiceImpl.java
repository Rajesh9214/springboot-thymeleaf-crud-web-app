package com.Noobdeveloper.springbootthymeleafcrudwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Noobdeveloper.springbootthymeleafcrudwebapp.model.Employee;
import com.Noobdeveloper.springbootthymeleafcrudwebapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
