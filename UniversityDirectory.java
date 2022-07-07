/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.University;

import java.util.ArrayList;

/**
 *
 * @author Rakesh Lokam
 */
public class UniversityDirectory {
    ArrayList<University> universities;
    
    public UniversityDirectory() {
        universities = new ArrayList<>();
    }
    
    public void addUniversity(University u) {
        universities.add(u);
    }
    
    public void sizeofUD() {
        System.out.println(universities.size());
    }
    
    public University findUni(String id) {
        for( University u: universities) {
            if (u.getUniName().equalsIgnoreCase(id)) return u;
        }
        return null;
    }
}
