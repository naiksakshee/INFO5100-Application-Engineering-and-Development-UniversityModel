package patienthistory;

public class PatientEncounter {
    Person person;
    VitalSigns vs;
    String visittime;
    

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTime() {
        return visittime;
    }

    public void setTime(String time) {
        this.visittime = time;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
   
    
    public boolean isPatientNormal(VitalSigns recentVitalSigns) {
       
       String ageGroup = recentVitalSigns.getAgeGroup();
       
       switch (ageGroup) { 
         case "NewBorn" :
             if (isInRange(recentVitalSigns.getBloodPressure(), 50, 70)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 30, 50)
                     && isInRange(recentVitalSigns.getHeartRate(), 120, 160)
                     && isInRange(recentVitalSigns.getWeightInKG(), 2, 3)
                     && isInRange(recentVitalSigns.getWeightInLB(), 4.5, 7)
                     ) { return true;}
            break;
         case "Infant" :
            if (isInRange(recentVitalSigns.getBloodPressure(), 70, 100)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 20, 30)
                     && isInRange(recentVitalSigns.getHeartRate(), 80, 140)
                     && isInRange(recentVitalSigns.getWeightInKG(), 4, 10)
                     && isInRange(recentVitalSigns.getWeightInLB(), 9, 22)
                ) { 
                return true;
            }
            break;
         case "Toddler" :
             if (isInRange(recentVitalSigns.getBloodPressure(), 70, 100)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 20, 30)
                     && isInRange(recentVitalSigns.getHeartRate(), 80, 130)
                     && isInRange(recentVitalSigns.getWeightInKG(), 10, 14)
                     && isInRange(recentVitalSigns.getWeightInLB(), 22, 31)
                ) { 
                return true;
            }
            break;
         case "PreSchooler" :
             if (isInRange(recentVitalSigns.getBloodPressure(), 80, 110)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 20, 30)
                     && isInRange(recentVitalSigns.getHeartRate(), 80, 120)
                     && isInRange(recentVitalSigns.getWeightInKG(), 14, 18)
                     && isInRange(recentVitalSigns.getWeightInLB(), 31, 40)
                ) { 
                return true;
            }
            break;
         case "SchoolAge" :
            if (isInRange(recentVitalSigns.getBloodPressure(), 80, 120)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 20, 30)
                     && isInRange(recentVitalSigns.getHeartRate(), 70, 110)
                     && isInRange(recentVitalSigns.getWeightInKG(), 20, 42)
                     && isInRange(recentVitalSigns.getWeightInLB(), 41, 92)
                ) { 
                return true;
            }
            break;
          case "Adolescent" :
            if (isInRange(recentVitalSigns.getBloodPressure(), 110, 120)
                     && isInRange(recentVitalSigns.getRespiratoryRate(), 12, 20)
                     && isInRange(recentVitalSigns.getHeartRate(), 55, 105)
                     && isInRange(recentVitalSigns.getWeightInKG(),50, Double.MAX_VALUE)
                     && isInRange(recentVitalSigns.getWeightInLB(), 110, Double.MAX_VALUE)
                ) { 
                return true;
            }
            break;
         default :
            System.out.println("Patient vital signs are out of normal range");
       }
        return false;
    }
    
    private boolean isInRange(double val, double low, double high) {
        if (val > low && val < high) return true;
        return false;
    }

}
