/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.CustomerProfileView;
import Model.CustomerProfileModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Supri
 */
public class CustomerProfileController {
    private CustomerProfileView theView;
    private CustomerProfileModel theModel;
    
    public CustomerProfileController(CustomerProfileView aView, CustomerProfileModel aModel){
        theView = aView;
        theModel = aModel;
        
        
        theView.addSchoolComboBoxListener(new SchoolComboBoxListener());
        theView.addSameBillingCheckBoxListener(new SameBillingCheckBoxListener());
        theView.addSameShippingCheckBoxListener(new SameShippingCheckBoxListener());
    }

    private class SchoolComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
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
        }
    }
    
    private class NextButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                new InternetAddress(theView.getPrimaryEmail()).validate();
                theView.primaryEmailResetSetting();
                //add primary email to the model;
            }
            catch(AddressException ex){
                theView.primaryEmailError();
                theView.displayErrorMessage("The Primary email address is invalid!");
            }
            finally{
                try{
                    new InternetAddress(theView.getMaterialEmail()).validate();
                    theView.materialEmailResetSetting();
                    //add material email to the model;
                }
                catch(AddressException ex){
                    theView.materialEmailError();
                    theView.displayErrorMessage("The Material email address is invalid!");    
                }
            }
        }
    }
    
    private class SameBillingCheckBoxListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(theView.getSchoolName().equals("<Select School>")){
                theView.setSameBillingCheckBox(false);
                theView.displayErrorMessage("Please select a school first!");
            }
            else{
                if(theView.getSameBillingCheckBox()){
                    theView.setBillingCustNumber(theView.getProfileCustNumber());
                    theView.setBillingCountry(theView.getProfileCountry());
                    theView.setBillingStates(theView.getProfileStates());
                    theView.setBillingCity(theView.getProfileCity());
                    theView.setBillingAddress(theView.getProfileAddress());
                    theView.setBillingPostalCode(theView.getProfilePostalCode());
                    theView.setBillTo(theView.getSchoolName());
                    theView.setBillingTextFieldsEditable(false);
                }
                else{
                    theView.setBillingCustNumber(null);
                    theView.setBillingCountry(null);
                    theView.setBillingStates(null);
                    theView.setBillingCity(null);
                    theView.setBillingAddress(null);
                    theView.setBillingPostalCode(null);
                    theView.setBillTo(null);
                    theView.setBillingTextFieldsEditable(true);
                }
            }
        }
    }
    
    private class SameShippingCheckBoxListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(theView.getSchoolName().equals("<Select School>")){
                theView.setSameShippingCheckBox(false);
                theView.displayErrorMessage("Please select a school first!");
            }
            else{
                if(theView.getSameShippingCheckBox()){
                    theView.setShippingCustNumber(theView.getProfileCustNumber());
                    theView.setShippingCountry(theView.getProfileCountry());
                    theView.setShippingStates(theView.getProfileStates());
                    theView.setShippingCity(theView.getProfileCity());
                    theView.setShippingAddress(theView.getProfileAddress());
                    theView.setShippingPostalCode(theView.getProfilePostalCode());
                    theView.setShipTo(theView.getSchoolName());
                    theView.setShippingTextFieldsEditable(false);
                }
                else{
                    theView.setShippingCustNumber(null);
                    theView.setShippingCountry(null);
                    theView.setShippingStates(null);
                    theView.setShippingCity(null);
                    theView.setShippingAddress(null);
                    theView.setShippingPostalCode(null);
                    theView.setShipTo(null);
                    theView.setShippingTextFieldsEditable(true);
                }
            }
        }
    }
}
