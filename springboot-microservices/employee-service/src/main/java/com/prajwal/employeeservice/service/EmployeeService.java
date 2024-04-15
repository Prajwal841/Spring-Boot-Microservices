package com.prajwal.employeeservice.service;

import com.prajwal.employeeservice.dto.APIResponseDto;
import com.prajwal.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
