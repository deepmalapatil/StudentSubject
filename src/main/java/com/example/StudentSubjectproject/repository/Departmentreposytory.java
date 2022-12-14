package com.example.StudentSubjectproject.repository;

import com.example.StudentSubjectproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface Departmentreposytory  extends JpaRepository<Department,Integer> {
}
