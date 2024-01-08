package com.myproject2.angularProj2Backend.controller;

import com.myproject2.angularProj2Backend.model.Employee;
import com.myproject2.angularProj2Backend.model.EmployeeInduarance;
import com.myproject2.angularProj2Backend.repository.EmployeeInsuarancePepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:49234/")
@RequestMapping("api/v1/employeeP")
public class EmployeensInsuranceController {

    @Autowired
    private EmployeeInsuarancePepo employeeInsuarancePepo;

    @GetMapping("/insuarance")
    public List<EmployeeInduarance> getAllEmployeeInsuarance() {
        return employeeInsuarancePepo.findAll();
    }


    //add employee
    @PostMapping("/add")
    public ResponseEntity<EmployeeInduarance> addEmployeeInsuarance(@RequestBody EmployeeInduarance employeeIns) {
        EmployeeInduarance employee1 = employeeInsuarancePepo.save(employeeIns);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
}