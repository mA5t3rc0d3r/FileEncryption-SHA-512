/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Akshay Bisht
 */

import core.EandD;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EncryptionPass extends javax.swing.JFrame
{
    private File[] listOfFilesAndFolders;
    public EncryptionPass(File[] listOfFilesAndFolders)
    {
        this.listOfFilesAndFolders = listOfFilesAndFolders;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        initComponents();
        setResizable(false);
        eightCharInstructionLabel.setVisible(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getRootPane().setDefaultButton(proceedButton);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
    boolean verifyPasswords()
    {
        char password1[]=passwordField1.getPassword();
        char password2[]=passwordField2.getPassword();
        if(password1.length<8)
        {
            eightCharInstructionLabel.setText("For security reasons you must enter password of atleast 8 characters");
            eightCharInstructionLabel.setVisible(true);
            return false;
        }
        if(password1.length>7)
        {
            eightCharInstructionLabel.setVisible(false);
            if(password1.length==password2.length)
            {
                eightCharInstructionLabel.setVisible(false);
                if(Arrays.equals(password1, password2))
                {
                    return true;
                }

            }
            eightCharInstructionLabel.setText("Both the passwords differ!");
            eightCharInstructionLabel.setVisible(true);
        }
        
        return false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        proceedButton = new javax.swing.JButton();
        suggestionLabel = new javax.swing.JLabel();
        eightCharInstructionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Enter a password:");

        passwordField1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                passwordField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Re-enter the password:");

        passwordField2.setToolTipText("");
        passwordField2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                passwordField2KeyReleased(evt);
            }
        });

        proceedButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        proceedButton.setText("Proceed");
        proceedButton.setEnabled(false);
        proceedButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                proceedButtonActionPerformed(evt);
            }
        });

        suggestionLabel.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 16)); // NOI18N
        suggestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suggestionLabel.setText("The Longer The Password,The Most Secure The Password Is...");

        eightCharInstructionLabel.setForeground(new java.awt.Color(255, 0, 0));
        eightCharInstructionLabel.setText("For security reasons you must enter password of atleast 8 characters");
        eightCharInstructionLabel.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(suggestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eightCharInstructionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceedButton)
                        .addGap(395, 395, 395))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(suggestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightCharInstructionLabel))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordField2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField2KeyReleased
    {//GEN-HEADEREND:event_passwordField2KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField2KeyReleased

    private void passwordField1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField1KeyReleased
    {//GEN-HEADEREND:event_passwordField1KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField1KeyReleased

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_proceedButtonActionPerformed
    {//GEN-HEADEREND:event_proceedButtonActionPerformed
        setVisible(false);
        dispose();
        
        new EandD(listOfFilesAndFolders, "encrypt", new String(passwordField1.getPassword())).execute();
        
    }//GEN-LAST:event_proceedButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eightCharInstructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JButton proceedButton;
    private javax.swing.JLabel suggestionLabel;
    // End of variables declaration//GEN-END:variables
}
