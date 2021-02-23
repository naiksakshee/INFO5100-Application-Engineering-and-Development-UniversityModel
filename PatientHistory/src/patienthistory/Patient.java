package patienthistory;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
    
    String Name;
    String ageGroup;
    VitalSigns vitalsigns;
    VitalSignsHistory vitalsignshistory;
    ArrayList<VitalSigns> patientVSHistory = new ArrayList<>();
    
    public VitalSignsHistory getVitalsignshistory() {
        return vitalsignshistory;
    }

    public void setVitalsignshistory(VitalSignsHistory vitalsignshistory) {
        this.vitalsignshistory = vitalsignshistory;
    }

    public ArrayList<VitalSigns> getPatientVSHistory() {
        return patientVSHistory;
    }

    public void setPatientVSHistory(ArrayList<VitalSigns> patientVSHistory) {
        this.patientVSHistory = patientVSHistory;
    }
    
    public Boolean isPatientNormal(){
        
        return vitalsigns.isVitalSignsNormal(this);
        
    }
    
    public void addVSHistory(VitalSigns vitalsigns) {
        patientVSHistory.add(vitalsigns);
    }
    public Boolean isThisVitalSignNormal(String vitalSign){
        return vitalsigns.isThisVitalSignNormal(this, vitalSign);
        
    }
    

    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
    
     public void newVitalSign(VitalSigns vitalsigns) { 
       
        this.vitalsignshistory.getVSHistory().add(vitalsigns); 
         
     } 
     
     void updateInfo()  { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\n Enter Patient's Name: "); 
        this.Name = scanner.nextLine(); 
        System.out.println("\n Enter Patient's age group: ");
        System.out.println("(Available Age Groups:\n Newborn \n Infant [1-12 months]\n Toddler[1-3 years]\n Preschooler[3-5 years]\n School age[6-12 years]\n Adult[13+ years])\n");
        this.ageGroup = scanner.nextLine(); 
// System.out.println("  nEnter Patient's age group: "); 
       
     } 
    
    
    
}
