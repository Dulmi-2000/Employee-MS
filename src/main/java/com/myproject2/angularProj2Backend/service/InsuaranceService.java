package com.myproject2.angularProj2Backend.service;

import com.myproject2.angularProj2Backend.exception.UserNotFoundException;
import com.myproject2.angularProj2Backend.model.Employee;
import com.myproject2.angularProj2Backend.model.EmployeeInduarance;
import com.myproject2.angularProj2Backend.repository.EmployeeInsuarancePepo;
import com.myproject2.angularProj2Backend.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class InsuaranceService {

    private EmployeeInsuarancePepo insuaranceRepo;


    public InsuaranceService(EmployeeInsuarancePepo insuaranceRepo){
        this.insuaranceRepo=insuaranceRepo;
    }

    //add
    public EmployeeInduarance addEmployeeInsuarance(EmployeeInduarance employeeIns) {
        return insuaranceRepo.save(employeeIns);
    }



}
