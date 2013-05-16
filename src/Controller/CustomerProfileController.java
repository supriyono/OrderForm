/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.MainView;
import Model.CustomerProfileModel;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

/**
 *
 * @author Supri
 */
public class CustomerProfileController {
    private MainView theView;
    private CustomerProfileModel theModel;
    
    public CustomerProfileController(MainView aView, CustomerProfileModel aModel){
        theView = aView;
        theModel = aModel;
        
        theView.addSchoolComboBoxListener(new SchoolComboBoxListener());
        theView.addBillingEqualProfileCheckBoxListener(new BillingEqualProfileCheckBoxListener());
    }



    private class SchoolComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); 
            String theKey = theView.getSchoolName();
            if("<Select School>".equals(theKey)){
                theView.setProfileCustNumber(null);
                theView.setProfileCountry(null);
                theView.setProfileStates(null);
                theView.setProfileCity(null);
                theView.setProfileAddress(null);
                theView.setProfilePostalCode(null);
                theView.setProfilePhone(null);
                theView.setProfileFax(null);
            }
            else{
                HashMap<String, String> keyProfile = theModel.getCustAttribute(theKey);
                theView.setProfileCustNumber(keyProfile.get("Customer Number"));
                theView.setProfileCountry(keyProfile.get("Country"));
                theView.setProfileStates(keyProfile.get("State"));
                theView.setProfileCity(keyProfile.get("City"));
                theView.setProfileAddress(keyProfile.get("Address"));
                theView.setProfilePostalCode(keyProfile.get("Postal Code"));
                theView.setProfilePhone(keyProfile.get("Phone"));
                theView.setProfileFax(keyProfile.get("Fax"));
            }
            
            if(theView.getValueBillingEqualProfileCheckBox()){
                theView.setBillingCustNumber(theView.getProfileCustNumber());
                theView.setBillingCountry(theView.getProfileCountry());
                theView.setBillingStates(theView.getProfileStates());
                theView.setBillingCity(theView.getProfileCity());
                theView.setBillingAddress(theView.getProfileAddress());
                theView.setBillingPostalCode(theView.getProfilePostalCode());
                theView.setBillTo(theView.getSchoolName());
            }
        }
    }
    
    private class BillingEqualProfileCheckBoxListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(theView.getSchoolName().equals("<Select School>")){
                    theView.displayErrorMessage("Please select a school first!");
                    theView.setBillingEqualProfileCheckBox(false);
                }
                else{
                    theView.setBillingCustNumber(theView.getProfileCustNumber());
                    theView.setBillingCountry(theView.getProfileCountry());
                    theView.setBillingStates(theView.getProfileStates());
                    theView.setBillingCity(theView.getProfileCity());
                    theView.setBillingAddress(theView.getProfileAddress());
                    theView.setBillingPostalCode(theView.getProfilePostalCode());
                    theView.setBillTo(theView.getSchoolName());
                }
            }
            else{
                theView.resetBillingDetails();
            }
        }
    }
}
