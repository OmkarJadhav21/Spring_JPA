package com.JpaApp.Spring_Jpa.Controller;

import com.JpaApp.Spring_Jpa.Model.Forme;
import com.JpaApp.Spring_Jpa.Repo.Form_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Form_controller {

    @Autowired
    Form_repo form_repo;

    @PostMapping(value = "/insertIntodb")
    String insert(@RequestBody Forme forme){
    form_repo.save(forme);
    return "success";
    }

@CrossOrigin(value = "*")
    @GetMapping(value = "/getValues/{name}/{pass}")
    String data(@PathVariable String name,@PathVariable String pass){
        if (pass.equals("om")&& name.equals("om")){
            return "success";
        }else return "fail";

    }
}
