package com.example.StudentSubjectproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="employee1")
public class Employee {
    @Id
    @Column(name="id")
    int eid;
    String name;
    int age;
    final int dptno=1;
    float salary;



    public int getId() {
        return eid;
    }

    public void setId(int id) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptno() {
        return dptno;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
