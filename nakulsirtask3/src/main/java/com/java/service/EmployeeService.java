package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.model.Employee;
import com.java.repository.EmployeeRep;
@Component
public class EmployeeService {
	@Autowired
	EmployeeRep employeeRep;

	public List<Employee> getAll() {
		return employeeRep.findAll();
	}

	public List<Employee> saveEmployee(Employee employee) {
		employeeRep.save(employee);
		return employeeRep.findAll();

	}

	public List<Employee> deleteEmployee(Employee employee) {
		employeeRep.delete(employee);
		return employeeRep.findAll();
	}

}
