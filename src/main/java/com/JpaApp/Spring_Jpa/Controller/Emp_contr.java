package com.JpaApp.Spring_Jpa.Controller;

import com.JpaApp.Spring_Jpa.Model.Employee;
import com.JpaApp.Spring_Jpa.Repo.Emp_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Emp_contr {

    @Autowired
    Emp_repo emp_repo;



    @PostMapping(value = "/insert")
    public String insert(@RequestBody Employee employee){
    emp_repo.save(employee);
    return "Data Inserted ";
    }

//    @GetMapping(value = "selectOne")
//    public Employee select(){
//    Employee a=emp_repo.findOne(1);           //select * ....where id=1
//    return a;
//    }

    @GetMapping(value = "selectAll")
    List<Employee>select(){
        List<Employee>li=emp_repo.findAll();
        return li;
    }
    @GetMapping(value = "selectByPath/{id}")
    public Employee selectByPath(@PathVariable Integer id){
        Employee b=emp_repo.findOne(id);
        return b;
    }

    @PostMapping(value = "/delete")
    public String delete(){
        emp_repo.delete(4);
        return "Info Deleted";
    }


    @PostMapping(value = "/deleteAll")
    public String deleteAll(){
        emp_repo.deleteAll();
        return "All Information Deleted";
    }

    @PostMapping(value = "/deletByParam")
    public String deletByParam(@RequestParam Integer id){
        emp_repo.delete(id);
        return "Value deleted";
    }


}

