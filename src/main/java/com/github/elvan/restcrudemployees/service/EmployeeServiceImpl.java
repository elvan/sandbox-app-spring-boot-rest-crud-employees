package com.github.elvan.restcrudemployees.service;

import java.util.List;

import com.github.elvan.restcrudemployees.dao.EmployeeDAO;
import com.github.elvan.restcrudemployees.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDAO employeeDAO;

  public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  @Override
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }

}
