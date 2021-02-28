package patienthistory;

import java.util.ArrayList;

public class PatientEncounterHistory {
    ArrayList<PatientEncounter> encounter = new ArrayList<>();

    public PatientEncounterHistory() {
    }

    public ArrayList<PatientEncounter> getEncounter() {
        return encounter;
    }
    
    public void addEncounter(PatientEncounter e) {
        encounter.add(e);
    }

    public void setEncounter(ArrayList<PatientEncounter> encounter) {
        this.encounter = encounter;
    }
    
    public void printList() {
        for(PatientEncounter i : encounter) {
            System.out.println("********************Patient details********************");
            System.out.println( i.getPerson().getName() + " " +  
                        "\nAgeGroup: " + i.getVs().getAgeGroup() +  
                        "\nRespiratory:" + i.getVs().getRespiratoryRate() +
                        "\nBloodPressure:" + i.getVs().getBloodPressure() +
                        "\nHeartRate:" + i.getVs().getHeartRate() + 
                        "\nWeight(KG):" + i.getVs().getWeightInKG() +
                        "\nWeight(LB):" + i.getVs().getWeightInLB()
            );
        }
    }
}
