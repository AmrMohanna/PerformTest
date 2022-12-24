/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.time.Instant;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.InvoiceHeader;

/**
 *
 * @author Amr Mehanna
 */
public class AddInvoiceView extends JDialog {
   public AddInvoiceView(InvoiveMainView invMain){
       initComponents();
       
        okAddInvoice.addActionListener(invMain.getContrroller());
       cancelAddInoice.addActionListener(invMain.getContrroller());
   // }

    /**
     * Creates new form AddInvoiceView
     */
   }
    
  
    @SuppressWarnings("unchecked")
      
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tInvoiceDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        okAddInvoice = new javax.swing.JButton();
        tCustomerName = new javax.swing.JTextField();
        cancelAddInoice = new javax.swing.JButton();

        jLabel1.setText("Invoice Date");

        tInvoiceDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tInvoiceDateActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer Name");

        okAddInvoice.setText("OK");
        okAddInvoice.setActionCommand("okInvoice");
        okAddInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAddInvoiceActionPerformed(evt);
            }
        });

        tCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCustomerNameActionPerformed(evt);
            }
        });

        cancelAddInoice.setText("Cancel");
        cancelAddInoice.setActionCommand("cancelAddInvoice");
        cancelAddInoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddInoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(okAddInvoice))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelAddInoice)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tInvoiceDate)
                        .addComponent(tCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okAddInvoice)
                    .addComponent(cancelAddInoice))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void tInvoiceDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tInvoiceDateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tInvoiceDateActionPerformed

    private void okAddInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAddInvoiceActionPerformed
     
    }//GEN-LAST:event_okAddInvoiceActionPerformed

    private void cancelAddInoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddInoiceActionPerformed
        // TODO add your handling code here:
               // this.setVisible(false);

    }//GEN-LAST:event_cancelAddInoiceActionPerformed

    private void tCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCustomerNameActionPerformed
     public static void AddRowToJTable(Object[] dataRow){
       
    } 
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelAddInoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton okAddInvoice;
    private javax.swing.JTextField tCustomerName;
    private javax.swing.JTextField tInvoiceDate;
    // End of variables declaration//GEN-END:variables

    public JTextField getCustomerName(){
        return tCustomerName;
    }
    public JTextField getinvoivedate(){
        return tInvoiceDate;
    }
   

}
