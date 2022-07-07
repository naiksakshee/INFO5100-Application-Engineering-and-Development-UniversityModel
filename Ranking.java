/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Rankingmodel;

import info5100.university.CourseCatalog.Course;
import info5100.university.CourseCatalog.CourseCatalog;
import info5100.university.Department.Department;
import info5100.university.Department.DepartmentDirectory;
import info5100.university.Persona.StudentProfile;
import info5100.unviersity.College.College;
import info5100.unviersity.Employment.Employment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author rak
 */
public class Ranking {
     int courseRanking;
     int facultyRanking;
     int deptRanking;
     int alumniRanking;

    public int getCourseRanking() {
        return courseRanking;
    }

    public void setCourseRanking(int courseRanking) {
        this.courseRanking = courseRanking;
    }

    public int getFacultyRanking() {
        return facultyRanking;
    }

    public void setFacultyRanking(int facultyRanking) {
        this.facultyRanking = facultyRanking;
    }

    public int getDeptRanking() {
        return deptRanking;
    }

    public void setDeptRanking(int deptRanking) {
        this.deptRanking = deptRanking;
    }

    public int getAlumniRanking() {
        return alumniRanking;
    }

    public void setAlumniRanking(int alumniRanking) {
        this.alumniRanking = alumniRanking;
    }
     
    public List<StudentProfile> rankByTotalGpa(List<StudentProfile> students){
        Collections.sort(students, new Comparator<StudentProfile>(){
            @Override
            public int compare(StudentProfile stu1, StudentProfile stu2) {
                return stu2.getTotalGpa().compareTo(stu1.getTotalGpa());
            }}
        );
        return students;
    }
    
     public List<StudentProfile> rankByCurrentSalaryByCollege(College college, String clgName){
        ArrayList<Department> depts  = college.getDepts();
        for (Department dept: depts) {
            if (dept.getDeptName().equalsIgnoreCase(clgName)) {
                ArrayList<StudentProfile> students = dept.getStudentDirectory().getStudentlist();

                Collections.sort(students,new Comparator<StudentProfile>(){
                    @Override
                    public int compare(StudentProfile stu1, StudentProfile stu2) {
                        ArrayList<Employment> e = stu1.getEmploymenthistory().getEmployments();
                        ArrayList<Employment> e2 = stu2.getEmploymenthistory().getEmployments();
                        return e.get(0).getCurrentSalary().compareTo(e2.get(0).getCurrentSalary());
                }}
        );
        }
        }
        
        return null;
    }
     
     public ArrayList<Course> calculateCourseRanking(CourseCatalog ccatalog) {
        ArrayList<Course> courses  = ccatalog.getCourselist();
      
        Collections.sort(courses,new Comparator<Course>(){
            @Override
            public int compare(Course stu1, Course stu2) {
                return stu1.getRating().compareTo(stu2.getRating());
        }}
        );
        
        return null;     
     
     }
     
     public ArrayList<Department> getDepartmentRanking(DepartmentDirectory dd) {
          ArrayList<Department> depts  = dd.getDepts();
      
        Collections.sort(depts ,new Comparator<Department>(){
            @Override
            public int compare(Department d1, Department d2) {
                return d1.getRating().compareTo(d1.getRating());
        }}
        );
        
        return null;   
         
     
     } 
    
   
}
