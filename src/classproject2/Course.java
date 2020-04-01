/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject2;

/**
 *
 * @author sanjeet
 */
public class Course {
    
    String courseName;
    Instructor instructor;
    Textbook textBook;

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", instructor=" + instructor + ", textBook=" + textBook + '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextBook() {
        return textBook;
    }
    
    public Course(String courseName, Instructor instructor, Textbook textBook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }
    
    
  
   
    
}
