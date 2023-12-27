package com.rpl.klmpk2.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpl.klmpk2.webapp.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}