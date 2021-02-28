package patienthistory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import patienthistory.Address;
import patienthistory.PatientEncounter;
import patienthistory.PatientEncounterHistory;
import patienthistory.Patient;
import patienthistory.PatientDirectory;
import patienthistory.Person;
import patienthistory.PersonDirectory;
import patienthistory.VitalSigns;

public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory  = new PersonDirectory();
        initalizeData(personDirectory,patientDirectory);
        int n = 0;
        while (n != 4) {
            System.out.println("\n************WELCOME TO MEDICAL SYSTEM***********\n");
            System.out.println("*********************Menu***********************");
            System.out.println("1. Create a new Patient profile");
            System.out.println("2. View an existing Patient");
            System.out.println("3. View Patient Directory");
            System.out.println("4. View Person Directory");
            System.out.println("5. Check total cases in communities");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");
            
            int input = intInput(in);        
            switch(input) {
                case 1:
                    Person person  = createPersonMenu(in);
                    personDirectory.addPerson(person);
                    System.out.println("*** Person profile successfully created ***");
                    //menuForVitalSigns(in);
                    PatientEncounter e = new PatientEncounter();
                    PatientEncounterHistory eh = new PatientEncounterHistory();
                    VitalSigns vitalSigns = getVitalInfo(in);
                    e.setVs(vitalSigns);
                    e.setPerson(person);
                    if (!e.isPatientNormal(vitalSigns)) {
                        Patient patient = new Patient();
                        patient.setEh(eh);
                        patient.setPerson(person);
                        patientDirectory.addPatient(patient);
                        System.out.println("Patient added to Patient directory");
                    } else {
                        System.out.println("Patient is normal, added to Person directory");
                    }
                    eh.addEncounter(e); 
                    break;
                case 2:
                    System.out.println("Enter patiestrInputnt name:");
                    String newPatientName = in.next();
                    Patient patient = patientDirectory.searchForPatient(newPatientName);
                    
                    if(patient != null) {
                        while(true) {
                            viewPatientMenu();
                            int choice = intInput(in);
                            if (choice == 1) {
                                //show history
                                patient.getEh().printList();
                                
                            } else if (choice == 2) {
                                in.nextLine();
                                System.out.println("Enter vital sign name: ");
                                String checkvsign = in.nextLine();
                                System.out.println("Condition: ");
                                if (patient.isThisVitalSignNormal(checkvsign)) {
                                    System.out.println( checkvsign + " is in normal range ");
                                }else {
                                    System.out.println( checkvsign + " is not in normal range ");
                                }
                                
                            } else if (choice == 3) {
                                // add new signs
                                in.nextLine();
                                VitalSigns newvitalSigns = getVitalInfo(in);
                                PatientEncounter ne = new PatientEncounter();
                                ne.setVs(newvitalSigns);
                                ne.setPerson(patient.getPerson());
                                ne.setTime((java.time.LocalDateTime.now().toString()));
                                System.out.println(ne.getTime());
                                patient.getEh().addEncounter(ne);
                                
                            } else if (choice == 4) {
                                break;
                            } else {
                                System.out.println("Enter a valid input");
                            }
                        }
                    } else {
                        System.out.println("Patient details not found");
                    }
                    break;
                case 5:
                    System.out.println("Check for total cases in communites");
                    
                    patientDirectory.checkAllPatients();
                    
                    break;
                case 3:
                    System.out.println(patientDirectory.getPersonList().toString());
                    break;
                case 4:
                    personDirectory.printList();
                    break;
                case 6:
                    n = 6;
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
           
        }
        
    }

    
     public static void viewPatientMenu() {
        System.out.println("************************************************");
        System.out.println("***************Patient Details******************");
        System.out.println("************************************************");
        System.out.println("1. View Patient's vital sign history");
        System.out.println("2. Check a particular vital sign");
        System.out.println("3. Add vital signs");
        System.out.println("4. Exit");
        
    }
    public static Person createPersonMenu(Scanner in) {
        System.out.println("************************************************");
        System.out.println("***************Enter Patient Details************");
        System.out.println("************************************************");
        System.out.println("Enter Details:");
        System.out.println("1. Enter Name: ");
        Person person = new Person();
        Address ad = new Address();
        String name = in.next();
        person.setName(name);
        System.out.println("2. Enter Age: ");
        int age = intInput(in);
        person.setAge(age);
        System.out.println("3. Enter Gender: ");
        String gender = in.next(); 
        person.setGender(gender);
        System.out.println("4. Enter Address details: ");
        System.out.println("Street name : ");
        String street = in.next();
        ad.setStreet(street);
        System.out.println("Community : ");
        String community = in.next(); 
        ad.setCommunity(community);
        System.out.println("Zipcode : ");
        int zip = intInput(in);
        in.nextLine();
        ad.setZipCode(zip);
        System.out.println("State : ");
        String state = in.next(); 
        ad.setState(state);
        person.setAddress(ad);
        return person;
    }
    
    public static int intInput(Scanner in) {
        int input;
         while(true) {
            try {
                input = in.nextInt(); 
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                in.nextLine();
            }
        }
        return input;
    }


    public static VitalSigns getVitalInfo( Scanner in) {
        VitalSigns newVitalSigns;
        System.out.println("************************************************");
        System.out.println("*************Vital Sign Details*****************");
        System.out.println("************************************************");
        System.out.println("Enter patient's Age Group:  " );
        String patientAgeGroup = in.nextLine(); 
        System.out.println("Respiratory Rate: " );
        int patientRespiratoryRate; 
        while(true) {
            try {
                patientRespiratoryRate = in.nextInt(); 
                break;
            }catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
               in.nextLine();
            }
        }
        System.out.println("Heart Rate: " );
        int patientHeartRate;  
        while(true) {
            try {
                patientHeartRate = in.nextInt();
                break;
            }catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                in.nextLine();
            }
        }
        System.out.println("Systolic Blood Pressure: " );
        int patientBloodPressure; 
        while(true) {
            try {
                patientBloodPressure = in.nextInt();
                break;
            }catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                in.nextLine();
            }
        }
        System.out.println("Patient weight (in kgs): " );
        double patientWeightinKG;
        while(true) {
            try {
                patientWeightinKG = in.nextDouble();
                break;
            }catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                in.nextLine();
            }
        }
        System.out.println("Please enter Patient weight (in lbs): " );       
        double patientWeightinLB;
        while(true) {
            try {
                patientWeightinLB = in.nextDouble();
                break;
            }catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                in.nextLine();
            }
        }
        newVitalSigns = new VitalSigns(patientAgeGroup, patientRespiratoryRate,
                        patientHeartRate, patientBloodPressure, patientWeightinKG, patientWeightinLB);
        return newVitalSigns;
    }
    

    public static void initalizeData(PersonDirectory personDir, PatientDirectory patientDir ) {
        System.out.println("\nTestcases running...");
        
        Address add7 = new Address("st6", "Community2", 1, "city1");
        Person person7 = new Person("p6", 0, "female", add7);
        VitalSigns newVS7 = new VitalSigns("NewBorn", 25, 130, 80, 2.5, 6);
        PatientEncounter encounter7 = new PatientEncounter();
        PatientEncounterHistory eh7 = new PatientEncounterHistory();
        personDir.addPerson(person7);
        encounter7.setVs(newVS7);
        encounter7.setPerson(person7);
        if (!encounter7.isPatientNormal(newVS7)) {
            Patient patient = new Patient();
            patient.setEh(eh7);
            patient.setPerson(person7);
            patientDir.addPatient(patient);
            
        } 
        eh7.addEncounter(encounter7);


        Address add8 = new Address("st8", "Community2", 1, "city1");
        Person person8 = new Person("p8", 0, "female", add8);
        VitalSigns newVS8 = new VitalSigns("Infant", 25, 100, 60, 4.5, 18);
        PatientEncounter encounter8 = new PatientEncounter();
        PatientEncounterHistory eh8 = new PatientEncounterHistory();
        personDir.addPerson(person8);
        encounter8.setVs(newVS8);
        encounter8.setPerson(person8);
        if (!encounter8.isPatientNormal(newVS8)) {
            Patient patient = new Patient();
            patient.setEh(eh8);
            patient.setPerson(person8);
            patientDir.addPatient(patient);
            
        }
        eh8.addEncounter(encounter8);

        Address add9 = new Address("st9", "Community2", 2, "city1");
        Person person9 = new Person("p9", 0, "female", add9);
        VitalSigns newVS9 = new VitalSigns("Toddler", 27, 100, 130, 12, 26);
        PatientEncounter encounter9 = new PatientEncounter();
        PatientEncounterHistory eh9 = new PatientEncounterHistory();
        personDir.addPerson(person9);
        encounter9.setVs(newVS9);
        encounter9.setPerson(person9);
        if (!encounter9.isPatientNormal(newVS9)) {
            Patient patient = new Patient();
            patient.setEh(eh9);
            patient.setPerson(person9);
            patientDir.addPatient(patient);
            System.out.println("Patient condition is abnormal, added to Patient directory");
        } else {
            System.out.println("Patient condition is normal, added to Person directory");
        }
        eh9.addEncounter(encounter9);

        Address add10 = new Address("st10", "Community2", 2, "city1");
        Person person10 = new Person("p10", 0, "female", add7);
        VitalSigns newVS10 = new VitalSigns("PreSchooler", 26, 90, 130, 16, 36);
        PatientEncounter encounter10 = new PatientEncounter();
        PatientEncounterHistory eh10 = new PatientEncounterHistory();
        personDir.addPerson(person10);
        encounter10.setVs(newVS10);
        encounter10.setPerson(person10);
        if (!encounter10.isPatientNormal(newVS10)) {
            Patient patient = new Patient();
            patient.setEh(eh10);
            patient.setPerson(person10);
            patientDir.addPatient(patient);
            System.out.println("Patient condition is abnormal, added to Patient directory");
        } else {
            System.out.println("Patient condition is normal, added to Person directory");
        }
        eh10.addEncounter(encounter10);

        Address add11 = new Address("st11", "Community2", 2, "city1");
        Person person11 = new Person("p11", 0, "male", add11);
        VitalSigns newVS11 = new VitalSigns("SchoolAge", 22, 80, 140, 25, 60);
        PatientEncounter encounter11 = new PatientEncounter();
        PatientEncounterHistory eh11 = new PatientEncounterHistory();
        personDir.addPerson(person11);
        encounter11.setVs(newVS11);
        encounter11.setPerson(person11);
        if (!encounter11.isPatientNormal(newVS11)) {
            Patient patient = new Patient();
            patient.setEh(eh11);
            patient.setPerson(person11);
            patientDir.addPatient(patient);
            System.out.println("Patient condition is abnormal, added to Patient directory");
        } else {
            System.out.println("Patient condition is normal, added to Person directory");
        }
        eh11.addEncounter(encounter11);
        
       /* Address add12 = new Address("st11", "Community2", 2, "city1");
        Person person12 = new Person("p11", 0, "female", add11);
        VitalSigns newVS12 = new VitalSigns("Adolescent", 22, 80, 99, 25, 60);
        PatientEncounter encounter12 = new PatientEncounter();
        PatientEncounterHistory eh12 = new PatientEncounterHistory();
        personDir.addPerson(person12);
        encounter12.setVs(newVS11);
        encounter11.setPerson(person12);
        if (!encounter11.isPatientNormal(newVS11)) {
            Patient patient = new Patient();
            patient.setEh(eh12);
            patient.setPerson(person12);
            patientDir.addPatient(patient);
            System.out.println("Patient condition is abnormal, added to Patient directory");
        } else {
            System.out.println("Patient condition is normal, added to Person directory");
        }
        eh11.addEncounter(encounter12);*/
        
    }
}

