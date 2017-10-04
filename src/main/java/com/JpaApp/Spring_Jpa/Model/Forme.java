package com.JpaApp.Spring_Jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Forme {
    @Id
    String name;

    @Override
    public String toString() {
        return "Forme{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    String pass;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
