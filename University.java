 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.University;

import info5100.unviersity.College.College;
import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class University {
    String uniName;
    ArrayList<College> colleges =  new ArrayList<College>();

    
    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public University(String uniName) {
        this.uniName = uniName;
    }

    public void addColleges(College clg) {
        this.colleges.add(clg);
    }
    
    public  ArrayList<College> getColleges() {
        return colleges;
    }
    public void clgSize() {
        System.out.println(colleges.size());
    }
    
    public College findClg(String id) {
        for( College clg: colleges) {
            System.out.println(clg.getClgName());
            if (clg.getClgName().equalsIgnoreCase(id)) return clg;
        }
        return null;
    }
    
}
