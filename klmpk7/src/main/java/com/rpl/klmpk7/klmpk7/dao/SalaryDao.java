package com.rpl.klmpk7.klmpk7.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rpl.klmpk7.klmpk7.model.Salary;

@Repository
public interface SalaryDao extends JpaRepository<Salary, Integer> {

    // Method untuk query data salary berdasarkan bulan
    @Query("SELECT s FROM Salary s WHERE MONTH(s.paymentDate) = :month")
    List<Salary> findByMonth(int month);
}