package com.Project.EmployeeManagementSystem.Repository;

import com.Project.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
List<Employee> findByDepartment(String department);
List<Employee> findByName(String name);
List<Employee> findByEmail(String email);
}
