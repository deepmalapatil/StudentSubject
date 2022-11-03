package com.example.StudentSubjectproject.repository;


import com.example.StudentSubjectproject.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Subjectrepository extends JpaRepository<Subject,Integer>{
}