package com.Project.EmployeeManagementSystem.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
private Long Id;
private String Name;
private String Email;
private String Employee_id;
private Long Salary;
private String Department;
}
