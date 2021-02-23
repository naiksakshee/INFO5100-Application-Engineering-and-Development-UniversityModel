package patienthistory;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    
    Patient patient;
    VitalSigns VitalSigns;
   //Testcases testcases;
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Patient patient = new Patient();
        //this.patient = patient;
        initPatientRecords(patient);
        initVitalSigns(patient);
  
        System.out.println("Condition:" +(patient.isPatientNormal()?"Healthy":"Abnormal"));
        System.out.println("\n*****************************************************");
      
        displayMenu();
        
        keyboard = new Scanner(System.in);
        int selection = keyboard.nextInt();
        
        while(selection!=4){
            
            keyboard = new Scanner(System.in);
            switch(selection){
                
                case 1:
                    patient.updateInfo();
                    break;
                    
                case 2:
                    //updateVitalSigns(patient);
                    System.out.println("\n **********************Please Input following Vital signs:********************** \n");
                    System.out.println("Respiratory Rate:");
                    double respiratoryRate = keyboard.nextDouble();
                    System.out.println("Pulse Rate:");
                    double pulseRate = keyboard.nextDouble();
                    System.out.println("Blood Pressure:");
                    double bloodPressure = keyboard.nextDouble();
                    System.out.println("Weight:");
                    double weight = keyboard.nextDouble();
                    VitalSigns vitalsigns = new VitalSigns(respiratoryRate, pulseRate, bloodPressure, weight);
                    patient.newVitalSign(vitalsigns);
                     patient.addVSHistory(vitalsigns);
                     System.out.println("Condition:" +(patient.isPatientNormal()?"Healthy":"Abnormal"));
                    //System.out.println("Vital signs entered:\n" +patient.getVitalsigns());
                    break;
                    
                case 3:
                   // VitalSignsHistory vitalsignshistory = patient.getVitalsignshistory();
//                     for(VitalSigns i: patient.getVitalsignshistory().getVitalSignsHistory()) {
//                         System.out.println(i);
//                     }
                   System.out.println("Patient Name:"+patient.getName()); 
                   System.out.println("Patient Age group:"+patient.getAgeGroup()); 
                   for( VitalSigns vs : patient.getPatientVSHistory()) {
                       System.out.println(" Respiratory Rate:  " + vs.getRespiratoryRate()
                               + "\n Pulse Rate: " + vs.getpulseRate()
                               + "\n Blood Pressure: " + vs.getbloodPressure()
                               + "\n Weight: " + vs.getweight()       
                       );
                       System.out.println("***************************************************");
                   }
                    
                    //patient.getVitalsignshistory().getVSHistory();
                    //printVSHistory();
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Enter valid input\n");
                    break;
            }
            
            displayMenu();
            selection = keyboard.nextInt();
            //keyboard.nextInt();
     
        }
                      
    }
    
    public static void initPatientRecords(Patient patient){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****************Input Patient details:***********************\n");
        System.out.print("Name: ");
        patient.setName(scanner.nextLine());   
        System.out.print("Age:(Available Age Groups:\n Newborn \n Infant [1-12 months]\n Toddler[1-3 years]\n Preschooler[3-5 years]\n School age[6-12 years]\n Adult[13+ years])\n\n");
        patient.setAgeGroup(scanner.nextLine());        
        
    } 
    
    public static void initVitalSigns(Patient patient) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\n Input Vital Signs:\n1. Respiratory Rate \n2. Pulse Rate \n3. Blood Pressure \n4. Weight (in kgs)\n ");
        VitalSigns vSigns = new VitalSigns(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        patient.setVitalsigns(vSigns); 
        patient.setVitalsignshistory(new VitalSignsHistory());
       patient.addVSHistory(vSigns);
    }
    
    public static void displayMenu(){
        System.out.println("Menu (Press 4 to exit) \n"); 
        System.out.println("1. Update Patient information\n"); 
        System.out.println("2. Add Vital signs\n"); 
        System.out.println("3. Vital signs history\n"); 
        System.out.println("4. Exit  \n"); 
        System.out.println("Your choice: "); 
        
        
        
        
    }
}
