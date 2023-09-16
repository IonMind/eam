package com.optum.eam.eam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optum.eam.eam.model.Employee;
import com.optum.eam.eam.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepo.save(employee);
        return savedEmployee;
    }

    @Override
    public void updateEmployee(Integer employeeId) {

    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        employeeRepo.deleteById(employeeId);
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeRepo.findById(employeeId).orElseThrow();

    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

}
