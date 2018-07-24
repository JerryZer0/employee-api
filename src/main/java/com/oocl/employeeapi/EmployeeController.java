package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
//    public EmployeeList getEmployeeInfo(){
//        EmployeeList employeeList = employeeService.showEmp();
//        return employeeList;
//    }
    public List<Employee> getEmployeeInfo(){
        List<Employee> employeeList = employeeService.showEmp();
        return employeeList;
    }

    @GetMapping("employees/{id}")
    public Employee findEmployee(@PathVariable int id){
        Employee employee = employeeService.find(id);
        return employee;
    }

    @PostMapping("employees")
    public void addEmploee(@RequestBody Employee employee){
        System.out.println(employee.getAge());
        employeeService.add(employee);
    }

    @PutMapping("employees/{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
    }

    @DeleteMapping("employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }


}
