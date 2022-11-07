package com.example.StudentSubjectproject.services;


import com.example.StudentSubjectproject.model.Student;
import com.example.StudentSubjectproject.model.StudentSubject;

import com.example.StudentSubjectproject.model.Subject;
import com.example.StudentSubjectproject.repository.Studentrepository;
import com.example.StudentSubjectproject.repository.Subjectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class StudentSubjectService {


    @Autowired
    Studentrepository studentrepository;

    @Autowired
    Subjectrepository subjectrepository;

    public StudentSubject getall(){
        StudentSubject stdsub=new StudentSubject();
        stdsub.std=(studentrepository.findAll());
        stdsub.sub=(subjectrepository.findAll());
        return stdsub;
    }



}