package com.Project.EmployeeManagementSystem.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
private Long id;
private String name;
private String email;
private String employee_id;
private Long salary;
private String department;
}
