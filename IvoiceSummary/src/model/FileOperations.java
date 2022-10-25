/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import view.InvoiveMainView;

/**
 *
 * @author Amr Mehanna
 */
public class FileOperations extends JFrame {
    public FileOperations(){
        //2methods
         //ArrayList<InvoiceHeader> readFile() 
         //and writeFile(ArrayList<InvoiceHeader>),
   /*
    }
     JFileChooser jLoad=new JFileChooser();
        if(jLoad.showOpenDialog(InvoiveMainView.this)== JFileChooser.APPROVE_OPTION){
            String path1 =jLoad.getSelectedFile().getPath();
            FileInputStream fileInputStream =null;
             private ArrayList<String[]> Rs = new ArrayList<>();
             private String[] OneRow;
             

               public ArrayList<String[]> ReadCSVfile(path1) {
                        try {

                BufferedReader bufferedReader =new BufferedReader(new FileReader(path1));
                
                while (brd.readLine() != null) {
                    String st = brd.readLine();
                    OneRow = st.split(",|\\s|;");
                    Rs.add(OneRow);
                    System.out.println(Arrays.toString(OneRow));
                } // end of while
            } // end of try
            catch (Exception e) {
                String errmsg = e.getMessage();
                System.out.println("File not found:" + errmsg);
            } // end of Catch
            return Rs;
               }
}
*/
}
}


