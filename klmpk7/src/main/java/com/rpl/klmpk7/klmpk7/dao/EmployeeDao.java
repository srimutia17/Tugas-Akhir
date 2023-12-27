package com.rpl.klmpk7.klmpk7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpl.klmpk7.klmpk7.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}