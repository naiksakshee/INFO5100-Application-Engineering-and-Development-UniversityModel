/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.CourseCatalog;

/**
 *
 * @author Rakesh, Sakshee, Jatinder
 */
public class Course {
    String courseId;
    String courseName;
    double grade;
    int courseCredits;
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Course(String courseId, String courseName, int courseCredits, double grade) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

 
    
    
}
