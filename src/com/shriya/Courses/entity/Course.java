/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.Courses.entity;

/**
 *
 * @author shneha
 */
public class Course {

    private int id;
    private String course;
    private double credit;
    private String description;
    private boolean status;
    private float coursePrice;

    public Course() {
    }

    public Course(int id, String course, double credit, String description, boolean status ,float coursePrice) {
        this.id = id;
        this.course = course;
        this.credit = credit;
        this.description = description;
        this.status = status;
        this.coursePrice=coursePrice;
    }

    public int getId() {
        return id;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        this.coursePrice = coursePrice;
    }

   

   
    
    
}
