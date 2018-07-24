package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getEmployeeInfo(){
        Employee employee1 = new Employee(1,"小明",20,"男");
        Employee employee2 = new Employee(2,"小红",18,"女");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeService.showEmp(employeeList);
    }

}
