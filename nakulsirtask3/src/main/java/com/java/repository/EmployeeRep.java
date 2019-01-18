package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Employee;

public interface EmployeeRep extends JpaRepository<Employee,Integer>{

}
