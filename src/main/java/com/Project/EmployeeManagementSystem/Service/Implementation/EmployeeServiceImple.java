package com.Project.EmployeeManagementSystem.Service.Implementation;


import com.Project.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.Project.EmployeeManagementSystem.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImple implements EmployeeService{
private final EmployeeRepository employeeRepository;

}
