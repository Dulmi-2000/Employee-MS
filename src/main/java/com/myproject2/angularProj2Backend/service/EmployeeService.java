package com.myproject2.angularProj2Backend.service;
import com.myproject2.angularProj2Backend.exception.UserNotFoundException;
import com.myproject2.angularProj2Backend.model.Employee;
import com.myproject2.angularProj2Backend.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {


    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;
    }

    //add
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
//select
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
//update
public Employee updateEmployee(Employee employee) {
    // Check if the employee exists in the database
    Employee existingEmployee = employeeRepo.findById(employee.getId()).orElse(null);

    if (existingEmployee != null) {
        // Update the existing employee fields
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setPhone(employee.getPhone());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setAvatar(employee.getAvatar());

        // Save the updated employee
        return employeeRepo.save(existingEmployee);
    } else {
        // Handle the case where the employee does not exist
        // Maybe throw an exception or handle it as per your requirements
        return null;
    }
}
//find by id
    public Employee findEmployeeById(Long id){
     return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User by id " +"was not found"));
    }
    //delete employee

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id); // Or your delete logic
    }


}
