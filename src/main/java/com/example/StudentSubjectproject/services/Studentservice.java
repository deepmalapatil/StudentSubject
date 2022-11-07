package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.StudentSubjectproject.repository.Studentrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@ComponentScan("Repository")
public class Studentservice {

    @Autowired
    Studentrepository studentrepository;

    public List<Student> getallstudent(){
        List<Student> studentList=new ArrayList<>();
        studentrepository.findAll().forEach(studentList::add);
        return studentList;
    }

    public void addstudent(Student student){

        studentrepository.save(student);
    }
    public void updatestudent(Student student){
            studentrepository.save(student);
    }
    public void deletstudent(int id){

        studentrepository.deleteById(id);
    }

    public Optional<Student> getstudentbyid(int id){
        return studentrepository.findById(id);

    }
   }
