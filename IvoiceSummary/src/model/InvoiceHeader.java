
package model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int invoiceNumber;
    private String CustomerName;
    private String date;
    private ArrayList<InvoiceLine> items;

   /* public InvoiceHeader(int invoiceNumber, String CustomerName, Date date) {
        this.invoiceNumber = invoiceNumber;
        this.CustomerName = CustomerName;
        this.date = date;

    }InvoiceHeader
*/
    public double getTotal(ArrayList<InvoiceLine>listTotal){
        double total =0.0;
        for(InvoiceLine invD : listTotal)
            total +=invD.getTotal();
        return total;
    }


    public ArrayList<InvoiceLine> getItems() {
        return items;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invoiceNumber=" + invoiceNumber + ", CustomerName=" + CustomerName + ", date=" + date + '}';
    }
    

  
    }

