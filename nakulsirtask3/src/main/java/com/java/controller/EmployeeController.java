package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Employee;
import com.java.service.EmployeeService;

@RestController
@RequestMapping("/emplo")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@PostMapping
	public ResponseEntity<List<Employee>> saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<List<Employee>>(HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {

		employeeService.saveEmployee(employee);
		return new ResponseEntity<List<Employee>>(HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity<List<Employee>> deleteEmployee(Employee employee) {
		employeeService.deleteEmployee(employee);
		return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
	}

}
