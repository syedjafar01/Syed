package com.syed.pojo;

/**
 * Created by syedjafar on 20/12/16.
 */
public class PositionUi {

    private int id;
    private String designation;

    public PositionUi() { }

    public PositionUi(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
