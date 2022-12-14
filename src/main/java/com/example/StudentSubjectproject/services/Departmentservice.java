package com.example.StudentSubjectproject.services;

import com.example.StudentSubjectproject.model.Department;
import com.example.StudentSubjectproject.model.Employee;
import com.example.StudentSubjectproject.repository.Departmentreposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Departmentservice {

    @Autowired
    Departmentreposytory departmentreposytory;

    public List<Department> getalldepartment(){
        List<Department> list=departmentreposytory.findAll();
                return list;
    }

    public boolean Adddepartment(Department department){
      boolean result=true;
      try {
          departmentreposytory.save(department);
      }
      catch (Exception e){
          System.out.println(e.toString());
          result=false;
          throw e;
      }
return result;
    }

    public void deletdepartment(Integer id){
        departmentreposytory.deleteById(id);
    }

    public Department getbyid(Integer id){
        Department dpt=new Department();
        List<Department> departmentList=departmentreposytory.findAll();
        for (Department department:departmentList){
            if(department.getId()==id){
                dpt=department;
            }
        }
        return dpt;
    }

    public Department getbyname(String name){
        Department dpt=new Department();
        List<Department> departmentList=departmentreposytory.findAll();
            for (Department department : departmentList) {
                //  if (department != null && department.getName() != null) {
                if (department.getName().trim().equalsIgnoreCase(name)) {
                    dpt = department;
                    break;
                    // }

                }
            }


        return dpt;

    }

    public Department getbyeno(Integer eno) {
        Department dpt=new Department();
        List<Department> departmentList=departmentreposytory.findAll();
        for(Department department:departmentList){

            if (department.getEno()==eno){
                dpt=department;
                break;
            }
        }
        return dpt;
    }
}
