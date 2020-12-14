/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polmorphism.overriding;

import java.util.Scanner;

/**
 *
 * @author sanjeev
 */
class sample{
    
public void sum(int a,int b){
    int c=a+b;
}  
    
}   

class sumsample extends sample{
    
    public void sum(int a,int b)
    {
        int c=a*b;
        System.out.println(c);
       
    }
    }
    
    

public class methodoverriding {
    
    public static void main(String[] args) {
        int x,y;
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter 2 number to learn meathod overriding");
        
        System.out.println("\n\nEnter first no -");
        x=s1.nextInt();
        
        System.out.println("\n\nEnter the second no -");
        y=s1.nextInt();
        
        sumsample s = new sumsample();
         s.sum(x, y);
       
       
    }
}
