package com.syed.repository;

/**
 * Created by syedjafar on 20/12/16.
 */

import com.syed.entities.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;


public interface DepartmentRepo extends CrudRepository<Department, Integer> {


}
