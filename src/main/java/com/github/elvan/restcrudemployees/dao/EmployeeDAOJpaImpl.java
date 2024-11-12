package com.github.elvan.restcrudemployees.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import com.github.elvan.restcrudemployees.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

  // define field for entitymanager
  private EntityManager entityManager;

  // set up constructor injection
  public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
    entityManager = theEntityManager;
  }

  @Override
  public List<Employee> findAll() {

    // create a query
    TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

    // execute query and get result list
    List<Employee> employees = theQuery.getResultList();

    // return the results
    return employees;
  }

}
