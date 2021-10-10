package edu.isu.cs.cs2263;

public class Course {
    private Integer number;
    private String subject;
    private String title;

    public Course(){

    }
    public Course(Integer number, String subject, String Title){
    this.number = number;
    this.subject = subject;
    this.title = Title;
    }
    public void setNumber(Integer cNumber){
        this.number = cNumber;
    }
    public Integer getNumber(){
        return this.number;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String toString(){
        return subject +" "+ number + " "+ title;
    }
}
