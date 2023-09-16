package com.optum.eam.eam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optum.eam.eam.model.Employee;
import com.optum.eam.eam.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> employeeList() {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @GetMapping("/employees/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer empId) {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(empId), HttpStatus.OK);
    }

    @PostMapping("/employees/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee ee = new Employee(employee.getName(), employee.getDate());
        Employee savedEmployee = employeeService.saveEmployee(ee);
        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.OK);
    }

    @PostMapping("/employees/delete")
    public ResponseEntity<String> deleteEmployee(@RequestParam(name = "id", required = true) Integer empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<String>("Deleted " + empId, HttpStatus.OK);
    }

}
