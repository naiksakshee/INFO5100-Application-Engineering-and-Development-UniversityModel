/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Faculty;

import info5100.university.CourseSchedule.CourseOffer;

/**
 *
 * @author rak
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }
    
}
