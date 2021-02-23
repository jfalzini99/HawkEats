package edu.monmouth.eats.dao;

import org.springframework.data.repository.CrudRepository;

import edu.monmouth.eats.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
