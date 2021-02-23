package patienthistory;
import java.util.Scanner;

public class VitalSigns {
    double respiratoryRate;
    double pulseRate;
    double bloodPressure;
    double weight;

//public VitalSigns(){
//        Scanner scanner = new Scanner(System.in);
//        
//        this.respiratoryRate = scanner.nextDouble();
//        this.pulseRate = scanner.nextDouble();
//        this.bloodPressure = scanner.nextDouble();
//        this.weight = scanner.nextDouble();
//        
//        System.out.println("\n Please Input following Vital signs: \n");
//        System.out.println("Respiratory Rate:");
//        this.respiratoryRate = scanner.nextDouble();
//        System.out.println("Pulse Rate:");
//        this.pulseRate = scanner.nextDouble();
//        System.out.println("Blood Pressure:");
//        this.bloodPressure = scanner.nextDouble();
//        System.out.println("Weight:");
//        this.weight = scanner.nextDouble();
//        
//}
    public VitalSigns(double respiratoryRate, double pulseRate, double bloodPressure, double weight) { 
        this.respiratoryRate = respiratoryRate;
        this.pulseRate = pulseRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
    }
        
    //Getters and setters for VitalSigns 
    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getpulseRate() {
        return pulseRate;
    }

    public void setpulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getbloodPressure() {
        return bloodPressure;
    }

    public void setbloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getweight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }
    
    public void updateVitalSigns(double respiratoryRate, double pulseRate, double bloodPressure, double weight) { 
        this.respiratoryRate = respiratoryRate;
        this.pulseRate = pulseRate;
        this.bloodPressure= bloodPressure;
        this.weight = weight;
    }    

Boolean isVitalSignsNormal(Patient patient)  { 
        if (compareVS(patient.getVitalsigns(),patient.getAgeGroup()) == 0) 
            return true; 
        else 
            return false; 
     }   
    
Boolean isThisVitalSignNormal(Patient patient, String vitalSign)  { 
        VitalSigns vitalsigns = patient.getVitalsigns(); 
        String ageGroup = patient.getAgeGroup(); 
         
        NormalRangeVS normalrangevs = new NormalRangeVS(); 
         
        if(vitalSign.equals("Respiratory Rate")) 
            return vitalsigns.respiratoryRate >= Double.parseDouble(normalrangevs.respiratoryRate.get(ageGroup).split("-")[0]) &&  
                vitalsigns.respiratoryRate <= Double.parseDouble(normalrangevs.respiratoryRate.get(ageGroup).split("-")[1]); 
        else if (vitalSign.equals("Pulse Rate")) 
            return vitalsigns.pulseRate >= Double.parseDouble(normalrangevs.pulseRate.get(ageGroup).split("-")[0]) &&  
                vitalsigns.pulseRate <= Double.parseDouble(normalrangevs.pulseRate.get(ageGroup).split("-")[1]); 
        else if (vitalSign.equals("Blood Pressure")) 
            return vitalsigns.bloodPressure >= Double.parseDouble(normalrangevs.bloodPressure.get(ageGroup).split("-")[0]) &&  
                vitalsigns.bloodPressure <= Double.parseDouble(normalrangevs.bloodPressure.get(ageGroup).split("-")[1]); 
        else if (vitalSign.equals("Weight")) 
            return vitalsigns.weight >= Double.parseDouble(normalrangevs.weight.get(ageGroup).split("-")[0]) &&  
                vitalsigns.weight <= Double.parseDouble(normalrangevs.weight.get(ageGroup).split("-")[1]); 
        else 
            System.out.println("No details found! n"); 
        return false; 
     } 


private int compareVS(VitalSigns vitalsigns, String ageGroup)  { 
        int result = 0; 
         
        NormalRangeVS normalrangevs = new NormalRangeVS(); 
         
        if(vitalsigns.respiratoryRate >= Double.parseDouble(normalrangevs.respiratoryRate.get(ageGroup).split("-")[0]) &&  
                vitalsigns.respiratoryRate <= Double.parseDouble(normalrangevs.respiratoryRate.get(ageGroup).split("-")[1])) 
            result = 0; 
        else  
            return 1; 
         
        if(vitalsigns.pulseRate >= Double.parseDouble(normalrangevs.pulseRate.get(ageGroup).split("-")[0]) &&  
                vitalsigns.pulseRate <= Double.parseDouble(normalrangevs.pulseRate.get(ageGroup).split("-")[1])) 
            result = 0; 
        else  
            return 2; 
        
         if(vitalsigns.bloodPressure >= Double.parseDouble(normalrangevs.bloodPressure.get(ageGroup).split("-")[0]) &&  
                vitalsigns.bloodPressure <= Double.parseDouble(normalrangevs.bloodPressure.get(ageGroup).split("-")[1])) 
            result = 0; 
        else  
            return 3; 
        
           if(vitalsigns.weight >= Double.parseDouble(normalrangevs.weight.get(ageGroup).split("-")[0]) &&  
                vitalsigns.weight <= Double.parseDouble(normalrangevs.weight.get(ageGroup).split("-")[1])) 
            result = 0; 
        else  
            return 4; 
        
        
        return result; 
     } 
    
    
    
    
}



