/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Faculty;

import info5100.university.CourseSchedule.CourseOffer;
import info5100.university.CourseCatalog.Course;

import info5100.university.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class FacultyProfile {
    
    Person person;
    
    ArrayList<Course> courseList = new ArrayList<Course>();

    public FacultyProfile(Person p) {
        person = p;
    }

//    public FacultyAssignment AssignAsTeacher(CourseOffer co){
//        FacultyAssignment fa = new FacultyAssignment(this, co);
//        facultyassignments.add(fa);
//        return fa;
//    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public void addCourseList(Course c) {
        courseList.add(c);
    }
    
    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    
}
