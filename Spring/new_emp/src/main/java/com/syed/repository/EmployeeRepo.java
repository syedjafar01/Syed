package com.syed.repository;

import com.syed.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by syedjafar on 20/12/16.
 */
@Transactional
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {


}
