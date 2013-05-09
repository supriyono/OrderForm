/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Supri
 */
public class CustomerProfileModel {
    
    private static HashMap<String, HashMap<String, String>> custProfile;
    
    public HashMap<String, String> getCustAttribute(String schoolName){
        return custProfile.get(schoolName);
    }
    
    public Set<String> getSchoolList(){
        return custProfile.keySet();
    }
    
    public CustomerProfileModel(){
         custProfile = new HashMap<>();
                 
         HashMap<String, String> aProfile = new HashMap<>();
         aProfile.put("School Name", "Point Grey Secondary School");
         aProfile.put("Customer Number", "00001");
         aProfile.put("Country", "Canada");
         aProfile.put("State", "British Columbia");
         aProfile.put("City", "Vancouver");
         aProfile.put("Address", "5350 East Blvd");
         aProfile.put("Postal Code", "V6M 3V2");
         aProfile.put("Phone", "+1 (604) 713-8220");
         aProfile.put("Fax", "+1 (604) 713-8218");
         custProfile.put(aProfile.get("School Name"), aProfile);
         
         HashMap<String, String> bProfile = new HashMap<>();
         bProfile.put("School Name", "Britannia Secondary School");
         bProfile.put("Customer Number", "00002");
         bProfile.put("Country", "Canada");
         bProfile.put("State", "British Columbia");
         bProfile.put("City", "Vancouver");
         bProfile.put("Address", "1001 Cotton Drive");
         bProfile.put("Postal Code", "V5L 3T4");
         bProfile.put("Phone", "+1 (604) 713-8266");
         bProfile.put("Fax", "+1 (604) 713-8265");
         custProfile.put(bProfile.get("School Name"), bProfile);
        
         HashMap<String, String> cProfile = new HashMap<>();
         cProfile.put("School Name", "Lord Byng Secondary School");
         cProfile.put("Customer Number", "00003");         
         cProfile.put("Country", "Canada");
         cProfile.put("State", "British Columbia");
         cProfile.put("City", "Vancouver");
         cProfile.put("Address", "3939 West 16th Avenue");
         cProfile.put("Postal Code", "V5R 3C9");
         cProfile.put("Phone", "+1 (604) 713-8171");
         cProfile.put("Fax", "+1 (604) 713-8170");
         custProfile.put(cProfile.get("School Name"), cProfile);
        
         HashMap<String, String> dProfile = new HashMap<>();
         dProfile.put("School Name", "Sir Winston Churchill Secondary School");
         dProfile.put("Customer Number", "00004");
         dProfile.put("Country", "Canada");
         dProfile.put("State", "British Columbia");
         dProfile.put("City", "Vancouver");
         dProfile.put("Address", "7055 Heather Street");
         dProfile.put("Postal Code", "V6P 3P7");
         dProfile.put("Phone", "+1 (604) 713-8189");
         dProfile.put("Fax", "+1 (604) 713-8188");
         custProfile.put(dProfile.get("School Name"), dProfile);
         
         HashMap<String, String> eProfile = new HashMap<>();
         eProfile.put("School Name", "Crofton House School");
         eProfile.put("Customer Number", "00005");
         eProfile.put("Country", "Canada");
         eProfile.put("State", "British Columbia");
         eProfile.put("City", "Vancouver");
         eProfile.put("Address", "3200 West 41st Avenue");
         eProfile.put("Postal Code", "V6N 3E1");
         eProfile.put("Phone", "+1 (604) 263-3255");
         eProfile.put("Fax", "+1 (604) 263-4941");
         custProfile.put(eProfile.get("School Name"), eProfile);
         
         HashMap<String, String> fProfile = new HashMap<>();
         fProfile.put("School Name", "David Thompson Secondary School");
         fProfile.put("Customer Number", "00006");
         fProfile.put("Country", "Canada");
         fProfile.put("State", "British Columbia");
         fProfile.put("City", "Vancouver");
         fProfile.put("Address", "1755 East 55th Avenue");
         fProfile.put("Postal Code", "V5P 1Z7");
         fProfile.put("Phone", "+1 (604) 713-8278");
         fProfile.put("Fax", "+1 (604) 713-8277");
         custProfile.put(fProfile.get("School Name"), fProfile);
         
         HashMap<String, String> gProfile = new HashMap<>();
         gProfile.put("School Name", "Eric Hamber Secondary School");
         gProfile.put("Customer Number", "00007");
         gProfile.put("Country", "Canada");
         gProfile.put("State", "British Columbia");
         gProfile.put("City", "Vancouver");
         gProfile.put("Address", "5025 Willow Street");
         gProfile.put("Postal Code", "V5Z 3S1");
         gProfile.put("Phone", "+1 (604) 713-8927");
         gProfile.put("Fax", "+1 (604) 713-8926");
         custProfile.put(gProfile.get("School Name"), gProfile);
         
         HashMap<String, String> hProfile = new HashMap<>();
         hProfile.put("School Name", "Gladstone Secondary School");
         hProfile.put("Customer Number", "00008");
         hProfile.put("Country", "Canada");
         hProfile.put("State", "British Columbia");
         hProfile.put("City", "Vancouver");
         hProfile.put("Address", "4105 Gladstone Street");
         hProfile.put("Postal Code", "V5N 4Z2");
         hProfile.put("Phone", "+1 (604) 713-8288");
         hProfile.put("Fax", "+1 (604) 713-8287");
         custProfile.put(hProfile.get("School Name"), hProfile);
         
         HashMap<String, String> iProfile = new HashMap<>();
         iProfile.put("School Name", "John Oliver Secondary School");
         iProfile.put("Customer Number", "00009");
         iProfile.put("Country", "Canada");
         iProfile.put("State", "British Columbia");
         iProfile.put("City", "Vancouver");
         iProfile.put("Address", "530 East 41st Avenue");
         iProfile.put("Postal Code", "V5W 1P3");
         iProfile.put("Phone", "+1 (604) 713-8938");
         iProfile.put("Fax", "+1 (604) 713-8937");
         custProfile.put(iProfile.get("School Name"), iProfile);
         
         HashMap<String, String> jProfile = new HashMap<>();
         jProfile.put("School Name", "King David High School");
         jProfile.put("Customer Number", "00010");
         jProfile.put("Country", "Canada");
         jProfile.put("State", "British Columbia");
         jProfile.put("City", "Vancouver");
         jProfile.put("Address", "5718 Willow Street");
         jProfile.put("Postal Code", "V5Z 4S9");
         jProfile.put("Phone", "+1 (604) 263-9700");
         jProfile.put("Fax", "+1 (604) 263-4848");
         custProfile.put(jProfile.get("School Name"), jProfile);
         
         HashMap<String, String> kProfile = new HashMap<>();
         kProfile.put("School Name", "Kitsilano Secondary School");
         kProfile.put("Customer Number", "00011");
         kProfile.put("Country", "Canada");
         kProfile.put("State", "British Columbia");
         kProfile.put("City", "Vancouver");
         kProfile.put("Address", "2550 West 10th Avenue");
         kProfile.put("Postal Code", "V6K 2J6");
         kProfile.put("Phone", "+1 (604) 713-8961");
         kProfile.put("Fax", "+1 (604) 713-8960");
         custProfile.put(kProfile.get("School Name"), kProfile);
         
         HashMap<String, String> lProfile = new HashMap<>();
         lProfile.put("School Name", "David Thompson Secondary School");
         lProfile.put("Customer Number", "00012");
         lProfile.put("Country", "Canada");
         lProfile.put("State", "British Columbia");
         lProfile.put("City", "Vancouver");
         lProfile.put("Address", "1755 East 55th Avenue");
         lProfile.put("Postal Code", "V5P 1Z7");
         lProfile.put("Phone", "+1 (604) 713-8278");
         lProfile.put("Fax", "+1 (604) 713-8277");
         custProfile.put(lProfile.get("School Name"), lProfile);
         
         HashMap<String, String> mProfile = new HashMap<>();
         mProfile.put("School Name", "Little Flower Academy");
         mProfile.put("Customer Number", "00013");
         mProfile.put("Country", "Canada");
         mProfile.put("State", "British Columbia");
         mProfile.put("City", "Vancouver");
         mProfile.put("Address", "4195 Alexandra Street");
         mProfile.put("Postal Code", "V6J 4C6");
         mProfile.put("Phone", "+1 (604) 738-9016");
         mProfile.put("Fax", "+1 (604) 738-5749");
         custProfile.put(mProfile.get("School Name"), mProfile);
         
         HashMap<String, String> nProfile = new HashMap<>();
         nProfile.put("School Name", "Magee Secondary School");
         nProfile.put("Customer Number", "00014");
         nProfile.put("Country", "Canada");
         nProfile.put("State", "British Columbia");
         nProfile.put("City", "Vancouver");
         nProfile.put("Address", "6360 Maple Street");
         nProfile.put("Postal Code", "V6M 4M2");
         nProfile.put("Phone", "+1 (604) 713-8200");
         nProfile.put("Fax", "+1 (604) 713-8209");
         custProfile.put(nProfile.get("School Name"), nProfile);
         
         HashMap<String, String> oProfile = new HashMap<>();
         oProfile.put("School Name", "Notre Dame Regional Secondary School");
         oProfile.put("Customer Number", "00015");
         oProfile.put("Country", "Canada");
         oProfile.put("State", "British Columbia");
         oProfile.put("City", "Vancouver");
         oProfile.put("Address", "2880 Venables St");
         oProfile.put("Postal Code", "V5K 4Z6");
         oProfile.put("Phone", "+1 (604) 255-5454");
         oProfile.put("Fax", "+1 (604) 255-2115");
         custProfile.put(oProfile.get("School Name"), oProfile);
        
         HashMap<String, String> pProfile = new HashMap<>();
         pProfile.put("School Name", "Prince of Wales Secondary School");
         pProfile.put("Customer Number", "00016");
         pProfile.put("Country", "Canada");
         pProfile.put("State", "British Columbia");
         pProfile.put("City", "Vancouver");
         pProfile.put("Address", "2250 Eddington Drive");
         pProfile.put("Postal Code", "V6L 2E7");
         pProfile.put("Phone", "+1 (604) 713-8974");
         pProfile.put("Fax", "+1 (604) 713-8973");
         custProfile.put(pProfile.get("School Name"), pProfile);
         
         HashMap<String, String> qProfile = new HashMap<>();
         qProfile.put("School Name", "St. George's School");
         qProfile.put("Customer Number", "00017");
         qProfile.put("Country", "Canada");
         qProfile.put("State", "British Columbia");
         qProfile.put("City", "Vancouver");
         qProfile.put("Address", "4175 West 29th Avenue");
         qProfile.put("Postal Code", "V6S 1V1");
         qProfile.put("Phone", "+1 (604) 224-1304");
         qProfile.put("Fax", "+1 (604) 224-7066");
         custProfile.put(qProfile.get("School Name"), qProfile);
         
         HashMap<String, String> rProfile = new HashMap<>();
         rProfile.put("School Name", "St. John's School");
         rProfile.put("Customer Number", "00018");
         rProfile.put("Country", "Canada");
         rProfile.put("State", "British Columbia");
         rProfile.put("City", "Vancouver");
         rProfile.put("Address", "2215 West 10 Avenue");
         rProfile.put("Postal Code", "V6K 2J1");
         rProfile.put("Phone", "+1 (604) 732-4434");
         rProfile.put("Fax", "+1 (604) 732-1074");
         custProfile.put(rProfile.get("School Name"), rProfile);
         
         HashMap<String, String> sProfile = new HashMap<>();
         sProfile.put("School Name", "Sir Charles Tupper Secondary School");
         sProfile.put("Customer Number", "00019");
         sProfile.put("Country", "Canada");
         sProfile.put("State", "British Columbia");
         sProfile.put("City", "Vancouver");
         sProfile.put("Address", "419 East 24th Avenue");
         sProfile.put("Postal Code", "V5V 2A2");
         sProfile.put("Phone", "+1 (604) 713-8233");
         sProfile.put("Fax", "+1 (604) 713-8232");
         custProfile.put(sProfile.get("School Name"), sProfile);
         
         HashMap<String, String> tProfile = new HashMap<>();
         tProfile.put("School Name", "Stratford Hall");
         tProfile.put("Customer Number", "00020");
         tProfile.put("Country", "Canada");
         tProfile.put("State", "British Columbia");
         tProfile.put("City", "Vancouver");
         tProfile.put("Address", "3000 Commercial Drive");
         tProfile.put("Postal Code", "V5N 4E2");
         tProfile.put("Phone", "+1 (604) 436-0608");
         tProfile.put("Fax", "+1 (604) 436-0616");
         custProfile.put(tProfile.get("School Name"), tProfile);
         
         HashMap<String, String> uProfile = new HashMap<>();
         uProfile.put("School Name", "Templeton Secondary School");
         uProfile.put("Customer Number", "00021");
         uProfile.put("Country", "Canada");
         uProfile.put("State", "British Columbia");
         uProfile.put("City", "Vancouver");
         uProfile.put("Address", "727 Templeton Drive");
         uProfile.put("Postal Code", "V5L 4N8");
         uProfile.put("Phone", "+1 (604) 713-8984");
         uProfile.put("Fax", "+1 (604) 713-8983");
         custProfile.put(uProfile.get("School Name"), uProfile);
         
         HashMap<String, String> vProfile = new HashMap<>();
         vProfile.put("School Name", "University Hill Secondary School");
         vProfile.put("Customer Number", "00022");
         vProfile.put("Country", "Canada");
         vProfile.put("State", "British Columbia");
         vProfile.put("City", "Vancouver");
         vProfile.put("Address", "3228 Ross Drive,");
         vProfile.put("Postal Code", "V6S 0C6");
         vProfile.put("Phone", "+1 (604) 713-8258");
         vProfile.put("Fax", "+1 (604) 713-8257");
         custProfile.put(vProfile.get("School Name"), vProfile);
         
         HashMap<String, String> wProfile = new HashMap<>();
         wProfile.put("School Name", "York House School");
         wProfile.put("Customer Number", "00023");
         wProfile.put("Country", "Canada");
         wProfile.put("State", "British Columbia");
         wProfile.put("City", "Vancouver");
         wProfile.put("Address", "4176 Alexandra Street");
         wProfile.put("Postal Code", "V6J 2V6");
         wProfile.put("Phone", "+1 (604) 736-6551");
         wProfile.put("Fax", "+1 (604) 736.6530");
         custProfile.put(wProfile.get("School Name"), wProfile);
         
         HashMap<String, String> xProfile = new HashMap<>();
         xProfile.put("School Name", "West Point Grey Academy");
         xProfile.put("Customer Number", "00024");
         xProfile.put("Country", "Canada");
         xProfile.put("State", "British Columbia");
         xProfile.put("City", "Vancouver");
         xProfile.put("Address", "4125 West 8th Avenue");
         xProfile.put("Postal Code", "V6R 4P9");
         xProfile.put("Phone", "+1 (604) 224.1332");
         xProfile.put("Fax", "+1 (604) 224-1334");
         custProfile.put(xProfile.get("School Name"), xProfile);
         
         HashMap<String, String> yProfile = new HashMap<>();
         yProfile.put("School Name", "Windermere Secondary School");
         yProfile.put("Customer Number", "00025");
         yProfile.put("Country", "Canada");
         yProfile.put("State", "British Columbia");
         yProfile.put("City", "Vancouver");
         yProfile.put("Address", "3155 East 27th Avenue");
         yProfile.put("Postal Code", "V5R 1P3");
         yProfile.put("Phone", "+1 (604) 713-8180");
         yProfile.put("Fax", "+1 (604) 713-8179");
         custProfile.put(yProfile.get("School Name"), yProfile);
     }
    
    /*public static void main(String args[]){
        CustomerProfileModel aProfile = new CustomerProfileModel();
        Set<String> key;
        key = custProfile.keySet();
        for(String s : key){
            System.out.println(s);
        }
    }*/
}
