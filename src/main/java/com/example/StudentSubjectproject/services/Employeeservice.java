package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Employee;
import com.example.StudentSubjectproject.repository.Employeerepository;
import com.example.StudentSubjectproject.repository.Subjectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class Employeeservice {

    @Autowired
    Employeerepository employeerepository;

    @Autowired
    Subjectrepository subjectrepository;


    public List<Employee> Getemployee() {
        List<Employee> employeeList = employeerepository.findAll();
        // employeerepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    public void Saveemployee(Employee employee) {
        employeerepository.save(employee);

    }

    public void updateemployee(Employee employee) {
        employeerepository.save(employee);
    }

    public void deleteempid(Integer id) {
        employeerepository.deleteById(id);
    }

    public Employee findbyid(Integer id) {
        Employee employee = new Employee();
        List<Employee> emp = employeerepository.findAll();
        for (Employee employee1 : emp) {
            if(Objects.equals(employee1.getId(), id)){
                employee = employee1;
            break;
        }
    }
       return employee;
    }

    // Get by name mathod
    public Employee getbyname(String name) {
        Employee emp = new Employee();
        List<Employee> employee = employeerepository.findAll();
        for (Employee employee1 : employee) {
            if (employee1.getName().trim().equalsIgnoreCase(name)) {
                emp = employee1;
                break;
            }
        }
        return emp;
    }

    //get by salary method

    public Employee GetBySalary(Float Salary) {
        Employee emp = new Employee();
        List<Employee> employeeList = employeerepository.findAll();
        for (Employee employee : employeeList) {
            if (employee.getSalary()==Salary) {
                emp = employee;
                break;
            }
        }
        return emp;
    }

    //get by age method
    public Employee Getbyage(Integer age) {
        Employee emp = new Employee();
        List<Employee> employeeList = employeerepository.findAll();
        for (Employee employee : employeeList) {
            if (employee.getAge()==age) {
                emp = employee;
                break;
            }
        }
return emp;
    }

}


