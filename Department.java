/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Department;

import info5100.university.CourseCatalog.CourseCatalog;
import info5100.university.Faculty.FacultyDirectory;
import info5100.university.Persona.PersonDirectory;
import info5100.university.Persona.StudentDirectory;

/**
 *
 * @author rak
 */
public class Department {
    String deptId;
    String deptName;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
     public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName; 
        coursecatalog = new CourseCatalog();
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
    }
    
     public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public String getDeptName() {
        return deptName;
    }
    
    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }
    
    
    public void getTotalRegisteredStudents() {}
    public void getAvaliableSeats() {}
    
}
