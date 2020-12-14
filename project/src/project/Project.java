/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author sanjeev
 */
public class Project {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b = 0,i=2;
        
        System.out.println("enter a no.");
        Scanner s =  new Scanner(System.in);
        a=s.nextInt();
         
        while(a>i)
        {
        if(a%i==0)
         b=1;
        i++;
        }
         
        if(b==1)
            System.out.println("no is not prime");
        else    
            System.out.println("no is prime");
        
        
        
    }
    
}
