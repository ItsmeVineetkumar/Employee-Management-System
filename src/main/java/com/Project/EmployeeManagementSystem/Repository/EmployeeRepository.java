package com.Project.EmployeeManagementSystem.Repository;

import com.Project.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
