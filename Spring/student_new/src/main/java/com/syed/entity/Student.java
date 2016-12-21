package com.syed.entity;

import com.syed.pojo.StudentUi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by syedjafar on 19/12/16.
 */
@Entity
@Table( name = "students")
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;

    @NotNull
    private String name;

    @NotNull
    private int rollno;

    public Student() { }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public Student(StudentUi s) {
        this.name = s.getName();
        this.rollno = s.getRollno();
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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
