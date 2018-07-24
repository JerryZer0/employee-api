package com.oocl.employeeapi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList = new ArrayList<>();

    EmployeeList(){
        Employee employee1 = new Employee(1,"小明",20,"男");
        Employee employee2 = new Employee(2,"小红",18,"女");
        this.employeeList.add(employee1);
        this.employeeList.add(employee2);
    }
    public List<Employee> addEmployee(Employee employee){
        this.employeeList.add(employee);
        return this.employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getNumber(){
        return employeeList.size();
    }

    public Employee findById(int id){
        return employeeList.get(id-1);
    }
}
