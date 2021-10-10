package edu.isu.cs.cs2263;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import java.io.*;
import com.google.gson.GsonBuilder;


public class IOManager {


    public static void writeData() throws IOException {

        Course course1 = new Course();
        course1.setTitle("Advanced Object Oriented Programming");
        course1.setSubject("CS");
        course1.setNumber(2263);

        Course course2 = new Course();
        course2.setTitle("English");
        course2.setSubject("ENGL");
        course2.setNumber(1101);

        Course course3 = new Course();
        course3.setTitle("Calculus 1");
        course3.setSubject("MATH");
        course3.setNumber(1170);

        Course course4 = new Course();
        course4.setTitle("Database Design");
        course4.setSubject("INFO");
        course4.setNumber(4407);
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setFirstName("Braxton");
        student1.setLastName("Soto");
        student1.add(course1);
        student1.add(course2);
        studentList.add(student1);

        Student student2 = new Student();
        student2.setFirstName("Bobby");
        student2.setLastName("Smith");
        student2.add(course1);
        student2.add(course3);
        student2.add(course4);
        studentList.add(student2);



        Student student3 = new Student();
        student3.setFirstName("John");
        student3.setLastName("Doe");
        student3.add(course3);
        studentList.add(student3);

        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("Students.json");
        gson.toJson(studentList, fileWriter);
        fileWriter.close();
        System.out.println("JSON wrote to file");
    }
    public static List<Student> readData() throws FileNotFoundException {
        Gson gson = new Gson();
        List<Student> studentList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\braxt\\CS Homework\\cs2263-hw02\\app\\Students.json"));
        studentList = Arrays.asList(gson.fromJson(br, Student[].class));
        return studentList;

    }


}
