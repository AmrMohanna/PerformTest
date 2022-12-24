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
public class FileOPerationLines extends AbstractTableModel{
    
    private String [] linesColumns;
    private ArrayList<InvoiceLine> invoiceLines;

    
    
    public FileOPerationLines(ArrayList<InvoiceLine> invoiceLines)
    {
        this.linesColumns = new String[]{"NO", "Name", "Price", "Count", "Total"};
        this.invoiceLines=invoiceLines;
     
    }
    public ArrayList<InvoiceLine> getLinesCount(){
        return invoiceLines;
    }
            
            

    @Override
    public int getRowCount() {
        return invoiceLines.size();
    }

    @Override
    public int getColumnCount() {
        return linesColumns.length;
    }
    public String getColumName(int column){
        return linesColumns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int colnIndex) {
        InvoiceLine invoiceLine =invoiceLines.get(rowIndex);
       switch (colnIndex)
       {
           case 0 :
               return invoiceLine.getInv().getInvoiceNumber();
               case 1 :
               return invoiceLine.getItemName();
               case 2 :
               return invoiceLine.getPrice();
               case 3 :
               return invoiceLine.getCountItem();
               case 4 :
               return invoiceLine.getTotal();
               default:
               return "";
               
       }
    }
    
    
}
