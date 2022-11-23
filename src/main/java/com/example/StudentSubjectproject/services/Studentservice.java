package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.StudentSubjectproject.repository.Studentrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@ComponentScan("Repository")
public class Studentservice {

    @Autowired
    Studentrepository studentrepository;

    public List<Student> getallstudent() {
        List<Student> studentList = new ArrayList<>();
        studentList=studentrepository.findAll();//forEach(studentList::add);
        return studentList;
    }

    public boolean addstudent(Student student) {
        boolean result = true;
        try {
            studentrepository.save(student);

        } catch (Exception ex) {
            System.out.println(ex.toString());
            result = false;
            throw ex;
        }

        return result;
    }

    public void updatestudent(Student student) {
        studentrepository.save(student);
    }

    public void deletstudent(int id) {

        studentrepository.deleteById(id);
    }

    public Optional<Student> getstudentbyid(int id) {
        return studentrepository.findById(id);

    }

    public List<Student> getbyname(String name) {
       /* Student std = new Student();
        List<Student> lstd = studentrepository.findAll();
        for (Student student : lstd) {
            if (student.getSname().equalsIgnoreCase(name)) {
              std=student;
            }
        }*/

        return studentrepository.findBysname(name);
    }
}

