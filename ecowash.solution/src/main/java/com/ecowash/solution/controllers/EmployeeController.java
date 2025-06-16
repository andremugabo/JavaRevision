package com.ecowash.solution.controllers;


import com.ecowash.solution.employee.model.Employee;
import com.ecowash.solution.employee.repository.EmployeeRepository;
import com.ecowash.solution.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //Build Get Employee REST API
    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee saveEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") UUID employeeId){
            Employee gettedEmployee = employeeService.getEmployeeById(employeeId);
            return ResponseEntity.ok(gettedEmployee);
    }

    // Get all employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }

    // Get employee by ID





    // Update employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable UUID id,
            @RequestBody Employee updatedEmployee) {
        Employee employee = employeeService.updateEmployee(id, updatedEmployee);
        return ResponseEntity.ok(employee);
    }

    // Deactivate employee (status change)
    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> deactivateEmployee(@PathVariable UUID id) {
        employeeService.employeeStatus(id);
        return ResponseEntity.noContent().build();
    }

    // Employee login
    @PostMapping("/login")
    public ResponseEntity<Employee> loginEmployee(
            @RequestBody String username,
            @RequestBody String password) {
        Employee employee = employeeService.loginEmployee(username, password);
        return ResponseEntity.ok(employee);
    }


}
