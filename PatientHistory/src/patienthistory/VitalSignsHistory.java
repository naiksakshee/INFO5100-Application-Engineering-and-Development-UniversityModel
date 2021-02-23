package patienthistory;
import java.util.ArrayList;

class VitalSignsHistory {
    
    ArrayList<VitalSigns> VSHistory;
    
    public VitalSignsHistory() {
        VSHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVSHistory() {
        return VSHistory;
    }

    public void setVSHistory(ArrayList<VitalSigns> VSHistory) {
        this.VSHistory = VSHistory;
    }
    
    public void printVSHistory() {
        System.out.println(toString());
    }
    
    public String toString() {
        String returnString = new String();
        int i = 1;
        for (VitalSigns visit: getVSHistory()) {
            returnString+="\nVital Signs "+i+": \n";
            returnString += visit;
            i++;
        }
        return returnString;
    }
    
}
