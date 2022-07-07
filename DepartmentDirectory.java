/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Department;

import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class DepartmentDirectory {
    
    ArrayList<Department> depts;

    public DepartmentDirectory() {
        this.depts = new ArrayList<Department>();
    }
    
    public void addDept(Department d) {
        depts.add(d);
    }
    
     public Department findUni(String id) {
        for( Department d: depts) {
            if (d.getDeptName().equalsIgnoreCase(id)) return d;
        }
        return null;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }
     
    public void removeDpt(String id) {
        Department dpt = this.findUni(id);
        depts.remove(dpt);
        
    }
}
