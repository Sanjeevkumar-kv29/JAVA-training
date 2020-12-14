/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author sanjeev
 */
public class vector {
    
    public static void main(String[] args) {
        Enumeration e;
        
        Vector vect = new Vector();
        int i;
      for(i=0;i<=5;i++)
      {
          vect.addElement(i);
      }
         
        int size=vect.size();
        int prop1=vect.lastIndexOf(5);
        boolean prop2=vect.add(5);
      
         boolean prop4=vect.removeAll(vect);
        
        System.out.println(size);
        System.out.println(prop1);
        System.out.println(prop2);
       
        System.out.println(prop4);
        
        
    }
    
    
    
    
}
