package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Employee;
import com.example.StudentSubjectproject.repository.Employeerepository;
import com.example.StudentSubjectproject.repository.Subjectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Employeeservice {

   @Autowired
    Employeerepository employeerepository;

   @Autowired
    Subjectrepository subjectrepository;

   public List<Employee> Getemployee(){
       List<Employee> employeeList=new ArrayList<>();
       employeerepository.findAll().forEach(employeeList::add);
       return employeeList;
   }

   public void Saveemployee(Employee employee){
       employeerepository.save(employee);

   }

   public void updateemployee(Employee employee){
       employeerepository.save(employee);
   }

    public void deleteempid(Integer id){
       employeerepository.deleteById(id);
    }

    public Optional<Employee> findbyid(Integer id) {

        return employeerepository.findById(id);
    }


}
