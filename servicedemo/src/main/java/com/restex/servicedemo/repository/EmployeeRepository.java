package com.restex.servicedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restex.servicedemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
