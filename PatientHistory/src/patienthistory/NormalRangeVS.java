package patienthistory;
import java.util.HashMap; 
import java.util.Map; 

public class NormalRangeVS {
    
    Map<String, String> respiratoryRate;
    Map<String, String> pulseRate;
    Map<String, String> bloodPressure;
    Map<String, String> weight;
    
    public NormalRangeVS() {
        
        respiratoryRate = new HashMap<String, String>()  { 
             { 
                put("Newborn","30-50"); 
                put("Infant","20-30"); 
                put("Toddler","20-30"); 
                put("Preschooler","20-30"); 
                put("School age","20-30"); 
                put("Adult","12-20"); 
             } 
         }; 
        
        pulseRate = new HashMap<String, String>()  { 
             { 
                put("Newborn","120-160"); 
                put("Infant","80-140"); 
                put("Toddler","80-130"); 
                put("Preschooler","80-120"); 
                put("School age","70-110"); 
                put("Adult","55-105"); 
             } 
         }; 
        
         bloodPressure = new HashMap<String, String>()  { 
             { 
                put("Newborn","50-70"); 
                put("Infant","70-100"); 
                put("Toddler","80-110"); 
                put("Preschooler","80-110"); 
                put("School age","80-120"); 
                put("Adult","110-120"); 
             } 
         }; 
         
          weight = new HashMap<String, String>()  { 
             { 
                put("Newborn","2-3"); 
                put("Infant","4-10"); 
                put("Toddler","10-14"); 
                put("Preschooler","14-18"); 
                put("School age","20-42"); 
                put("Adult","50-100"); 
             } 
         }; 
        
        
    }
    
}
