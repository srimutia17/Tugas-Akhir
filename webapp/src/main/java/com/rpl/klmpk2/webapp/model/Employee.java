package com.rpl.klmpk2.webapp.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee") // nama tabel
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // field id
    private String name; // field name
    private String email; // field email
    private String division; // field division

    public Employee() {
    }

    public Employee(String name, String email, String division) {
        this.name = name;
        this.email = email;
        this.division = division;
    }

    @OneToMany(mappedBy = "employee")
    private Set<Salary> salaries; // Hubungan ke Salary

    public Set<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(Set<Salary> salaries) {
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", division=" + division + "]";
    }

}