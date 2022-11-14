package com.example.StudentSubjectproject.repository;

import com.example.StudentSubjectproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
