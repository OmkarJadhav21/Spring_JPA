package com.JpaApp.Spring_Jpa.Repo;

import com.JpaApp.Spring_Jpa.Model.Forme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Form_repo extends JpaRepository<Forme,String> {

}
