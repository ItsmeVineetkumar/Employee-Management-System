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
}
