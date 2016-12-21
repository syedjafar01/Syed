package com.syed.service;

import com.syed.entities.Department;
import com.syed.entities.Employee;
import com.syed.pojo.DepartmentUi;
import com.syed.pojo.EmployeeUi;
import com.syed.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by syedjafar on 21/12/16.
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;
    public String create(DepartmentUi d) {

        Department d1 = new Department(d);
        try {
            departmentRepo.save(d1);
        }
        catch (Exception e) {
            return "Error creating the user: " + e.toString();
        }
        return "User successfully created! (id = " + d1.getId() + ")";
    }

}
