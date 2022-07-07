/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Persona;

import info5100.university.CourseSchedule.CourseLoad;
import info5100.university.CourseCatalog.Course;
import info5100.unviersity.Employment.EmploymentHistroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rak
 */
public class StudentProfile {
    
    private Double totalGpa;
    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    
    ArrayList<Course> courseList = new ArrayList<>();
    
     
    public void setTotalGpa(Double totalGpa) {
        this.totalGpa = totalGpa;
    }
   
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public StudentProfile(Person p) {
        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistroy employmenthistory) {
        this.employmenthistory = employmenthistory;
    }
    
     public Double getTotalGpa() {
        Double totalCredit = 0.0;
        Double totalGpa = 0.0;
        for(Map.Entry<Course, Double> entry: transcript.getGpa().entrySet()){
            totalCredit += entry.getKey().getGrade();
            totalGpa += (entry.getValue() * entry.getKey().getGrade());
        }
        this.totalGpa = totalGpa/totalCredit;
        return this.totalGpa;
    }

}
