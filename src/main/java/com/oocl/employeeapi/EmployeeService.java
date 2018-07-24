package com.oocl.employeeapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeList employeeList = new EmployeeList();

    public EmployeeList showEmp(){

        return employeeList;
    }

    public Employee find(int id) {
        return employeeList.findById(id);
    }
}
