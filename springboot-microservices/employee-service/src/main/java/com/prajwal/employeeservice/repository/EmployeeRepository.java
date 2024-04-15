package com.prajwal.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prajwal.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
