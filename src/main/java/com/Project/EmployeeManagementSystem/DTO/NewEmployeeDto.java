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
private String name;
private String email;
private String employee_Id;
private Long salary;
private String department;
}
