package com.example.StudentSubjectproject.controller;

import com.example.StudentSubjectproject.model.Department;
import com.example.StudentSubjectproject.services.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class Departmentcontroller {
    @Autowired
    Departmentservice departmentservice;

    @GetMapping(value="/Getall")
    public List<Department> getalldepartment(){
        return departmentservice.getalldepartment();
    }

    @PostMapping(value="/Adddepartment")
    public void Adddepartment(@RequestBody Department department){
        departmentservice.Adddepartment(department);
    }

    @DeleteMapping(value="/Deletedepartment/{id}")
    public void deletdepartment(@PathVariable Integer id){
        departmentservice.deletdepartment(id);
    }
    @GetMapping(value="/getbyid/{id}")
    public Department getbyid(@PathVariable Integer id){
        return departmentservice.getbyid(id);
    }

    @GetMapping(value="/getbyeno/{eno}")
    public Department getbeeno(@PathVariable Integer eno){
        return departmentservice.getbyeno(eno);
    }

    @GetMapping(value="/getbyname/{name}")
    public Department getbyname(@PathVariable String name){

        return departmentservice.getbyname(name);
    }
}
