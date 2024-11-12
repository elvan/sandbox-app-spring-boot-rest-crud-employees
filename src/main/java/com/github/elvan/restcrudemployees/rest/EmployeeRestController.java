package com.github.elvan.restcrudemployees.rest;

import java.util.List;

import com.github.elvan.restcrudemployees.entity.Employee;
import com.github.elvan.restcrudemployees.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeService employeeService;

  // quick and dirty: inject employee dao (use constructor injection)
  public EmployeeRestController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  // expose "/employees" and return a list of employees
  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeService.findAll();
  }

}
