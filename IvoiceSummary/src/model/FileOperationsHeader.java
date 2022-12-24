/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Amr Mehanna
 */
public class FileOperationsHeader extends AbstractTableModel {
    
    private ArrayList<InvoiceHeader> invoiceLines;
    private String[] invoiceColumns ;
   
    
    
    public FileOperationsHeader(ArrayList<InvoiceHeader> invoiceLines){
        this.invoiceColumns=new String[]{"NO","Date","Customer","Total"};
        this.invoiceLines=invoiceLines;
        
   
}

    @Override
    public int getRowCount() {
        return invoiceLines.size();
    }

    @Override
    public int getColumnCount() {
        return invoiceColumns.length;
    }
     @Override
    public String getColumnName(int column) {
        return invoiceColumns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader invoiceHeader =invoiceLines.get(rowIndex);
        switch (columnIndex){
            case 0 : 
                return invoiceHeader.getInvoiceNumber();
            case 1 : 
                return invoiceHeader.getDate();
            case 2 : 
                return invoiceHeader.getCustomerName();    
            
            case 3 : 
                return invoiceHeader.getTotal();
             default:
                 return "";
            
        }
        
        
    }
}


