package com.ecowash.solution.employee.repository;

import com.ecowash.solution.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    boolean existsByEmail(String email);
    Optional<Employee> findByUsernameAndPassword(String username, String password);
}
