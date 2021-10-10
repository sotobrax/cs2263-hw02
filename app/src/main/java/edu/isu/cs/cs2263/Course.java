package edu.isu.cs.cs2263;

/**
 * Course Class
 *
 * Creates the Course objects
 */
public class Course {
    private Integer number;
    private String subject;
    private String title;

    /**
     * Empty Constructor for Course Class
     */
    public Course(){

    }

    /**
     * Constructor for Course class
     * @param number
     * @param subject
     * @param Title
     */
    public Course(Integer number, String subject, String Title){
    this.number = number;
    this.subject = subject;
    this.title = Title;
    }

    /**
     * Setter for number integer
     * @param cNumber
     */
    public void setNumber(Integer cNumber){
        this.number = cNumber;
    }

    /**
     * Getter for number integer
     * @return
     */
    public Integer getNumber(){
        return this.number;
    }

    /**
     * Setter for subject string
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter for subject string.
     * @return this.subject
     */
    public String getSubject(){
        return this.subject;
    }

    /**
     * Setter for title string
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Getter for title string
     * @return this.title
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * Prints course information
     * @return String
     */
    public String toString(){
        return subject +" "+ number + " "+ title;
    }
}
