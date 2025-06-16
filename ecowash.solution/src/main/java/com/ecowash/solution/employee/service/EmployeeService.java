package com.ecowash.solution.employee.service;

import com.ecowash.solution.employee.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(UUID employeeId);
    List<Employee> getAllEmployee();
    Employee updateEmployee(UUID employeeId, Employee updatedEmployee);
    void employeeStatus(UUID employeeId);
    Employee loginEmployee(String username, String password);
}
