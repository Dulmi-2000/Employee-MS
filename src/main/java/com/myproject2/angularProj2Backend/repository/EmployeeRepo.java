package com.myproject2.angularProj2Backend.repository;

import com.myproject2.angularProj2Backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

     void deleteEmployeeById(Long id);

     Optional<Employee> findEmployeeById(Long id);
}
