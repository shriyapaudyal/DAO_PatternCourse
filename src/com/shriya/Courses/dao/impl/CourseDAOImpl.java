/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.Courses.dao.impl;

import com.shriya.Courses.dao.CourseDAO;
import com.shriya.Courses.entity.Course;

/**
 *
 * @author shneha
 */
public class CourseDAOImpl implements CourseDAO {

    private Course[] CourseList = new Course[10];
    private int counter = 0;

    @Override
    public boolean insert(Course c) {
        if (counter == CourseList.length) {
            return false;
        }
        CourseList[counter] = c;
        counter++;
        return true;
    }

    @Override
    public boolean update(Course c) {

if (counter == CourseList.length) {
            return false;
        }
        CourseList[counter] = c;
        counter++;
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < CourseList.length; i++) {
            Course c = CourseList[i];
            if (c != null && c.getId() == id) {
                CourseList[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public Course getById(int id) {
        for (int i = 0; i < CourseList.length; i++) {
            Course c = CourseList[i];
            if (c != null && c.getId() == id) {
                CourseList[i] = null;
                return c;
            }
        }

        return null;
    }

    @Override
    public Course[] getAll() {
        return CourseList;
    }
}
