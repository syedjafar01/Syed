package com.syed.pojo;

/**
 * Created by syedjafar on 20/12/16.
 */
public class EmployeeUi {

    private int id;
    private String name;
    private int age;
    private int department;
    private int position;

    public EmployeeUi() { }

    public EmployeeUi(int id, String name, int age, int department, int position) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
