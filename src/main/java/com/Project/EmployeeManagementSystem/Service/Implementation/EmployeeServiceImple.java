package com.Project.EmployeeManagementSystem.Service.Implementation;


import com.Project.EmployeeManagementSystem.DTO.EmployeeDto;
import com.Project.EmployeeManagementSystem.DTO.NewEmployeeDto;
import com.Project.EmployeeManagementSystem.Entity.Employee;
import com.Project.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.Project.EmployeeManagementSystem.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImple implements EmployeeService{
private final EmployeeRepository employeeRepository;
public List<EmployeeDto> getAllEmployee(int page,int size){
    Pageable pageable= PageRequest.of(page,size);
    Page<Employee> employeePage=employeeRepository.findAll(pageable);
    return employeePage.getContent().stream().map(employee1 -> new EmployeeDto(
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
            employee.getName(),
            employee.getEmail(),
            employee.getEmployee_Id(),
            employee.getSalary(),
            employee.getDepartment());
    newEmployee=employeeRepository.save(newEmployee);
    return new EmployeeDto(
            newEmployee.getId(),
            newEmployee.getName(),
            newEmployee.getEmail(),
            newEmployee.getEmployee_Id(),
            newEmployee.getSalary(),
            newEmployee.getDepartment()
    );
}
public EmployeeDto getEmployeeById(Long id){
    Employee employee=employeeRepository.findById(id).orElseThrow();
    return new EmployeeDto(employee.getId(),
            employee.getName(),
            employee.getEmail(),
            employee.getEmployee_Id(),
            employee.getSalary(),
            employee.getDepartment());
}
public EmployeeDto updateEmployeeById(Long id, NewEmployeeDto employee){
        Employee checkingEmployeeWithId=employeeRepository.findById(id).orElseThrow(()->
                new RuntimeException("Employee Not found with Id: "+id));
        checkingEmployeeWithId.setName(employee.getName());
        checkingEmployeeWithId.setEmail(employee.getEmail());
        checkingEmployeeWithId.setEmployee_Id(employee.getEmployee_Id());
        checkingEmployeeWithId.setSalary(employee.getSalary());
        checkingEmployeeWithId.setDepartment(employee.getDepartment());
        checkingEmployeeWithId=employeeRepository.save(checkingEmployeeWithId);
    return new EmployeeDto(checkingEmployeeWithId.getId(),
            checkingEmployeeWithId.getName(),
            checkingEmployeeWithId.getEmail(),
            checkingEmployeeWithId.getEmployee_Id(),
            checkingEmployeeWithId.getSalary(),
            checkingEmployeeWithId.getDepartment());
    }
public EmployeeDto deleteEmployeeById(Long id){
    Employee employee=employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with Id: "+id));
    employeeRepository.delete(employee);
        return new EmployeeDto(employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getEmployee_Id(),
                employee.getSalary(),
                employee.getDepartment());
    }
    public List<EmployeeDto> getEmployeesByDepartment(String department){
    return employeeRepository.findByDepartment(department)
            .stream().map(employee->new EmployeeDto(employee.getId(),
                            employee.getName(),
                            employee.getEmail(),
                            employee.getEmployee_Id(),
                            employee.getSalary(),
                            employee.getDepartment())
                    ).toList();
    }
    public List<EmployeeDto> getEmployeesByName(String name){
    return employeeRepository.findByName(name).stream().map(employee->
            new EmployeeDto(
                    employee.getId(),
                    employee.getName(),
                    employee.getEmail(),
                    employee.getEmployee_Id(),
                    employee.getSalary(),
                    employee.getDepartment()
            )).toList();
    }
    public List<EmployeeDto> getEmployeesByEmail(String email){
    return employeeRepository.findByEmail(email).stream().map(
            employee -> new EmployeeDto(employee.getId(),
                    employee.getName(),
                    employee.getEmail(),
                    employee.getEmployee_Id(),
                    employee.getSalary(),
                    employee.getDepartment())
    ).toList();
    }
    public List<EmployeeDto> addBulkEmployees(List<NewEmployeeDto> employee){
    return employee.stream().map(this::addEmployee).toList();
    }

}
