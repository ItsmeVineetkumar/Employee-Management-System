package com.Project.EmployeeManagementSystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;
    private String employee_Id;
    @Positive
    private Long salary;
    private String department;

    /*
    private String Phone_No;
    private Date DateOfBirth;
    private Date JoiningDate;
    private Long Salary;
    private String Department;
    private String Designation;
    private String EmploymentType;
    private String Status;
    private String Address;
    private Date createdAt;
    private Date updatedAt;
     */
public Employee(String name,String email,String emp_id,Long salary,String dept){
    this.name=name;
    this.email=email;
    this.employee_Id=emp_id;
    this.salary=salary;
    this.department=dept;
}
}
