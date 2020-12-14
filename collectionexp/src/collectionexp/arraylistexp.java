/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author sanjeev
 */
public class arraylistexp {
    
    
    public static void main(String[] args) {
        
        ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        System.out.println("Enter the no of value you want to add");
        Scanner s1=new Scanner(System.in);
         Scanner s2=new Scanner(System.in);
          Scanner s4=new Scanner(System.in);
        int n = s1.nextInt();
        
        for(int j=0;j<n;j++)
        {
            
          String s=s2.next();
           al.add(s);
            
            
        }
        
        System.out.println(al);
        
        
        System.out.println("Enter value you want to add");
        
         Scanner s3=new Scanner(System.in);
        
        int m = s3.nextInt();
        
        for(int j=0;j<m;j++)
        {
            
            String S=s4.next();
            ll.add(S);
        
        }
        
        System.out.println(ll);
        
        
        
        
        
    }
    
    
    
    
}
