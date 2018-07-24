package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getEmployeeInfo(){
        EmployeeList employeeList = new EmployeeList();
        List<Employee> empList = employeeList.getEmployeeList();
        return employeeService.showEmp(empList);
    }

//    @PostMapping("employees/{name}")
//    public String addEmployee(){
//        return
//    }


}
