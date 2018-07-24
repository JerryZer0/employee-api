package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public EmployeeList getEmployeeInfo(){
        EmployeeList employeeList = employeeService.showEmp();
        return employeeList;
    }

    @GetMapping("employees/{id}")
    public int findEmployee(@PathVariable int id){
        //Employee employee = employeeService.find(id);
        //return employee;
        return id;
    }


}
