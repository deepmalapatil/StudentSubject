package com.example.StudentSubjectproject.controller;

import com.example.StudentSubjectproject.model.Student;
import com.example.StudentSubjectproject.model.StudentSubject;
import com.example.StudentSubjectproject.services.StudentSubjectService;
import com.example.StudentSubjectproject.services.Studentservice;
import com.example.StudentSubjectproject.services.Subjectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;
import java.util.List;

@RestController
@RequestMapping("/StudentSubject")
public class SudentSubjectController {



    @Autowired
    StudentSubjectService studentsubjectservice;

    @RequestMapping(method = RequestMethod.GET, value = "/GetallStudentsubject")
    public StudentSubject getall() {

        return studentsubjectservice.getall();
    }

}
