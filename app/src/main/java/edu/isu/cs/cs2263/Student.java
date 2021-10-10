package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

/**
 * Student Class
 *
 * Creates Student Objects
 */
public class Student {
    private String firstName;
    private String lastName;

    private List<Course> courses;

    /**
     * Constructor for student
     *
     * Generates an ArrayList to store Course Objects
     */
    public Student(){
        courses = new ArrayList<Course>();
    }

    /**
     * Allows Courses to be added to ArrayList
     * @param object
     */
    public void add(Course object){
        courses.add(object);
    }

    /**
     * Returns the course array list
     * @return ArrayList<String></String>
     */
    public List<Course> getAllCourses(){
        return courses;
    }

    /**
     * Setter for First Name
     * @param firstName
     */
    public void setFirstName(String firstName){
       this.firstName = firstName;
    }

    /**
     * Getter for First Name
     * @return
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Setter for Last Name
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Getter for Last Name
     * @return
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Prints Student Information
     * @return
     */
    public String toString(){
        return this.firstName+ " " + this.lastName;
    }
}
