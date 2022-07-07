/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Persona;

import info5100.university.CourseSchedule.CourseLoad;
import info5100.university.CourseCatalog.Course;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rak
 */
public class Transcript {
    
   String transcriptId;
   String gradYear;    
   HashMap<String, ArrayList<Course>> courseloadlist;
   HashMap<Course, Double> gpa = new HashMap<>();
    //CourseLoad currentcourseload;
     
    public Transcript(){
        courseloadlist = new HashMap<String, ArrayList<Course>>();
    }

    public HashMap<Course, Double> getGpa() {
        return gpa;
    }

    public String getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(String transcriptId) {
        this.transcriptId = transcriptId;
    }
    
    public void newCourseLoad(String sem, ArrayList<Course> currentcourseload){
        courseloadlist.put(sem, currentcourseload);
    }
    
    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

}
