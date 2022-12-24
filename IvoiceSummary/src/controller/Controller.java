/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;



//import java.awt.List;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.FileOPerationLines;
import model.FileOperationsHeader;
import model.InvoiceHeader;
import model.InvoiceLine;
import view.AddInvoiceView;
import view.AddItemView;
import view.InvoiveMainView;



/**
 *
 * @author Amr Mehanna
 */
public class Controller implements ActionListener,ListSelectionListener{
    
   // AddInvoiceView AddInvoiceView =new  AddInvoiceView();
   // AddItemView AddItemView=new AddItemView(aThis);
    private InvoiveMainView mainview;
    private AddInvoiceView addinvoive;
    private AddItemView additem;
    
    public Controller(InvoiveMainView mainframe){
        this.mainview=mainframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action =e.getActionCommand();
        System.out.println("action = " +action);
        switch(action){
            case "Load Files":
                loadFromFile();
                break;
            case "Save Data":
                saveToFile();
                break;
            case "Create New Invoice":
                createInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "New Line":
                createLine();
                break;
            case "Detete Line":
                deleteLine();
                break;
            case "okInvoice":
                addInvoice();
                break;
            case "cancelAddInvoice":
                cancelAddInvoive();
                break;
            case "OK":
                addItem();
               
                break;
            case "Cancel":
                cancelAddItem();
                break;
        }
    
      
        }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectIndex =mainview.getHeaderTable().getSelectedRow();
        if(selectIndex!= -1){
           
            InvoiceHeader invoiceHeader =mainview.getInoive().get(selectIndex);
            mainview.getInvoivenumLab().setText(""+invoiceHeader.getInvoiceNumber());
            mainview.getInvoiceDateLab().setText(""+invoiceHeader.getDate());
            mainview.getCustomerNameLab().setText(""+invoiceHeader.getCustomerName());
            mainview.getInvoiceTotalLab().setText(""+invoiceHeader.getTotal());
            FileOPerationLines fileOPerationLines=new FileOPerationLines(invoiceHeader.getItems());
            mainview.getLinetTable().setModel(fileOPerationLines);
            fileOPerationLines.fireTableDataChanged();
        }
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void addInvoice(){
        String invoiveDate=addinvoive.getinvoivedate().getText();
        String customerName =addinvoive.getCustomerName().getText();
        int invNumber =mainview.getNextInvNumber();
        try{
            String [] dateLenght =invoiveDate.split("-");
            if(dateLenght.length<3){
                JOptionPane.showMessageDialog(mainview, "Enter valid date formate","Error",JOptionPane.ERROR_MESSAGE);
            }
            else {
                int day =Integer.parseInt(dateLenght[0]);
                int month =Integer.parseInt(dateLenght[1]);
                int year =Integer.parseInt(dateLenght[2]);
                if (day >31 || month>12){
                    JOptionPane.showMessageDialog(mainview, "Enter valid date formate","Error",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    InvoiceHeader invHeader =new InvoiceHeader(invNumber, invoiveDate, customerName);
                    mainview.getInoive().add(invHeader);
                    mainview.getHeader().fireTableDataChanged();
                    addinvoive.setVisible(false);
                    addinvoive.dispose();
                    addinvoive=null;
                
                }
            }
            
                    
        }
        catch (Exception exception ){
                 JOptionPane.showMessageDialog(mainview, "Enter valid date formate","Error",JOptionPane.ERROR_MESSAGE);

        }
        
    }
    private void cancelAddInvoive(){
         addinvoive.setVisible(false);
         addinvoive.dispose();
         addinvoive=null;
    }
    
    private void addItem(){
        String itemNames =additem.getTItemName().getText();
       
        double itemPrice =Double.parseDouble(additem.getTItemPrice().getText());
        int itemCount =Integer.parseInt(additem.getTItemCount().getText());
        int selectInvoice =mainview.getHeaderTable().getSelectedRow();
        if (selectInvoice !=-1){
            InvoiceHeader inHeader=mainview.getInoive().get(selectInvoice);
            InvoiceLine itemLine=new InvoiceLine(itemNames,itemPrice,itemCount,inHeader);
            inHeader.getItems().add(itemLine);
            FileOPerationLines lines=(FileOPerationLines) mainview.getLinetTable().getModel();
            lines.fireTableDataChanged();
            mainview.getHeader().fireTableDataChanged();
                      
        }
        
            additem.setVisible(false);
            additem.dispose();
            additem=null;
        
        
    
    }
    private void cancelAddItem(){
        additem.setVisible(false);
        additem.dispose();
        additem=null;
    }
    
    private void createInvoice(){
         addinvoive=new AddInvoiceView(mainview); //when use cont
        //addinvoive=new AddInvoiceView();
        addinvoive.setVisible(true);
        
}
    private void deleteInvoice() {
        int selectedRow = mainview.getHeaderTable().getSelectedRow();
        if (selectedRow != -1) {
            mainview.getInoive().remove(selectedRow);
            mainview.getHeader().fireTableDataChanged();
        }
    }
    private void createLine(){
        additem=new AddItemView(mainview);
        additem.setVisible(true);
        }
        
    private void deleteLine(){
        int selectRow = mainview.getLinetTable().getSelectedRow();
        if (selectRow != -1) {
            FileOPerationLines itemLine=(FileOPerationLines) mainview.getLinetTable().getModel();
            itemLine.getLinesCount().remove(selectRow);
            itemLine.fireTableDataChanged();
            mainview.getHeader().fireTableDataChanged();
        }
            
       } 
    
    
    
    
    

    
    private void loadFromFile(){
        JFileChooser file_select =new JFileChooser();
        try{
            int value =file_select.showOpenDialog(mainview);
            if (value==JFileChooser.APPROVE_OPTION){
                File invoiceFile=file_select.getSelectedFile();
                Path invoicePath =Paths.get(invoiceFile.getAbsolutePath());
               
                List <String> header_lines = Files.readAllLines(invoicePath);
                
                ArrayList<InvoiceHeader> headerArray=new ArrayList<>();
                for (String header_line : header_lines){
                    try {
                        String [] headerSplit=header_line.split(",");
                        
                       int invNumber=Integer.parseInt(headerSplit[0]);
                       String customName=headerSplit[2];
                       String invDate = headerSplit[1];
                       
                       InvoiceHeader invHeadre = new InvoiceHeader(invNumber,invDate,customName);
                       headerArray.add(invHeadre);
                    }
                    catch (Exception exception ){
                        exception.printStackTrace();
                        JOptionPane.showMessageDialog(mainview, "Fix Error Formate ","Error",JOptionPane.ERROR_MESSAGE);
                    
                    }
                }
               
                value =file_select.showOpenDialog(mainview);
                if(value==JFileChooser.APPROVE_OPTION){
                    File itemFile =file_select.getSelectedFile();
                    Path itemPath =Paths.get(itemFile.getAbsolutePath());
                    List <String> item_lines=Files.readAllLines(itemPath);
                    
                    
                    for (String item_line : item_lines){
                    try {
                        String [] itemSplit=item_line.split(",");
                        int invNumber=Integer.parseInt(itemSplit[0]);
                        String itemname=itemSplit[1];
                        int countNumber =Integer.parseInt(itemSplit[3]);
                        double itemPrice= Double.parseDouble(itemSplit[2]);
                        
                        InvoiceHeader inHeader=null;
                        for (InvoiceHeader invoiceHeader :headerArray){
                            if (invoiceHeader.getInvoiceNumber()==invNumber){
                                inHeader=invoiceHeader;
                            break;
                            }
                        }
                        InvoiceLine invoiceline=new InvoiceLine(itemname,itemPrice,countNumber,inHeader);
                        inHeader.getItems().add(invoiceline);
                        }
                        catch (Exception exception){
                        exception.printStackTrace();
                        JOptionPane.showMessageDialog(mainview, "line formate error","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                        
                    
                }
                    mainview.setInvoive(headerArray);
                    FileOperationsHeader invHeader=new FileOperationsHeader(headerArray);
                    mainview.setFileOperationsHeader(invHeader); 
                    mainview.getHeaderTable().setModel(invHeader);
                    mainview.getHeader().fireTableDataChanged();
            }
                     
                
            }
        catch(IOException exception){
            exception.printStackTrace();
            JOptionPane.showMessageDialog(mainview, "read file error ","Error",JOptionPane.ERROR_MESSAGE);

            
        }
        
        
    }
    
    private void saveToFile(){
        ArrayList<InvoiceHeader> invoiceHeaders=mainview.getInoive();
        String invoice="";
        String items="";
        for (InvoiceHeader invHceader :invoiceHeaders ){
            String headerFile=invHceader.getFromCSV();
            invoice +=headerFile;
            invoice+="\n";
            for(InvoiceLine invLine:invHceader.getItems()){
                String itemFile=invLine.getFromCSV();
                items+=itemFile;
                items+="\n";
            }
    }
   
    try{
        JFileChooser fileChose=new JFileChooser();
        int value =fileChose.showSaveDialog(mainview);
        if(value == JFileChooser.APPROVE_OPTION){
            File invoiveFile =fileChose.getSelectedFile();
            FileWriter invWriter= new FileWriter(invoiveFile);
            invWriter.write(invoice);
            invWriter.flush();
            invWriter.close();
            value=fileChose.showSaveDialog(mainview);
            if(value == JFileChooser.APPROVE_OPTION){
                File itemFile=fileChose.getSelectedFile();
                FileWriter itemWirter= new FileWriter(itemFile);
                itemWirter.write(items);
                itemWirter.flush();
                itemWirter.close();
            }
        }
    }
    catch(IOException exception){
        
     }
    }
   
}

    
    
