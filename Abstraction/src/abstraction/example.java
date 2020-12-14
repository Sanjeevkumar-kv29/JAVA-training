/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import java.util.Scanner;

/**
 *
 * @author sanjeev
 */


abstract class sample{
    
    abstract void arearect();
    abstract void areacirc();
}

class samp extends sample{

public void arearect(){
    
float a,b;


    System.out.println("to find area enter side");
    System.out.println("enter lenth");
    Scanner s1 =new Scanner(System.in);
    a=s1.nextInt();
    System.out.println("enter bridth");
    Scanner s2 =new Scanner(System.in);
    b=s2.nextInt();
    
    float c= a*b;

    System.out.println(c);
  
}
public void areacirc(){
    
    float r;
    System.out.println("enter the radious of circle");
    Scanner s1 =new Scanner(System.in);
    r=s1.nextInt();
    float a=(float) ((float)r*r*3.14);
    System.out.println(a);
    
    
}


}
 






public class example {
    
    public static void main(String[] args) {
        
        
        
        
        System.out.println("1)for area of rectangle \n 2)for area of circle");
        System.out.println("enter your choice");
        
       
         Scanner s1 =new Scanner(System.in);
         int a=s1.nextInt();
         
        if(a==1){
         sample s= new samp();
        s.arearect();
        }
        if(a==2)
        {
             sample s= new samp();
             s.areacirc();
        }
        
    }
    
    
}
