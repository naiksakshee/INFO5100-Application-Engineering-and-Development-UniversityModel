/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Faculty;

import info5100.university.Department.Department;
import info5100.university.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class FacultyDirectory {
    
    Department department;
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory() {}
    
    public FacultyDirectory(Department d) {
        department = d;
        teacherlist = new ArrayList();
    }

    public FacultyProfile newStudentProfile(Person p) {
        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        return sp;
    }

    public FacultyProfile findTeachingFaculty(String id) {
        for (FacultyProfile sp : teacherlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
    
}
