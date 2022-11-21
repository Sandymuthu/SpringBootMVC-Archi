package com.restex.servicedemo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.restex.servicedemo.model.Employee;
import com.restex.servicedemo.service.EmployeeService;


@RestController

public class ApiController {
    @Autowired
    private EmployeeService employeeService;
 
    @GetMapping("/getEmployee/{id}")
    public Optional<Employee>  getEmployee(@PathVariable Integer id)
    {
        return employeeService.getEmployeeById(id);    
    }
}
