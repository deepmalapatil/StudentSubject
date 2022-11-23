package com.example.StudentSubjectproject.repository;

import com.example.StudentSubjectproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer> {

   public List<Student> findBysname(String name);
}
