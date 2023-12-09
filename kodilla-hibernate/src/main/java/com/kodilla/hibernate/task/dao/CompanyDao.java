package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesByFragmentOfTheName(@Param("FRAGMENT_OF_THE_NAME") String fragmentOfTheName);
}