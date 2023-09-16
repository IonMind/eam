package com.optum.eam.eam.service;

import java.util.List;

import com.optum.eam.eam.model.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public void updateEmployee(Integer employeeId);

    public void deleteEmployee(Integer employeeId);

    public Employee getEmployeeById(Integer employeeId);

    public List<Employee> getEmployees();

}
