/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.FileOperationsHeader;
import model.InvoiceHeader;
import model.InvoiceLine;

/**
 *
 * @author Amr Mehanna
 */
public class InvoiveMainView extends javax.swing.JFrame {
    
    
    public InvoiveMainView(){
       // this.getContentPane();
        initComponents();
    }
    
    // component an lisnter 

 

    /**
     * Creates new form InvoiveMainView
     */
 
   
   @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHeader = new javax.swing.JTable();
        tableHeader.getSelectionModel().addListSelectionListener(controller);tableHeader.setModel(getHeader());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableline = new javax.swing.JTable();
        jInvoiceTotal = new javax.swing.JLabel();
        jInvoiceNum = new javax.swing.JLabel();
        jCustomerName = new javax.swing.JLabel();
        jInvoiceDate = new javax.swing.JLabel();
        createInvoiceBtn = new javax.swing.JButton();
        createInvoiceBtn.addActionListener(controller);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(controller);
        addlineBtn = new javax.swing.JButton();
        addlineBtn.addActionListener(controller);
        deteteLineBtn = new javax.swing.JButton();
        deteteLineBtn.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jLoadFile = new javax.swing.JMenuItem();
        jLoadFile.addActionListener(controller);
        jSaveFiles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "Date", "Customer", "Total"
            }
        ));
        jScrollPane1.setViewportView(tableHeader);

        jLabel1.setText("Invoice Num");

        jLabel2.setText("Invoice total");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Date");

        tableline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Name", "Price", "Count", "Total"
            }
        ));
        jScrollPane2.setViewportView(tableline);

        jInvoiceTotal.setText("-");

        jInvoiceNum.setText("-");

        jCustomerName.setText("-");

        jInvoiceDate.setText("-");

        createInvoiceBtn.setText("Create New Invoice");
        createInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceBtnActionPerformed(evt);
            }
        });

        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceBtnActionPerformed(evt);
            }
        });

        addlineBtn.setText("New Line");
        addlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlineBtnActionPerformed(evt);
            }
        });

        deteteLineBtn.setText("Detete Line");
        deteteLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteteLineBtnActionPerformed(evt);
            }
        });

        jMenu.setText("File");

        jLoadFile.setText("Load Files");
        jLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadFileActionPerformed(evt);
            }
        });
        jMenu.add(jLoadFile);

        jSaveFiles.setText("Save Data");
        jSaveFiles.addActionListener(controller);
        jSaveFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveFilesActionPerformed(evt);
            }
        });
        jMenu.add(jSaveFiles);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createInvoiceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteInvoiceBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(addlineBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deteteLineBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jInvoiceNum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInvoiceTotal)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInvoiceDate)
                            .addComponent(jCustomerName)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jInvoiceNum)
                            .addComponent(jCustomerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jInvoiceTotal)
                            .addComponent(jInvoiceDate))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvoiceBtn)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(addlineBtn)
                    .addComponent(deteteLineBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadFileActionPerformed
     
    }//GEN-LAST:event_jLoadFileActionPerformed

    private void addlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlineBtnActionPerformed
        // TODO add your handling code here:
      //new AddItemView(this).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_addlineBtnActionPerformed

    private void jSaveFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveFilesActionPerformed
     
    }//GEN-LAST:event_jSaveFilesActionPerformed

    private void deteteLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteteLineBtnActionPerformed
   // DefaultTableModel modelI=(DefaultTableModel)InvoiveMainView.tableline.getModel();

           // TOhandling code here:
    }//GEN-LAST:event_deteteLineBtnActionPerformed

    private void createInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_createInvoiceBtnActionPerformed

    private void deleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceBtnActionPerformed
      //  DefaultTableModel model=(DefaultTableModel)InvoiveMainView.tableHeader.getModel();
     //   model.removeRow(tableHeader.getSelectedRow());
       
    }//GEN-LAST:event_deleteInvoiceBtnActionPerformed
     
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
            java.util.logging.Logger.getLogger(InvoiveMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiveMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiveMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiveMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiveMainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addlineBtn;
    public javax.swing.JButton createInvoiceBtn;
    public javax.swing.JButton deleteInvoiceBtn;
    public javax.swing.JButton deteteLineBtn;
    public javax.swing.JLabel jCustomerName;
    public javax.swing.JLabel jInvoiceDate;
    public javax.swing.JLabel jInvoiceNum;
    public javax.swing.JLabel jInvoiceTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jLoadFile;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jSaveFiles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHeader;
    private javax.swing.JTable tableline;
    // End of variables declaration//GEN-END:variables

   
    private ArrayList<InvoiceHeader>invHeader;
    
    private Controller  controller = new Controller(this);
    private FileOperationsHeader fileHeader;
    
    public ArrayList<InvoiceHeader> getInoive(){
        if (invHeader==null)
            invHeader =new ArrayList<>();
        
        return invHeader;
        
    }
    public void setInvoive(ArrayList<InvoiceHeader>invoice){
        this.invHeader=invoice;
    }
    public FileOperationsHeader getHeader(){
        if (fileHeader == null){
            fileHeader=new FileOperationsHeader(getInoive());
            
        }
        return fileHeader;
    }
    
    public void setFileOperationsHeader(FileOperationsHeader invoiceheader){
        this.fileHeader=invoiceheader;
        
    }
    public JLabel getInvoivenumLab(){
        return jInvoiceNum;
    }
     public JLabel getInvoiceDateLab(){
        return jInvoiceDate;
    }
    public JLabel getCustomerNameLab(){
        return jCustomerName;
    }
    public Controller getContrroller (){
         return controller;
     }
     public JLabel getInvoiceTotalLab(){
        return jInvoiceTotal;
       
    }
     public JTable getHeaderTable(){
         return tableHeader;
     }
      public JTable getLinetTable(){
         return tableline;
     }
     
     
   public int getNextInvNumber(){
       int number=0;
       for (InvoiceHeader invHeader : getInoive()){
           if(invHeader.getInvoiceNumber()>number)
               number=invHeader.getInvoiceNumber();
           
       }
       return ++number;
       //tableHeader.setModel(getHeader());
   }
 




}
