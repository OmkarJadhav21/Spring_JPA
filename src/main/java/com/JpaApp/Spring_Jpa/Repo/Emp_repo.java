package com.JpaApp.Spring_Jpa.Repo;

import com.JpaApp.Spring_Jpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emp_repo extends JpaRepository<Employee,Integer> {
}
