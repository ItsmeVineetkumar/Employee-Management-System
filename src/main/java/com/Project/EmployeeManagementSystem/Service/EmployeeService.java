package com.Project.EmployeeManagementSystem.Service;


import com.Project.EmployeeManagementSystem.DTO.EmployeeDto;
import com.Project.EmployeeManagementSystem.DTO.NewEmployeeDto;
import com.Project.EmployeeManagementSystem.Entity.Employee;
import jakarta.validation.Valid;

import java.util.*;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployee(int page,int size);
    EmployeeDto addEmployee(NewEmployeeDto e);
    EmployeeDto getEmployeeById(Long id);
    EmployeeDto updateEmployeeById(Long id,NewEmployeeDto e);
    EmployeeDto deleteEmployeeById(Long id);
    List<EmployeeDto> getEmployeesByDepartment(String department);
    List<EmployeeDto> getEmployeesByName(String name);
    List<EmployeeDto> getEmployeesByEmail(String email);
    List<EmployeeDto> addBulkEmployees(List<@Valid NewEmployeeDto> employee);
}
