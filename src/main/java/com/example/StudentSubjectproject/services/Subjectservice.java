package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.StudentSubjectproject.repository.Subjectrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@ComponentScan("Repository")
public class Subjectservice {

    @Autowired
    Subjectrepository subjectRepository;

    public List<Subject> getallsubject(){
        List<Subject> subjects=new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addsubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updatesubject(Subject subject) {
        try {
            subjectRepository.save(subject);
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public void deletsubject(int id){
        subjectRepository.deleteById(id);
    }

    public Optional<Subject> getReferenceById(int id) {
        return subjectRepository.findById(id);

    }
}
