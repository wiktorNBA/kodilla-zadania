package com.kodilla.hibernate.manytomany;


import com.kodilla.hibernate.task.Task;

import java.util.ArrayList;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Company.retrieveCompaniesByFragmentOfTheName",
        query = "FROM Company WHERE substring(name,1, 3) = :FRAGMENT_OF_THE_NAME"
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Company() {
    }
    public Company(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }
    private void setId(int id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}