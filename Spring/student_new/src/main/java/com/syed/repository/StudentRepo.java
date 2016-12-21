package com.syed.repository;

import org.springframework.data.repository.CrudRepository;
import com.syed.entity.Student;

import javax.transaction.Transactional;

/**
 * Created by syedjafar on 19/12/16.
 */
@Transactional
public interface StudentRepo extends CrudRepository<Student, Integer> {

    public Student findById(int id);

}
