package com.github.elvan.restcrudemployees.rest;

import java.util.List;

import com.github.elvan.restcrudemployees.dao.EmployeeDAO;
import com.github.elvan.restcrudemployees.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeDAO employeeDAO;

  // quick and dirty: inject employee dao (use constructor injection)
  public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  // expose "/employees" and return a list of employees
  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }

}
