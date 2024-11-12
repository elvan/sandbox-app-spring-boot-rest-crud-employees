package com.github.elvan.restcrudemployees.dao;

import com.github.elvan.restcrudemployees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  // that's it ... no need to write any code LOL!

}
