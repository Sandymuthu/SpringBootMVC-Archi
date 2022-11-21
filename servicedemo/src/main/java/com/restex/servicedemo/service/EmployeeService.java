package com.restex.servicedemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restex.servicedemo.model.Employee;
import com.restex.servicedemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Optional<Employee> getEmployeeById(int empid)
    {
        return employeeRepository.findById(empid);
    }
}
