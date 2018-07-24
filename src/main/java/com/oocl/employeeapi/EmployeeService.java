package com.oocl.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    //EmployeeList employeeList = new EmployeeList();
    private List<Employee> employeeList = new ArrayList<>();
    Employee employee1 = new Employee(1,"小明",20,"男");
    Employee employee2 = new Employee(2,"小红",18,"女");

    EmployeeService(){
        employeeList.add(employee1);
        employeeList.add(employee2);
    }

//    public EmployeeList showEmp(){
//
//        return employeeList;
//    }
    public List<Employee> showEmp(){

        return employeeList;
    }

//    public Employee find(int id) {
//        return employeeList.findById(id);
//    }
//
//    public void add(Employee employee) {
//        employeeList.addEmployee(employee);
//    }

    public Employee find(int id) {
        return employeeList.get(id-1);
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(int id, Employee employee) {
        Employee employeeOri = find(id);
        if(employee.getAge()==0){
            employee.setAge(employeeOri.getAge());
        }
        if(employee.getName()==null){
            employee.setName(employeeOri.getName());
        }
        if(employee.getGender()==null){
            employee.setGender(employeeOri.getGender());
        }
        employee.setId(employeeOri.getId());
        employeeList.remove(employeeOri);
        employeeList.add(employee);
    }

    public void deleteEmployee(int id) {
        employeeList.remove(id-1);
    }
}
