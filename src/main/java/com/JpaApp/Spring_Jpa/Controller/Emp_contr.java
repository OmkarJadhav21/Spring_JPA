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

//    @GetMapping(value = "/selectOne")
//    public Employee select(){
//    Employee a=emp_repo.findOne(1);           //select * ....where id=1
//    return a;
//    }

    @GetMapping(value = "/selectAll")
    List<Employee>select(){
        List<Employee>li=emp_repo.findAll();
        return li;
    }

    @GetMapping(value = "/selectByPath/{id}")
    public Employee selectByPath(@PathVariable Integer id){
        Employee b=emp_repo.findOne(id);
        return b;
    }

    @GetMapping(value = "/selectByParam")
    public Employee selectByParam(@RequestParam Integer id){
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

    @GetMapping(value = "/findByIdAndName")
    public List<Employee>findidname(@RequestParam Integer id,@RequestParam String name){
        List<Employee>list=emp_repo.findByIdAndName(id,name);
        return list;
    }

    @GetMapping(value = "/findByIdOrAddress")
    public List<Employee>findByIdOrAddress(@RequestParam Integer id,@RequestParam String address){
        List<Employee>list=emp_repo.findByIdOrAddress(id,address);
        return list;
    }

    @GetMapping(value = "/findByIdBetween")
    public List<Employee>findByIdBetween(@RequestParam Integer id1,@RequestParam Integer id2){
        List<Employee>list=emp_repo.findByIdBetween(id1,id2);
        return list;
    }

    @GetMapping(value = "/findByIdLessThan")
    public List<Employee>findByIdLessThan(@RequestParam Integer id){
        List<Employee>list=emp_repo.findByIdLessThan(id);
        return list;
    }

    @GetMapping(value = "/findByIdGreaterThan")
    public List<Employee>findByIdGreaterThan(@RequestParam Integer id){
        List<Employee>list=emp_repo.findByIdGreaterThan(id);
        return list;
    }

    @GetMapping(value = "/findByAddressAfter")
    public List<Employee>findByAddressAfter(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressAfter(address);        //Display addresses after given alphabet (of address)
        return list;
    }

    @GetMapping(value = "/findByAddressBefore")
    public List<Employee>findByAddressBefore(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressBefore(address);        //Display addresses Before given alphabet (of address)
        return list;
    }

    @GetMapping(value = "/findByAddressIsNull")
    public List<Employee>findByAddressIsNull(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressIsNull(address);
        return list;
    }

    @GetMapping(value = "/findByAddressLike")
    public List<Employee>findByAddressLike(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressLike(address);
        return list;
    }

    @GetMapping(value = "/findByAddressNotLike")
    public List<Employee>findByAddressNotLike(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressNotLike(address);
        return list;
    }

    @GetMapping(value = "/findByAddressStartingWith")
    public List<Employee>findByAddressStartingWith(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressStartingWith(address);
        return list;
    }

    @GetMapping(value = "/findByAddressEndingWith")
    public List<Employee>findByAddressEndingWith(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressEndingWith(address);
        return list;
    }

    @GetMapping(value = "/findByAddressContaining")
    public List<Employee>findByAddressContaining(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressContaining(address);
        return list;
    }

    @GetMapping(value = "/findByAddressOrderByIdDesc")
    public List<Employee>findByAddressOrderByIdDesc(@RequestParam String address){
        List<Employee>list=emp_repo.findByAddressOrderByIdDesc(address);
        return list;
    }

    @GetMapping(value = "/findByIdNot")
    public List<Employee>findByIdNot(@RequestParam Integer id ){
        List<Employee>list=emp_repo.findByIdNot(id);
        return list;
    }

    @GetMapping(value = "/findByIdTrue()")
    public List<Employee>findByIdTrue(@RequestParam Integer id ){
        List<Employee>list=emp_repo.findByIdTrue(id);
        return list;
    }


}

