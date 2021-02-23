package edu.monmouth.eats.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.monmouth.eats.entities.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
