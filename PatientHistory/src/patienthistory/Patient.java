package patienthistory;

public class Patient {
    Person person;
    PatientEncounterHistory eh;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PatientEncounterHistory getEh() {
        return eh;
    }

    public void setEh(PatientEncounterHistory eh) {
        this.eh = eh;
    }
   
    public void printList() {
        String name = eh.getEncounter().get(0).getPerson().getName();
        int len = eh.getEncounter().size();
        for(PatientEncounter i : eh.getEncounter()) {
            System.out.println( name + " " +  
                        "\nAgeGroup -> " + i.getVs().getAgeGroup() +  
                        "\nRespiratory Rate ->" + i.getVs().getRespiratoryRate() +
                        "\nBloodPressure -> " + i.getVs().getBloodPressure() +
                        "\nHeartRate -> " + i.getVs().getHeartRate() + 
                        "\nWeight(KG) -> " + i.getVs().getWeightInKG() +
                        "\nWeight(LB) -> " + i.getVs().getWeightInLB()
            );
        }
    }
    
    public boolean isThisVitalSignNormal(String vsign) {
        int len = eh.getEncounter().size();
        VitalSigns recentVitalSigns = eh.getEncounter().get(len-1).getVs();
        String ageGroup = recentVitalSigns.getAgeGroup();
        
        if ( vsign.equals("RespiratoryRate")) {
            if ( ageGroup.equals("NewBorn") ) return isInRange(recentVitalSigns.getRespiratoryRate(), 30, 50);
            if (ageGroup.equals("Infant") 
                || ageGroup.equals("Toddler")
                || ageGroup.equals("Preschooler")
                || ageGroup.equals("SchoolAge")) {
                    return isInRange(recentVitalSigns.getRespiratoryRate(),  20, 30);
                }
            if (ageGroup.equals("Adolescent")) return isInRange(recentVitalSigns.getRespiratoryRate(),  12, 20);
            return false;
        } else if (vsign.equals("HeartRate")){ 
            if (ageGroup.equals("NewBorn")) return isInRange(recentVitalSigns.getHeartRate(), 120, 160);
            if (ageGroup.equals("Infant")) return isInRange(recentVitalSigns.getHeartRate(), 80, 140);
            if (ageGroup.equals("Toddler")) return isInRange(recentVitalSigns.getHeartRate(), 80, 130);
            if (ageGroup.equals("Preschooler")) return isInRange(recentVitalSigns.getHeartRate(), 80, 120);
            if (ageGroup.equals("SchoolAge")) return isInRange(recentVitalSigns.getHeartRate(), 70, 110);
            if (ageGroup.equals("Adolescent")) return isInRange(recentVitalSigns.getHeartRate(), 55, 105);

        }
        else if (vsign.equals("SystolicBloodPressure")){
            if (ageGroup.equals("NewBorn")) return isInRange(recentVitalSigns.getBloodPressure(), 50, 70);
            if (ageGroup.equals("Infant")) return isInRange(recentVitalSigns.getBloodPressure(), 70, 100);
            if (ageGroup.equals("Toddler") || ageGroup.equals("Preschooler")) {
                    return isInRange(recentVitalSigns.getBloodPressure(), 80, 110);
                }
            if (ageGroup.equals("SchoolAge")) return isInRange(recentVitalSigns.getBloodPressure(), 80, 120);
            if (ageGroup.equals("Adolescent")) return isInRange(recentVitalSigns.getBloodPressure(), 110, 120);
        }
        else if (vsign.equals("WeightInKilos")){
            if (ageGroup.equals("NewBorn")) return isInRange(recentVitalSigns.getWeightInKG(), 2, 3);
            if (ageGroup.equals("Infant")) return isInRange(recentVitalSigns.getWeightInKG(), 4, 10);
            if (ageGroup.equals("Toddler")) return isInRange(recentVitalSigns.getWeightInKG(), 10, 14);
            if (ageGroup.equals("Preschooler")) return isInRange(recentVitalSigns.getWeightInKG(), 14, 18);
            if (ageGroup.equals("SchoolAge")) return isInRange(recentVitalSigns.getWeightInKG(), 20, 42);
            if (ageGroup.equals("Adolescent")) return isInRange(recentVitalSigns.getWeightInKG(), 50, Double.MAX_VALUE);
        }
        else if (vsign.equals("WeightInPounds")){ 
            if (ageGroup.equals("NewBorn")) return isInRange(recentVitalSigns.getWeightInKG(), 4.5, 7);
            if (ageGroup.equals("Infant")) return isInRange(recentVitalSigns.getWeightInKG(), 9, 22);
            if (ageGroup.equals("Toddler")) return isInRange(recentVitalSigns.getWeightInKG(), 22, 31);
            if (ageGroup.equals("Preschooler")) return isInRange(recentVitalSigns.getWeightInKG(), 31, 40);
            if (ageGroup.equals("SchoolAge")) return isInRange(recentVitalSigns.getWeightInKG(), 41, 92);
            if (ageGroup.equals("Adolescent")) return isInRange(recentVitalSigns.getWeightInKG(), 110, Double.MAX_VALUE);
        }
        return false;
    }
    
    private boolean isInRange(double val, double low, double high) {
        if (val > low && val < high) return true;
        return false;
    }
}
