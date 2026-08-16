package com.Project.EmployeeManagementSystem.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewEmployeeDto {
private String Name;
private String Email;
private String Employee_Id;
private Long Salary;
private String Department;
}
