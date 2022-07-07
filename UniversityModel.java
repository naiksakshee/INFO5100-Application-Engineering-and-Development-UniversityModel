/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.main;

import info5100.university.CourseCatalog.CourseCatalog;
import info5100.university.Department.Department;
import info5100.university.Persona.Person;
import info5100.university.Persona.StudentProfile;
import info5100.university.Persona.Transcript;
import info5100.university.University.University;
import info5100.unviersity.College.College;
import info5100.unviersity.Employment.EmploymentHistroy;
import info5100.university.CourseCatalog.Course;
import info5100.university.Department.DepartmentDirectory;
import info5100.university.Faculty.FacultyDirectory;
import info5100.university.Faculty.FacultyProfile;
import info5100.university.Persona.StudentDirectory;
import info5100.university.University.UniversityDirectory;
import info5100.unviersity.Employment.Employment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author rak
 */
public class UniversityModel {

    private static ArrayList<CourseCatalog> courseDir = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UniversityDirectory ud = new UniversityDirectory();
        DepartmentDirectory dd = new DepartmentDirectory();
        StudentDirectory sd  = new StudentDirectory();
        FacultyDirectory fd = new FacultyDirectory();
        createUniv(ud, dd, sd, fd);
        createSP(sd);

        sd.printStudents();
        System.out.println(ud.findUni("MIT").findClg("MIT COE")
                .findDept("MIS").getCourseCatalog().getCourse("MIS7102").getCourseName());
        
        ud.sizeofUD();
    }
    
    public static void createUniv(UniversityDirectory ud, DepartmentDirectory dd,
            StudentDirectory sd, FacultyDirectory fd) {
        String[] unis = { "MIT", "Boston College", "NEU" };
        for (int i = 0; i < unis.length; i++) { 
            University uni = new University(unis[i]);
            createClgs(uni, dd, sd, fd);
            ud.addUniversity(uni);
        }
    }
    
    public static void createClgs(University uni, DepartmentDirectory dd,
            StudentDirectory sd, FacultyDirectory fd) {
        String[] clgs = { "COE", "MBA", "BIO", "Medical", "Finance", "ARTs" };
        for (int i = 0; i < clgs.length; i++) { 
            College clg = new College(uni.getUniName()+ " " + clgs[i]);
            createDept(clg, dd, sd, fd);
            uni.addColleges(clg);
        }
    }
    
    public static void createDept(College clg, DepartmentDirectory dd,
            StudentDirectory sd, FacultyDirectory fd) {
        String[] depts = { "MIS", "CS", "AI", "Biometrics", "BA", "Cybersecurity" };
        for (int i = 0; i < depts.length; i++) {
             Department dpt = new Department( clg + depts[i], depts[i]);
             createCourses(dpt);
             clg.addDepartment(dpt);
             dd.addDept(dpt);
        }
    }
    
    public static void createCourses(Department dpt) {
        Random rand = new Random(); 
        CourseCatalog ccatalog  = dpt.getCourseCatalog();
        int j = 510;
        for( int i = 0; i < 10; i ++ ) {
            if(i%2 == 0) {
                j += 100;
            }
           // System.out.println(dpt.getDeptName() + j + i);
            ccatalog.addCourse(dpt.getDeptName() + j + i, 
                    getSaltString(3)+rand.nextInt(100), 4, rand.nextInt(4));
        }
        courseDir.add(ccatalog);
    }
    
    public static void createSP(StudentDirectory sd) {
        String[] companies = { "Google", "Amazon", "FaceBook", 
                "Toyota", "Ford", "AIG", "Apple", "Wallmart", "Target", "AT&T"};
        Random rand = new Random(); 
        for(int i = 0; i < 40; i++) {
            Person p1 = new Person("SID" + rand.nextInt(1000));
            p1.setName(getSaltString(8));
            StudentProfile sp = new StudentProfile(p1);
            Transcript t1 = sp.getTranscript();
            t1.setTranscriptId("TID" + rand.nextInt(1000));
            for( int j = 0; j < 4; j++ ) {
                t1.newCourseLoad("sem"+ j, getListOfCourses());
            }
            
          EmploymentHistroy eh1 = new EmploymentHistroy();
          Employment e = new Employment(companies[rand.nextInt(4)],
                  getSaltString(10), rand.nextInt(150000), rand.nextInt(200000));
          eh1.addEmployments(e);
          sp.setEmploymenthistory(eh1);
          sd.addSP(sp);
//          StudentDirectory sd1 = dpt1.getStudentDirectory();
//          sd1.addSP(sp1);
        }
    }
    
    public void createFacultyProfile() {
        Random rand = new Random(); 
        for(int i = 0; i < 8; i++) { 
            Person p1 = new Person("FID" + rand.nextInt(1000));
            FacultyProfile fp = new FacultyProfile(p1);
            fp.setCourseList(getListOfCourses());
        }
    }
    
    public static ArrayList<Course> getListOfCourses() {
        ArrayList<Course> cs = new ArrayList<Course>();
          Random rand = new Random(); 
        for (int i =0; i< 5; i++) {
            cs.add(courseDir.get(rand.nextInt(4)).getCourselist().get(rand.nextInt(5)));
        }
        return cs;
    }
    
    public static String getSaltString(int num) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < num) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    
    
public static String randomIdentifier() {
    Random rand = new Random();
    String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    Set<String> identifiers = new HashSet<String>();
    StringBuilder builder = new StringBuilder();
    while(builder.toString().length() == 0) {
        int length = rand.nextInt(5)+5;
        for(int i = 0; i < length; i++) {
            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        }
        if(identifiers.contains(builder.toString())) {
            builder = new StringBuilder();
        }
    }
    return builder.toString();
}
    

}
