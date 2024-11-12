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

  @Override
  public Employee findById(int theId) {

    // get employee
    Employee theEmployee = entityManager.find(Employee.class, theId);

    // return employee
    return theEmployee;
  }

  @Override
  public Employee save(Employee theEmployee) {

    // save employee
    Employee dbEmployee = entityManager.merge(theEmployee);

    // return the dbEmployee
    return dbEmployee;
  }

  @Override
  public void deleteById(int theId) {

    // find employee by id
    Employee theEmployee = entityManager.find(Employee.class, theId);

    // remove employee
    entityManager.remove(theEmployee);
  }

}
