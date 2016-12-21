package com.syed.entities;

import com.syed.pojo.EmployeeUi;

import javax.persistence.*;

/**
 * Created by syedjafar on 20/12/16.
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "department")
    Department dept_name;

    @ManyToOne
    @JoinColumn(name = "position")
    Position designation;

    public Employee() { }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Employee(EmployeeUi e) {
        this.name = e.getName();
        this.age = e.getAge();

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

    public Department getDept_name() {
        return dept_name;
    }

    public void setDept_name(Department dept_name) {
        this.dept_name = dept_name;
    }

    public Position getDesignation() {
        return designation;
    }

    public void setDesignation(Position designation) {
        this.designation = designation;
    }
}
