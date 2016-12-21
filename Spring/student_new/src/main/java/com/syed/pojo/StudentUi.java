package com.syed.pojo;

/**
 * Created by syedjafar on 19/12/16.
 */


public class StudentUi {

    private int id;
    private String name;
    private int rollno;

    public StudentUi() { }

    public StudentUi(int id) {
        this.id = id;
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
