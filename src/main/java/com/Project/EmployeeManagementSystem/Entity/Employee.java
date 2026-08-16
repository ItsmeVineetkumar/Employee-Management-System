package com.Project.EmployeeManagementSystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;
    private String Email;
    private String Employee_Id;
    private Long Salary;
    private String Department;
public Employee(String name,String email,String emp_id,Long salary,String dept){
    this.Name=name;
    this.Email=email;
    this.Employee_Id=emp_id;
    this.Salary=salary;
    this.Department=dept;
}
}
