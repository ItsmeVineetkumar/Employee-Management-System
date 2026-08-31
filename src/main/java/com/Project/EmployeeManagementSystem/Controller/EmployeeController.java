package com.Project.EmployeeManagementSystem.Controller;


import com.Project.EmployeeManagementSystem.DTO.EmployeeDto;
import com.Project.EmployeeManagementSystem.DTO.NewEmployeeDto;
import com.Project.EmployeeManagementSystem.Entity.Employee;
import com.Project.EmployeeManagementSystem.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequiredArgsConstructor

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Hi Brother welcome in Employee Management System";
    }
    @GetMapping("/api/employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employee=employeeService.getAllEmployee();
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/api/addEmployee")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody NewEmployeeDto employee){
        EmployeeDto employeeDto=employeeService.addEmployee(employee);
        return ResponseEntity.ok().body(employeeDto);
    }

    @GetMapping("/api/employee/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeByID(@PathVariable Long id){
        EmployeeDto employee=employeeService.getEmployeeById(id);
        return ResponseEntity.ok().body(employee);
    }

    @PutMapping("/api/employee/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeById(@PathVariable Long id,
                                                          @RequestBody NewEmployeeDto employee){
        System.out.println("put mapping is running");
        System.out.println("Id is: "+id);
        EmployeeDto updatedEmployee=employeeService.updateEmployeeById(id,employee);
        return ResponseEntity.ok().body(updatedEmployee);
    }

    @DeleteMapping("/api/employee/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployeeById(@PathVariable Long id){
        EmployeeDto DeletedEmployee=employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok().body(DeletedEmployee);
    }
}
