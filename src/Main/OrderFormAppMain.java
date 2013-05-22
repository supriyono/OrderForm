/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.CustomerProfileController;
import GUI.MainView;
import Model.CustomerProfileModel;
import javax.swing.UIManager;

/**
 *
 * @author Supri
 */
public class OrderFormAppMain {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        try {
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            */        
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        //</editor-fold>
        
        final MainView theView = new MainView();
        CustomerProfileModel theModel = new CustomerProfileModel();
        CustomerProfileController theController = new CustomerProfileController(theView, theModel);
        
         /*Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                theView.setVisible(true);
            }
        });
        
    }
}
