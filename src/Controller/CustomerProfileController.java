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
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

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
        theView.addProductSizeComboBoxListener(new ProductSizeComboBoxListener());
        theView.addProductFamilyComboBoxListener(new ProductFamilyComboBoxListener());
        theView.addTeacherEditionCheckBoxListener(new TeacherEditionCheckBoxListener());
        theView.addStudentEditionCheckBoxListener(new StudentEditionCheckBoxListener());
        theView.addCodeComboBoxListener(new CodeComboBoxListener());
    }

    private class CodeComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            
        }

    }

    private class StudentEditionCheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED && ((JCheckBox)(e.getSource())).isEnabled())
                theView.setStudentQuantityEnable(true);
            else
                theView.setStudentQuantityEnable(false);
        }

    }


    private class TeacherEditionCheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED && ((JCheckBox)(e.getSource())).isEnabled()){
                theView.setTeacherQuantityEnable(true);
                if(theView.getProductSize() == "8.5\" x 11\""){
                    theView.removeAllFromRLComboBox();
                    theView.addToRLComboBox("None");
                    theView.addToRLComboBox("Lesson Plans ($1.60)");
                    theView.addToRLComboBox("Record Charts ($1.60)");
                    theView.addToRLComboBox("L.Plans & R.Charts ($3.20)");
                    theView.setAddRLComboBoxEnable(true);
                }
            }
            else{
                theView.setAddRLComboBoxEnable(false);
                theView.setTeacherQuantityEnable(false);
            }
        }
    }

    
    private class ProductFamilyComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(!theView.getProductFamily().equals("- Choose Product Family -")){
                theView.setCodeComboBoxEnable(true);
                if(theView.getProductSize().equals("5\" x 8\"")){
                    if(theView.getProductFamily().equals("The 101")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("101H-B5");
                    }
                    else if(theView.getProductFamily().equals("Classic")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("CLAH-B5");
                    }
                    else if(theView.getProductFamily().equals("Faith & Life")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FLIH-B5");
                    }
                    else if(theView.getProductFamily().equals("Family Edition")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FESF-B5");
                    }
                    else if(theView.getProductFamily().equals("Foundations")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FOUH-B5");
                    }
                    else if(theView.getProductFamily().equals("Hammond & Stephens")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("H&SU-B5");
                    }
                    else if(theView.getProductFamily().equals("Parent-Student Handbook")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("PSH-5");
                    }
                    else if(theView.getProductFamily().equals("Student Learning That Works")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("SLWH-B5");
                    }
                    else
                        theView.removeAllFromCodeComboBox();
                }
                else if(theView.getProductSize().equals("7\" x 9\"")){
                    if(theView.getProductFamily().equals("The 101")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("101H-M7");
                    }
                    else if(theView.getProductFamily().equals("Classic")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("CLAM-M7");
                    }
                    else if(theView.getProductFamily().equals("Family Edition")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FESF-M7");
                    }
                    else if(theView.getProductFamily().equals("Foundations")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FOUH-M7");
                        theView.addToCodeComboBox("FOUM-B7");
                    }
                    else if(theView.getProductFamily().equals("Green")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("GREH-M7");
                    }
                    else if(theView.getProductFamily().equals("Parent-Student Handbook")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("PSH-7");
                    }
                    else
                        theView.removeAllFromCodeComboBox();
                }
                else if(theView.getProductSize().equals("7\" x 11\"")){
                    
                    if(theView.getProductFamily().equals("Hammond & Stephens")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("H&SU-B11");
                        theView.addToCodeComboBox("H&SU-D11");
                        theView.addToCodeComboBox("H&SU-R11");
                    }
                    else
                        theView.removeAllFromCodeComboBox();
                }
                else if(theView.getProductSize().equals("8.5\" x 11\"")){
                    if(theView.getProductFamily().equals("The 101")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("101E-M8");
                        theView.addToCodeComboBox("101M-M8");
                        theView.addToCodeComboBox("101P-B8");
                    }
                    else if(theView.getProductFamily().equals("Classic")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("CLAE-M8");
                        theView.addToCodeComboBox("CLAM-M8");
                        theView.addToCodeComboBox("CLAP-B8");
                    }
                    else if(theView.getProductFamily().equals("Faith & Life")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FLIE-B8");
                        theView.addToCodeComboBox("FLIM-M8");
                        theView.addToCodeComboBox("FLIP-B8");
                    }
                    else if(theView.getProductFamily().equals("Family Edition")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FESF-M8");
                    }
                    else if(theView.getProductFamily().equals("Foundations")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("FOUE-B8");
                        theView.addToCodeComboBox("FOUE-M8");
                        theView.addToCodeComboBox("FOUM-M8");
                        theView.addToCodeComboBox("FOUP-B8");
                        theView.addToCodeComboBox("FSPE-M8");
                        theView.addToCodeComboBox("FSPM-M8");
                        theView.addToCodeComboBox("FSPP-B8");
                    }
                    else if(theView.getProductFamily().equals("Green")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("GREE-B8");
                        theView.addToCodeComboBox("GREE-M8");
                        theView.addToCodeComboBox("GREP-B8");
                    }
                    else if(theView.getProductFamily().equals("Hammond & Stephens")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("H&SU-B8");
                    }
                    else if(theView.getProductFamily().equals("Early Learning")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("EARK-B8");
                    }
                    else if(theView.getProductFamily().equals("Be Healthy to Learn")){
                        theView.removeAllFromCodeComboBox();
                        theView.addToCodeComboBox("BHLE-B8");
                        theView.addToCodeComboBox("BHLE-M8");
                        theView.addToCodeComboBox("BHLM-M8");
                        theView.addToCodeComboBox("BHLP-B8");
                    }
                    else
                        theView.removeAllFromCodeComboBox();
                }
                else
                    theView.removeAllFromCodeComboBox();
            }
            else
                theView.setCodeComboBoxEnable(false);
        }
    }    
    

    private class ProductSizeComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(theView.getProductSize().equals("5\" x 8\"")){
                theView.setAddRLComboBoxEnable(false);
                theView.removeAllFromProductFamilyComboBox();
                theView.setAddRLComboBoxEnable(true);
                theView.addToProductFamilyComboBox("- Choose Product Family -");
                theView.addToProductFamilyComboBox("Classic");
                theView.addToProductFamilyComboBox("Faith & Life");
                theView.addToProductFamilyComboBox("Family Edition");
                theView.addToProductFamilyComboBox("Foundations");
                theView.addToProductFamilyComboBox("Hammond & Stephens");
                theView.addToProductFamilyComboBox("Parent-Student Handbook");
                theView.addToProductFamilyComboBox("Student Learning That Works");
                theView.addToProductFamilyComboBox("The 101");
            }
            else if(theView.getProductSize().equals("7\" x 9\"")){
                theView.setAddRLComboBoxEnable(false);
                theView.removeAllFromProductFamilyComboBox();
                theView.setProductFamilyComboBoxEnable(true);
                theView.addToProductFamilyComboBox("- Choose Product Family -");
                theView.addToProductFamilyComboBox("Classic");
                theView.addToProductFamilyComboBox("Family Edition");
                theView.addToProductFamilyComboBox("Foundations");
                theView.addToProductFamilyComboBox("Green");
                theView.addToProductFamilyComboBox("Parent-Student Handbook");
                theView.addToProductFamilyComboBox("The 101");
            }
            else if(theView.getProductSize().equals("7\" x 11\"")){
                theView.setAddRLComboBoxEnable(false);
                theView.removeAllFromProductFamilyComboBox();
                theView.setProductFamilyComboBoxEnable(true);
                theView.addToProductFamilyComboBox("- Choose Product Family -");
                theView.addToProductFamilyComboBox("Hammond & Stephens");
            }
            else if(theView.getProductSize().equals("8.5\" x 11\"")){
                if(theView.getTeacherCheckBox())
                    theView.setAddRLComboBoxEnable(true);
                theView.removeAllFromProductFamilyComboBox();
                theView.setProductFamilyComboBoxEnable(true);
                theView.addToProductFamilyComboBox("- Choose Product Family -");
                theView.addToProductFamilyComboBox("Be Healthy to Learn");
                theView.addToProductFamilyComboBox("Classic");
                theView.addToProductFamilyComboBox("Early Learning");
                theView.addToProductFamilyComboBox("Faith & Life");
                theView.addToProductFamilyComboBox("Family Edition");
                theView.addToProductFamilyComboBox("Foundations");
                theView.addToProductFamilyComboBox("Green");
                theView.addToProductFamilyComboBox("Hammond & Stephens");
                theView.addToProductFamilyComboBox("The 101");
            }
        }
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
                theView.setSchoolDistrict("039");
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
