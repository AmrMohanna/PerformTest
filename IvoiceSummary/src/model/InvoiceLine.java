
package model;

public class InvoiceLine {
   private InvoiceHeader inv;
   private int countItem;
   private String itemName;
   private double price ;

   /* public InvoiceLine(InvoiceHeader inv, int countItem, String itemName, double price) {
        this.inv = inv;
        this.countItem = countItem;
        this.itemName = itemName;
        this.price = price;
    }*/
   public  InvoiceLine (){
       
   }
   public InvoiceLine(String itemName , double price ,int count  ,InvoiceHeader invHeader ){
       this.inv=invHeader;
       this.itemName=itemName;
       this.countItem=count;
       this.price=price;
       
   }

    public double getTotal(){
        return countItem*price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public int getCountItem() {
        return countItem;
    }

    public void setCountItem(int countItem) {
        this.countItem = countItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
     public String getFromCSV(){
        return inv.getInvoiceNumber()+","+countItem +","+itemName+","+price;
    }
    

    @Override
    public String toString() {
        return "InvoiceLine{" + "inv=" + inv.getInvoiceNumber() + ", countItem=" + countItem + ", itemName=" + itemName + ", price=" + price + '}';
    }
   
    
}
