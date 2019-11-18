/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davidkpeng
 */
public class AddEmployeeJFrame extends javax.swing.JFrame {
    private MyHashTable mainHT;
    private DefaultTableModel mainFTETableModel;
    private DefaultTableModel mainPTETableModel;

    /**
     * Creates new form AddEmployeeJFrame
     */
    public AddEmployeeJFrame() {
        initComponents();
        
    }
    
    public void setMainHT(MyHashTable mainHTRef){
        this.mainHT = mainHTRef;
    }
    
    public void setMainFTETableModel(DefaultTableModel modelRef){
        this.mainFTETableModel = modelRef;
    }
    
    public void setMainPTETableModel(DefaultTableModel modelRef){
        this.mainPTETableModel = modelRef;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2_AddEmp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2_First = new javax.swing.JTextField();
        jTextField3_Last = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1_Gender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2_WorkL = new javax.swing.JComboBox<>();
        jFormattedTextField1_EmpNum = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField2_DR = new javax.swing.JFormattedTextField();
        jButton1_Submit = new javax.swing.JButton();
        jButton2_Cancel = new javax.swing.JButton();
        jRadioButton1_FTE = new javax.swing.JRadioButton();
        jRadioButton2_PTE = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1_AS = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField2_HW = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField2_HpW = new javax.swing.JFormattedTextField();
        jFormattedTextField2_WY = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Employee Number:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jTextField2_First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_FirstActionPerformed(evt);
            }
        });

        jTextField3_Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_LastActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender:");

        jComboBox1_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel5.setText("Work Location:");

        jComboBox2_WorkL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Ottawa", "Chicago" }));

        jFormattedTextField1_EmpNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1_EmpNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1_EmpNumActionPerformed(evt);
            }
        });

        jLabel6.setText("Deductions Rate:");

        jFormattedTextField2_DR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField2_DR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2_DRActionPerformed(evt);
            }
        });

        jButton1_Submit.setText("Submit");
        jButton1_Submit.setActionCommand("");
        jButton1_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SubmitActionPerformed(evt);
            }
        });

        jButton2_Cancel.setText("Cancel");
        jButton2_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_CancelActionPerformed(evt);
            }
        });

        buttonGroup2_AddEmp.add(jRadioButton1_FTE);
        jRadioButton1_FTE.setText("Full Time Employee");
        jRadioButton1_FTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_FTEActionPerformed(evt);
            }
        });

        buttonGroup2_AddEmp.add(jRadioButton2_PTE);
        jRadioButton2_PTE.setText("Part Time Employee");
        jRadioButton2_PTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_PTEActionPerformed(evt);
            }
        });

        jLabel7.setText("Annual Salary:");
        jLabel7.setEnabled(false);

        jFormattedTextField1_AS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField1_AS.setEnabled(false);
        jFormattedTextField1_AS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1_ASActionPerformed(evt);
            }
        });

        jLabel8.setText("Hourly Wage:");
        jLabel8.setEnabled(false);

        jFormattedTextField2_HW.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField2_HW.setEnabled(false);
        jFormattedTextField2_HW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2_HWActionPerformed(evt);
            }
        });

        jLabel9.setText("Hours Per Week:");
        jLabel9.setEnabled(false);

        jLabel10.setText("Weeks Per Year:");
        jLabel10.setEnabled(false);

        jFormattedTextField2_HpW.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField2_HpW.setEnabled(false);
        jFormattedTextField2_HpW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2_HpWActionPerformed(evt);
            }
        });

        jFormattedTextField2_WY.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField2_WY.setEnabled(false);
        jFormattedTextField2_WY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2_WYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1_EmpNum))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1_Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2_First, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3_Last))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2_WorkL, 0, 1, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2_DR, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1_Submit)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField1_AS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton1_FTE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField2_HW)
                                    .addComponent(jFormattedTextField2_HpW)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2_PTE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField2_WY)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1_EmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_First, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_Last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2_WorkL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField2_DR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_FTE)
                    .addComponent(jRadioButton2_PTE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField1_AS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextField2_HW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextField2_HpW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField2_WY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Submit)
                    .addComponent(jButton2_Cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FirstActionPerformed

    private void jTextField3_LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_LastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_LastActionPerformed

    private void jFormattedTextField1_EmpNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1_EmpNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1_EmpNumActionPerformed

    private void jFormattedTextField2_DRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2_DRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2_DRActionPerformed

    private void jButton1_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SubmitActionPerformed
        // TODO add your handling coe here:
        int empNum = Integer.parseInt(this.jFormattedTextField1_EmpNum.getText());
        EmployeeInfo existanceCheck = mainHT.getFromTable(empNum);
        if (existanceCheck != null) {
            JOptionPane.showMessageDialog(null, "Employee with that number already exists!");
        }else{
            String firstName = this.jTextField2_First.getText();
            String lastName = this.jTextField3_Last.getText();
            String genderS = this.jComboBox1_Gender.getSelectedItem().toString();
            int gender;
            switch (genderS){
                case "Male":
                    gender = 0;
                    break;
                case "Female":
                    gender = 1;
                    break;
                default:
                    gender = 2;
                    break;
            }           
            String workLS = this.jComboBox2_WorkL.getSelectedItem().toString();
            int workL;
            switch (workLS){
                case "Ottawa":
                    workL = 1;
                    break;
                case "Chicago":
                    workL = 2;
                    break;
                default:
                    workL = 3;
                    break;
            }
            double deducRate = Double.parseDouble(this.jFormattedTextField2_DR.getText());
            if (this.jRadioButton1_FTE.isSelected()){
                double annualSalary = Double.parseDouble(this.jFormattedTextField1_AS.getText());

                FTE newFTE = new FTE(empNum, firstName, lastName, gender, workL, deducRate, annualSalary);
                this.mainHT.addToTable(newFTE);
                Object[] fteRow = {empNum, firstName, lastName, genderS, 
                    workLS, deducRate, annualSalary, annualSalary, newFTE.calcAnnualNetIncome()};
                this.mainFTETableModel.addRow(fteRow);


                this.setVisible(false);
                this.dispose();
            }
            if (this.jRadioButton2_PTE.isSelected()){
               double hourlyWage = Double.parseDouble(this.jFormattedTextField2_HW.getText());
               double hoursPerWeek = Double.parseDouble(this.jFormattedTextField2_HpW.getText());
               double weeksPerYear = Double.parseDouble(this.jFormattedTextField2_WY.getText());

               PTE newPTE = new PTE(empNum, firstName, lastName, gender, workL, deducRate, 
                   hourlyWage, hoursPerWeek, weeksPerYear);
               this.mainHT.addToTable(newPTE);
               Object[] pteRow = {empNum, firstName, lastName, genderS, workLS, deducRate, 
                   hourlyWage, hoursPerWeek, weeksPerYear, 
                   hourlyWage*hoursPerWeek*weeksPerYear, newPTE.calcAnnualNetIncome()};
               this.mainPTETableModel.addRow(pteRow);


               this.setVisible(false);
               this.dispose();
            }
        }
        
    }//GEN-LAST:event_jButton1_SubmitActionPerformed

    private void jRadioButton1_FTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_FTEActionPerformed
        // TODO add your handling code here:
        this.jLabel7.setEnabled(true);
        this.jFormattedTextField1_AS.setEnabled(true);
        this.jLabel8.setEnabled(false);
        this.jLabel9.setEnabled(false);
        this.jLabel10.setEnabled(false);
        this.jFormattedTextField2_HW.setEnabled(false);
        this.jFormattedTextField2_HpW.setEnabled(false);
        this.jFormattedTextField2_WY.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1_FTEActionPerformed

    private void jFormattedTextField1_ASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1_ASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1_ASActionPerformed

    private void jFormattedTextField2_HWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2_HWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2_HWActionPerformed

    private void jFormattedTextField2_HpWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2_HpWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2_HpWActionPerformed

    private void jFormattedTextField2_WYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2_WYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2_WYActionPerformed

    private void jRadioButton2_PTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_PTEActionPerformed
        // TODO add your handling code here:
        this.jLabel7.setEnabled(false);
        this.jFormattedTextField1_AS.setEnabled(false);
        this.jLabel8.setEnabled(true);
        this.jLabel9.setEnabled(true);
        this.jLabel10.setEnabled(true);
        this.jFormattedTextField2_HW.setEnabled(true);
        this.jFormattedTextField2_HpW.setEnabled(true);
        this.jFormattedTextField2_WY.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2_PTEActionPerformed

    private void jButton2_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2_CancelActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeJFrame().setVisible(true);
            }
        });
    }
    
    public void setEmpNum(int empNum){
        this.jFormattedTextField1_EmpNum.setValue(empNum);
    }
    
    public void setFirstName(String firstName){
        this.jTextField2_First.setText(firstName);
    }
    
    public void setLastName(String lastName){
        this.jTextField3_Last.setText(lastName);
    }
    
    public void setGender(String genderS){
        this.jComboBox1_Gender.setSelectedItem(genderS);
    }
    
    public void setWorkLocation(String workL){
        this.jComboBox2_WorkL.setSelectedItem(workL);
    }
    
    public void setDeductionsRate(double deducRate){
        this.jFormattedTextField2_DR.setValue(deducRate);
    }
    
    public void selectFTERadio(){
        this.buttonGroup2_AddEmp.setSelected(this.jRadioButton1_FTE.getModel(), true);
        this.jLabel7.setEnabled(true);
        this.jFormattedTextField1_AS.setEnabled(true);
        this.jLabel8.setEnabled(false);
        this.jLabel9.setEnabled(false);
        this.jLabel10.setEnabled(false);
        this.jFormattedTextField2_HW.setEnabled(false);
        this.jFormattedTextField2_HpW.setEnabled(false);
        this.jFormattedTextField2_WY.setEnabled(false);
        
    }
    
    public void selectPTERadio(){
        this.buttonGroup2_AddEmp.setSelected(this.jRadioButton2_PTE.getModel(), true);
        this.jLabel7.setEnabled(false);
        this.jFormattedTextField1_AS.setEnabled(false);
        this.jLabel8.setEnabled(true);
        this.jLabel9.setEnabled(true);
        this.jLabel10.setEnabled(true);
        this.jFormattedTextField2_HW.setEnabled(true);
        this.jFormattedTextField2_HpW.setEnabled(true);
        this.jFormattedTextField2_WY.setEnabled(true);
    }
    
    public void setAnnualSalary(double annualSalary){
        this.jFormattedTextField1_AS.setValue(annualSalary);
    }
    
    public void setHourlyWage(double hourlyWage){
        this.jFormattedTextField2_HW.setValue(hourlyWage);
    }
    
    public void setHoursPerWeek(double hoursPerWeek){
        this.jFormattedTextField2_HpW.setValue(hoursPerWeek);
    }
    
    public void setWeeksPerYear(double weeksPerYear){
        this.jFormattedTextField2_WY.setValue(weeksPerYear);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2_AddEmp;
    private javax.swing.JButton jButton1_Submit;
    private javax.swing.JButton jButton2_Cancel;
    private javax.swing.JComboBox<String> jComboBox1_Gender;
    private javax.swing.JComboBox<String> jComboBox2_WorkL;
    private javax.swing.JFormattedTextField jFormattedTextField1_AS;
    private javax.swing.JFormattedTextField jFormattedTextField1_EmpNum;
    private javax.swing.JFormattedTextField jFormattedTextField2_DR;
    private javax.swing.JFormattedTextField jFormattedTextField2_HW;
    private javax.swing.JFormattedTextField jFormattedTextField2_HpW;
    private javax.swing.JFormattedTextField jFormattedTextField2_WY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1_FTE;
    private javax.swing.JRadioButton jRadioButton2_PTE;
    private javax.swing.JTextField jTextField2_First;
    private javax.swing.JTextField jTextField3_Last;
    // End of variables declaration//GEN-END:variables
}
