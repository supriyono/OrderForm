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
        
        //theView.addShoolToComboBox(theModel.getSchoolList());
        theView.addSchoolComboBoxListener(new SchoolComboBoxListener());
        theView.addNextButtonListener(new NextButtonListener());
    }

    private class SchoolComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String theKey = theView.getSchoolName();
            if("<Select School>".equals(theKey)){
                theView.setCountry(null);
                theView.setState(null);
                theView.setCity(null);
                theView.setAddress(null);
                theView.setPostalCode(null);
                theView.setPhone(null);
                theView.setFax(null);
            }
            else{
                HashMap<String, String> keyProfile = theModel.getCustAttribute(theKey);
                theView.setCountry(keyProfile.get("Country"));
                theView.setState(keyProfile.get("State"));
                theView.setCity(keyProfile.get("City"));
                theView.setAddress(keyProfile.get("Address"));
                theView.setPostalCode(keyProfile.get("Postal Code"));
                theView.setPhone(keyProfile.get("Phone"));
                theView.setFax(keyProfile.get("Fax"));
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
}
