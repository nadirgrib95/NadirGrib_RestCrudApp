package com.example.HomeExercise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * This is the entity that would be mapped to the data sent between the DB and the project server.
 */
@Entity
public class Student {

    @Id
    private Long id;
    private String name;
    private double fees;
    private String subName;

    /**
     * Default constructor
     */
    public Student () {
    }

    /**
     * Constructor to initialise a new student
     * @param id
     * @param name
     * @param fees
     */
    public Student(Long id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    /***************
     * GETTERS AND SETTERS SECTION for entity attributes
     ***************/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
