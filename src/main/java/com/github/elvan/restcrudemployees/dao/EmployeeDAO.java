package com.github.elvan.restcrudemployees.dao;

import java.util.List;

import com.github.elvan.restcrudemployees.entity.Employee;

public interface EmployeeDAO {

  List<Employee> findAll();

}
