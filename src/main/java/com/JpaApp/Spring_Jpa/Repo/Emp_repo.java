package com.JpaApp.Spring_Jpa.Repo;

import com.JpaApp.Spring_Jpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Emp_repo extends JpaRepository<Employee,Integer> {
    List<Employee> findByIdAndName(Integer id, String name);

    List<Employee> findByIdOrAddress(Integer id, String address);

    List<Employee> findByIdBetween(Integer id1, Integer id2);

    List<Employee> findByIdLessThan(Integer id);

    List<Employee> findByIdGreaterThan(Integer id);

    List<Employee> findByAddressAfter(String address);

    List<Employee> findByAddressBefore(String address);

    List<Employee> findByAddressIsNull(String address);

    List<Employee> findByAddressLike(String address);

    List<Employee> findByAddressNotLike(String address);

    List<Employee> findByAddressStartingWith(String address);

    List<Employee> findByAddressEndingWith(String address);

    List<Employee> findByAddressContaining(String address);

    List<Employee> findByAddressOrderByIdDesc(String address);

    List<Employee> findByIdNot(Integer id);

    List<Employee> findByIdTrue(Integer id);
}
