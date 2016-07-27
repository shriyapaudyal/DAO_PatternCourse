/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.Courses;

import com.shriya.Courses.dao.CourseDAO;
import com.shriya.Courses.dao.impl.CourseDAOImpl;
import com.shriya.Courses.entity.Course;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add course:");
            System.out.println("2. Update Course:");
            System.out.println("3.Delete Course:");
            System.out.println("4.Get by id:");
            System.out.println("5.Dispaly All Course:");
            System.out.println("6.Exit:");
            System.out.println("enter your choice[1-6]:");
            switch (input.nextInt()) {
                case 1: {
                    System.out.println("Add a course:");
                    Course c = new Course();
                    System.out.println("Enter ID:");
                    c.setId(input.nextInt());
                    System.out.println("Enter Course Name:");
                    c.setCourse(input.next());
                    System.out.println("Enter Course Credit :");
                    c.setCredit(input.nextDouble());
                    System.out.println("Enter Description:");
                    c.setDescription(input.next());
                    System.out.println("Enter Status:");
                    c.setStatus(input.nextBoolean());
                    System.out.println("Enter Course Price:");
                    c.setCoursePrice(input.nextFloat());
                    if (courseDAO.insert(c)) {
                        System.out.println("Inserted Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                }

                break;
                case 2:{
                    Course[] Courses = courseDAO.getAll();
                  
                    System.out.println("Enter ID to be updated:");
                    int a = input.nextInt();
                    for (int i = 0; i < Courses.length; i++) {
                        Course Course = Courses[i];

                        if (Course != null && Course.getId() == a) {

                    System.out.println("Add a course:");
                    Course c = new Course();
                    System.out.println("Enter ID:");
                    c.setId(input.nextInt());
                    System.out.println("Enter Course Name:");
                    c.setCourse(input.next());
                    System.out.println("Enter Course Credit :");
                    c.setCredit(input.nextDouble());
                    System.out.println("Enter Description:");
                    c.setDescription(input.next());
                    System.out.println("Enter Status:");
                    c.setStatus(input.nextBoolean());
                    System.out.println("Enter Course Price:");
                    c.setCoursePrice(input.nextFloat());
                    if (courseDAO.update(c)) {
                        System.out.println("updated Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                
                }
                    
                    }
                        break;
                    }
                case 3: 
                    {
                    Course[] Courses = courseDAO.getAll();

                    System.out.println("Deleting Course:");
                    System.out.println("Enter ID:");
                    int a = input.nextInt();
                    for (int i = 0; i < Courses.length; i++) {
                        Course Course = Courses[i];

                        if (Course != null && Course.getId() == a) {

                            courseDAO.delete(a);

                        }
                    }

                }
                break;
                case 4:{
                    Course[] Courses = courseDAO.getAll();

                    System.out.println("Display by id:");
                    System.out.println("Enter ID:");
                    int a = input.nextInt();
                    for (int i = 0; i < Courses.length; i++) {
                        Course Course = Courses[i];

                        if (Course != null && Course.getId() == a) {
                  
                            System.out.println("ID:" + Course.getId());
                            System.out.println("Course Name:" + Course.getCourse());
                            System.out.println("Course Credit:" + Course.getCredit());
                            System.out.println("Description:" + Course.getDescription());
                            System.out.println("Status:" + Course.getStatus());
                            System.out.println("Course Price:" + Course.getCoursePrice());

                        }
                    }
                    break;
                }
                case 5:{

                   Course[] Courses = courseDAO.getAll();

                    for (int i = 0; i < Courses.length; i++) {
                        Course Course = Courses[i];
                        if (Course != null) {
                            System.out.println("Dispalying all Courses");
                            System.out.println("ID:" + Course.getId());
                            System.out.println("Course Name:" + Course.getCourse());
                            System.out.println("Course Credit:" + Course.getCredit());
                            System.out.println("Description:" + Course.getDescription());
                            System.out.println("Status:" + Course.getStatus());
                            System.out.println("Course Price:" + Course.getCoursePrice());

                        }

                    }

                    break;
                }
                
                case 6: {
                    System.out.println("Do You Really Want To Exit[y/n]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

                }
            }
        }
    }
}
