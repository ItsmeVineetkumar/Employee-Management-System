package com.Project.EmployeeManagementSystem.Service;


import com.Project.EmployeeManagementSystem.DTO.EmployeeDto;
import com.Project.EmployeeManagementSystem.DTO.NewEmployeeDto;
import com.Project.EmployeeManagementSystem.Entity.Employee;

import java.util.*;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployee();
    EmployeeDto addEmployee(NewEmployeeDto e);
    EmployeeDto getEmployeeById(Long id);
    EmployeeDto updateEmployeeById(Long id,NewEmployeeDto e);
    EmployeeDto deleteEmployeeById(Long id);
}
