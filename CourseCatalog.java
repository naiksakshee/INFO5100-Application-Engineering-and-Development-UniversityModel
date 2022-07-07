/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.CourseCatalog;

import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class CourseCatalog {
 
    ArrayList<Course> courselist; 

    public CourseCatalog(){
        courselist = new ArrayList();
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }
    
    public Course getCourse(String id) {
        for( Course c: courselist){
            if(c.getCourseId().equals(id)) return c;
        }
        return null;
    }
    
    public void addCourse(String id, String name, int credits, double grade) {
        Course c = new Course(id, name, credits, grade);
        courselist.add(c);
    }
    
    public void deleteCourse() {}
    
    public void updateCourse() {}
    
    
    public Course newCourse(String n, String nm, int cr, double grade){
        Course c = new Course(n, nm, cr, grade);
        courselist.add(c);
        return c;
    }
    
}
