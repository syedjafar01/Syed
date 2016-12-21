package com.syed.entities;

import com.syed.pojo.DepartmentUi;

import javax.persistence.*;

/**
 * Created by syedjafar on 20/12/16.
 */
@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "dept_name")
    private String dept_name;


    public Department() { }

    public Department(int id, String dept_name) {
        this.id = id;
        this.dept_name = dept_name;
    }

    public Department(DepartmentUi d) {
        this.dept_name = d.getDept_name();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
