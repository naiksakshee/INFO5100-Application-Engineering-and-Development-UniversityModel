package patienthistory;

import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> personList = new ArrayList<>();
    
    public void addPerson(Person p) {
        personList.add(p);
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person searchForPatient(String personName) {
        for (Person p : personList) {
            if (p.getName().equals(personName)) {
                return p;
            }
        }
        return null;
    }
    
    public void printList() {
        System.out.println("***********************************************");
        System.out.println("***************Person Directory***************");
        System.out.println("***********************************************");
        for(Person p : personList) {
            System.out.println("Patient Name: " + p.getName() );
        }
    }
}
