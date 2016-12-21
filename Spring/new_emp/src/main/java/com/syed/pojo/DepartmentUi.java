package com.syed.pojo;

/**
 * Created by syedjafar on 20/12/16.
 */
public class DepartmentUi {

    private int id;
    private String dept_name;

    public DepartmentUi() { }

    public DepartmentUi(int id, String dept_name) {
        this.id = id;
        this.dept_name = dept_name;
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
