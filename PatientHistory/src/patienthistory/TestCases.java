/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthistory;

/**
 *
 * @author lenovo
 */
public class TestCases {
    Patient patient;
    public void NB(VitalSigns vs) {
        vs.setRespiratoryRate(35);
        vs.setbloodPressure(60);
        vs.setpulseRate(145);
        vs.setweight(2.5);
        
         System.out.println("Condition:" +(patient.isPatientNormal()?"Healthy":"Abnormal"));
        
    }
    
    public void NBptn(Patient ptn){
        ptn.setAgeGroup("Newborn");
    }
    
        public void IN(VitalSigns vs) {
        vs.setRespiratoryRate(25);
        vs.setbloodPressure(75);
        vs.setpulseRate(85);
        vs.setweight(5);
        
    }
    
    public void INptn(Patient ptn){
        ptn.setAgeGroup("Infant");
    }
    
    
    
   /*  public void NB(VitalSigns vs) {
        vs.setRespiratoryRate(35);
        vs.setbloodPressure(60);
        vs.setpulseRate(145);
        vs.setweight(2.5);
        
    }
    
    public void NBptn(Patient ptn){
        ptn.setAgeGroup("Newborn");
    }
        public void NB(VitalSigns vs) {
        vs.setRespiratoryRate(35);
        vs.setbloodPressure(60);
        vs.setpulseRate(145);
        vs.setweight(2.5);
        
    }
    
    public void NBptn(Patient ptn){
        ptn.setAgeGroup("Newborn");
    }
        public void NB(VitalSigns vs) {
        vs.setRespiratoryRate(35);
        vs.setbloodPressure(60);
        vs.setpulseRate(145);
        vs.setweight(2.5);
        
    }
    
    public void NBptn(Patient ptn){
        ptn.setAgeGroup("Newborn");
    }
    */
    
}
