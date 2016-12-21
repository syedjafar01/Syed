package com.syed.entities;

import com.syed.pojo.PositionUi;

import javax.persistence.*;

/**
 * Created by syedjafar on 20/12/16.
 */
@Entity
@Table(name = "Position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "designation")
    private String designation;

    public Position() { }

    public Position(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Position(PositionUi p) {
        this.designation = p.getDesignation();
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
