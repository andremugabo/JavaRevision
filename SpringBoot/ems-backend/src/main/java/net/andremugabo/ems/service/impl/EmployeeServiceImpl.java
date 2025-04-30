package net.andremugabo.ems.service.impl;

import lombok.AllArgsConstructor;
import net.andremugabo.ems.dto.EmployeeDto;
import net.andremugabo.ems.entity.Employee;
import net.andremugabo.ems.mapper.EmployeeMapper;
import net.andremugabo.ems.repository.EmployeeRepository;
import net.andremugabo.ems.service.EmployeeService;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee =  employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
      Employee employee =   employeeRepository.findById(employeeId)
                .orElseThrow(()->
                        new RuntimeException("Employee is not exists with given id: "+ employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
