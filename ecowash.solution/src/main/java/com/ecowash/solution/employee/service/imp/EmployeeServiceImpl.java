package com.ecowash.solution.employee.service.imp;

import com.ecowash.solution.employee.model.Employee;
import com.ecowash.solution.employee.repository.EmployeeRepository;
import com.ecowash.solution.employee.service.EmployeeService;
import com.ecowash.solution.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {

        String email = employee.getEmail();
        boolean exist = employeeRepository.existsByEmail(email);
        if (exist){
            throw new RuntimeException("Employee with email " + email + " already exists");
        }

         return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(UUID employeeId) {

        return employeeRepository.findById(employeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee is not exist with given id: "+ employeeId));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return  employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(UUID employeeId, Employee updatedEmployee) {
        if (! employeeRepository.existsById(employeeId)) {
            throw new RuntimeException(" This employee doesn't exist");
        }

        return  employeeRepository.save(updatedEmployee);
    }

    @Override
    public void employeeStatus(UUID employeeId) {
            Employee employee = employeeRepository.findById(employeeId)
                    .orElseThrow(()-> new ResourceNotFoundException("Employee not found with Id "+ employeeId));
            employee.setActive(true);
            employeeRepository.save(employee);
    }

    @Override
    public Employee loginEmployee(String username, String password) {
            return employeeRepository.findByUsernameAndPassword(username, password)
                    .orElseThrow(()-> new ResourceNotFoundException("Invalid username or password"));
    }
}
