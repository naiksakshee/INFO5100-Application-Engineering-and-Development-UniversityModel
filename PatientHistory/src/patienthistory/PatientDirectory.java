package patienthistory;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class PatientDirectory {
    ArrayList<Patient> patientList = new ArrayList<>();
    
    public void addPatient(Patient p) {
        patientList.add(p);
    }
    
    public ArrayList<Patient> getPersonList() {
        return patientList;
    }
    
    public Patient searchForPatient(String patientName) {
        for (Patient p : patientList) {
            if (p.getPerson().getName().equals(patientName)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "patientList=" + patientList + '}';
    }
    
    public void printList() {
        System.out.println("***********************************************");
        System.out.println("***************Patient list********************");
        System.out.println("***********************************************");
        for(Patient p : patientList) {
            System.out.println("Patient Name:" + p.getPerson().getName());
        }
    }
    
    
     public void checkAllPatients() {
        HashMap<String, ArrayList<Patient>> commTOPatientMap = new HashMap<>();    
       
        for (int i= 0; i<= patientList.size()-1; i++) {
             String patientCommunity = patientList.get(i).getPerson().getAddress().getCommunity();
             if(commTOPatientMap.containsKey(patientCommunity)) {
                commTOPatientMap.get(patientCommunity).add(patientList.get(i));
            } else {
                ArrayList<Patient> patients = new ArrayList<>();
                patients.add(patientList.get(i));
                commTOPatientMap.put(patientCommunity, patients);
            }   
        } 
        
        for (Map.Entry mapElement : commTOPatientMap.entrySet()) { 
            int count = 0;
            String key = (String)mapElement.getKey();
            ArrayList<Patient> patients = (ArrayList<Patient>)mapElement.getValue();
            for (Patient patient: patients) {
                boolean result = patient.isThisVitalSignNormal("BloodPressure");
                if(!result) count++;
            }
            System.out.println(key + " : " + count);
        } 
     }
}
