package com.Project.EmployeeManagementSystem.Service.Implementation;


import com.Project.EmployeeManagementSystem.DTO.EmployeeDto;
import com.Project.EmployeeManagementSystem.DTO.NewEmployeeDto;
import com.Project.EmployeeManagementSystem.Entity.Employee;
import com.Project.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.Project.EmployeeManagementSystem.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImple implements EmployeeService{
private final EmployeeRepository employeeRepository;
public List<EmployeeDto> getAllEmployee(){
    List<Employee> employee=employeeRepository.findAll();
    return employee.stream().map(employee1 -> new EmployeeDto(
            employee1.getId(),
            employee1.getName(),
            employee1.getEmail(),
            employee1.getEmployee_Id(),
            employee1.getSalary(),
            employee1.getDepartment()
    )).toList();
}
public EmployeeDto addEmployee(NewEmployeeDto employee){
    Employee newEmployee=new Employee(
            employee.getId(),
            employee.getName(),
            employee.getEmail(),
            employee.getEmployee_Id(),
            employee.getSalary(),
            employee.getDepartment());
    employeeRepository.save(newEmployee);
    return new EmployeeDto(
            employee.getId(),
            employee.getName(),
            employee.getEmail(),
            employee.getEmployee_Id(),
            employee.getSalary(),
            employee.getDepartment()
    );
}
}
