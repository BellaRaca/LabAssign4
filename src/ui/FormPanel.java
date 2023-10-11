/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import java.awt.Color;


/**
 *
 * @author bellarao
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    public FormPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstLabel = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        emailaddressLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailaddressTextField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeDropdown = new javax.swing.JComboBox<>();
        submitLabel = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Katari", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Customer Registration Form");

        firstLabel.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        firstLabel.setText("First Name:");

        lastLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lastLabel.setText("Last Name:");

        emailaddressLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        emailaddressLabel.setText("Email Address:");

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ageLabel.setText("Age:");

        messageLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        messageLabel.setText("Message:");

        messageTextArea.setBackground(new java.awt.Color(255, 204, 204));
        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane5.setViewportView(messageTextArea);

        firstNameTextField.setBackground(new java.awt.Color(255, 204, 204));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });

        lastNameTextField.setBackground(new java.awt.Color(255, 204, 204));
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyReleased(evt);
            }
        });

        ageTextField.setBackground(new java.awt.Color(255, 204, 204));
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        emailaddressTextField.setBackground(new java.awt.Color(255, 204, 204));
        emailaddressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailaddressTextFieldKeyReleased(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        typeLabel.setText("Type:");

        typeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New Customer", "Return Customer", "Guest" }));
        typeDropdown.setSelectedIndex(-1);
        typeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDropdownActionPerformed(evt);
            }
        });

        submitLabel.setBackground(new java.awt.Color(153, 153, 153));
        submitLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitLabel.setText("Submit");
        submitLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeLabel)
                            .addComponent(emailaddressLabel)
                            .addComponent(firstLabel)
                            .addComponent(lastLabel)
                            .addComponent(ageLabel)
                            .addComponent(messageLabel))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailaddressTextField)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(submitLabel)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailaddressLabel)
                    .addComponent(emailaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel))
                .addGap(35, 35, 35)
                .addComponent(submitLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
        // TODO add your handling code here:
        String firstName = firstNameTextField.getText().toLowerCase();
        for (int i = 0; i < firstName.length(); i++) {
            if (firstName.charAt(i) < 97 || firstName.charAt(i) > 122) {
                JOptionPane.showMessageDialog(this, "Your first name must contain character from 'A' to 'Z' or character from 'a' to 'z'", "Wrong first name input", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void lastNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyReleased
        // TODO add your handling code here:
        String lastName = lastNameTextField.getText().toLowerCase();
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) < 97 || lastName.charAt(i) > 122) {
                JOptionPane.showMessageDialog(this, "Your last name must contain character from 'A' to 'Z' or character from 'a' to 'z'", "Wrong last name input", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_lastNameTextFieldKeyReleased

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        // TODO add your handling code here:
        String age = ageTextField.getText();
        for (int i = 0; i < age.length(); i++) {
            if (age.charAt(i) < 48 || age.charAt(i) > 57) {
                JOptionPane.showMessageDialog(this, "The age must contain from '1' to '9'", "Wrong age Input", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if (age.length() >= 2 && age.charAt(0) == '0') {
            JOptionPane.showMessageDialog(this, "The age format is wrong", "Wrong age Input", JOptionPane.ERROR_MESSAGE);
        }
        int ageNumberFormat = Integer.parseInt(age);
        if (ageNumberFormat >= 150) {
            JOptionPane.showMessageDialog(this, "The age is too large", "Wrong age Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ageTextFieldKeyReleased

    private void emailaddressTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailaddressTextFieldKeyReleased
        // TODO add your handling code here:
        String currentEmailAddressContent = emailaddressTextField.getText();
        int atCounter = 0;
        for (int i = 0; i < currentEmailAddressContent.length(); i++) {
            if (currentEmailAddressContent.charAt(i) == '@') {
                atCounter++;
                if (atCounter >= 2) {
                    JOptionPane.showMessageDialog(this, "invalid email address","Wrong Emial Format", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }

    }//GEN-LAST:event_emailaddressTextFieldKeyReleased

    private void typeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDropdownActionPerformed

    private void submitLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLabelActionPerformed
        // TODO add your handling code here:
        // System.out.println ("Congratulations, you have submitted")
        String firstLabel = firstNameTextField.getText();//for text fields
        String lastLabel = lastNameTextField.getText();//for text fields
        String ageLabel = ageTextField.getText();//for text fields
        String emailaddressLabel = emailaddressTextField.getText();//for text fields
        String messageLabel = messageTextArea.getText();//for text field
        String typeLabel = typeDropdown.getSelectedItem().toString();//selected item dropdown
        boolean isEmailAddressValid = isEmailAddressValid(emailaddressLabel);
        if (isEmailAddressValid == false) {
            JOptionPane.showMessageDialog(this, "invalid email address","Wrong Emial Format", JOptionPane.ERROR_MESSAGE);

        } else {

//            jPanel1.setVisible(false);
//            firstLabel3.setText(firstLabel);
//            lastLabel3.setText(lastLabel);
//            ageLabel3.setText(ageLabel);
//            emailLabel3.setText(emailaddressLabel);
//            messageLabel3.setText(messageLabel);
//            typeLabel3.setText(typeLabel);
//
//            jPanel2.setVisible(true);
        }  
    }//GEN-LAST:event_submitLabelActionPerformed
    private boolean isEmailAddressValid(String emailAddress) {
        if (emailAddress.charAt(0) == '@' || emailAddress.charAt(emailAddress.length() - 1) == '@') {
            return false;
        }
        int atCounter = 0;
        for (int i = 0; i < emailAddress.length(); i++) {
            if (emailAddress.charAt(i) == '@') {
                atCounter++;
            }
        }
        if (atCounter == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailaddressLabel;
    private javax.swing.JTextField emailaddressTextField;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton submitLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeDropdown;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
