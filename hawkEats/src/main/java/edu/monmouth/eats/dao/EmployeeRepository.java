package edu.monmouth.eats.dao;

import org.springframework.data.repository.CrudRepository;

import edu.monmouth.eats.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
}
