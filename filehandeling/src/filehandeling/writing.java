/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandeling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author sanjeev
 */
public class writing {
    
    public static void main(String[] args) throws IOException {
        
        
       FileReader fr = new FileReader("E:\\sanj.txt");
       int i;
     
       while((i=fr.read())!=-1)         
       System.out.println((char)i);
     
        fr.close();
    }
    
    
}
