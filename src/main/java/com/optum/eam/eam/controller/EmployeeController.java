package com.optum.eam.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optum.eam.eam.model.Employee;
import com.optum.eam.eam.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employeesList")
    public void employeeList() {
        saveEmployee();
    }

    private void saveEmployee() {
        Employee newEmployee = new Employee("Abhi", "1996");
        Employee savedEmployee = employeeRepository.save(newEmployee);
        System.out.println(" ---- employee saved " + savedEmployee.getId());

    }
}
