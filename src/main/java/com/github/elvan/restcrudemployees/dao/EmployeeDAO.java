package com.github.elvan.restcrudemployees.dao;

import java.util.List;

import com.github.elvan.restcrudemployees.entity.Employee;

public interface EmployeeDAO {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);

}
