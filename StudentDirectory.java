/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Persona;

import info5100.university.Department.Department;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author rak
 */
public class StudentDirectory {
    
    Department department;
    ArrayList<StudentProfile> studentlist = new ArrayList();

    public StudentDirectory() {}
    
    public StudentDirectory(Department d) {
        department = d;
    }

    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public void addSP(StudentProfile sp) {
        studentlist.add(sp);
    }
    
    public StudentProfile newStudentProfile(Person p) {
        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {
        for (StudentProfile sp : studentlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public List<StudentProfile> rankStudents(List<StudentProfile> students){
        Collections.sort(students, new Comparator<StudentProfile>(){
            @Override
            public int compare(StudentProfile stu1, StudentProfile stu2) {
                return stu2.getTotalGpa().compareTo(stu1.getTotalGpa());
            }}
        );
        return students;
    }
    
    public void printStudents() {
        for (StudentProfile sp: studentlist) {
            System.out.println(sp.getPerson().getName() + " " + sp.getPerson().getPersonId() + " " );
        }
    }
    
}
