package com.syed.service;


import com.syed.entities.Department;
import com.syed.entities.Employee;
import com.syed.entities.Position;
import com.syed.pojo.EmployeeUi;
import com.syed.repository.DepartmentRepo;
import com.syed.repository.EmployeeRepo;
import com.syed.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by syedjafar on 20/12/16.
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    DepartmentRepo departmentRepo;

    @Autowired
    PositionRepo positionRepo;

    public String create(EmployeeUi em) throws Exception {

        Employee e1 = new Employee(em);
        try {
            Department d = departmentRepo.findOne(em.getDepartment());
            Position p = positionRepo.findOne(em.getPosition());

            if (d == null && p == null) throw new Exception("Both department and position not found");
            else if (d == null) throw new Exception("Department not found");
            else if (p == null) throw new Exception("Position not found");

            e1.setDept_name(d);
            e1.setDesignation(p);

            employeeRepo.save(e1);
        }
        catch (Exception e) {
            throw e;
        }
        return "User successfully created! (id = " + e1.getId() + ")";
    }



}
