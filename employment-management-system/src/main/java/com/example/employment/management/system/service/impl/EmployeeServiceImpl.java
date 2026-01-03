package com.example.employment.management.system.service.impl;

import com.example.employment.management.system.entity.Employee;
import com.example.employment.management.system.repository.EmployeeRepository;
import com.example.employment.management.system.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setStatus("Active");
        return repository.save(employee);
    }

    @Override
    public Page<Employee> getEmployees(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);

        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setPhone(employee.getPhone());
        existing.setDepartment(employee.getDepartment());
        existing.setJobRole(employee.getJobRole());
        existing.setSalary(employee.getSalary());
        existing.setStatus(employee.getStatus());

        return repository.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
