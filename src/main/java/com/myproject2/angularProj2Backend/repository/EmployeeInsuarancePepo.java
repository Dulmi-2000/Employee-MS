package com.myproject2.angularProj2Backend.repository;

import com.myproject2.angularProj2Backend.model.EmployeeInduarance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInsuarancePepo extends JpaRepository<EmployeeInduarance, Integer> {
}
