package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public Employee getEmployeeInfo(){
        Employee employee = new Employee(1,"小明",20,"男");
        return employeeService.showEmp(employee);
    }

}
