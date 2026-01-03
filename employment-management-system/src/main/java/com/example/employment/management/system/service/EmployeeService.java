package com.example.employment.management.system.service;

import com.example.employment.management.system.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Page<Employee> getEmployees(Pageable pageable);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}


