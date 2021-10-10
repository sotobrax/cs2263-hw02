package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;

    private List<Course> courses;

    public Student(){
        courses = new ArrayList<Course>();
    }
    public void add(Course object){
        courses.add(object);
    }
    public List<Course> getAllCourses(){
        return courses;
    }


    public void setFirstName(String firstName){
       this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String toString(){
        return this.firstName+ " " + this.lastName;
    }
}
