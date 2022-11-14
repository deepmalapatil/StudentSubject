package com.example.StudentSubjectproject.controller;

import com.example.StudentSubjectproject.model.Employee;
import com.example.StudentSubjectproject.services.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class Employeecontroller {

    @Autowired
    Employeeservice employeeservice;

    @GetMapping(value="/Getall")
    public List<Employee> Getall(){
        return employeeservice.Getemployee();
    }
    @PostMapping(value = "/Saveemp")
    public void saveemployee(@RequestBody Employee employee) {
        employeeservice.Saveemployee(employee);
    }
    @PostMapping(value="/Updateemp")
    public void Updateemployee(@RequestBody Employee employee){
        employeeservice.updateemployee(employee);
    }

    @DeleteMapping(value="/Deletemp/{id}")
    public void deleteempid( @PathVariable Integer id){
        employeeservice.deleteempid(id);
    }

    @GetMapping(value="/getbyid/{id}")
    public Optional<Employee> findbyid(@PathVariable Integer id)
    {
      return employeeservice.findbyid(id) ;
    }



}


