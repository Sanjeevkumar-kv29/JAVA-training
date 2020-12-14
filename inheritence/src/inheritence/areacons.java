/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

import java.util.Scanner;

/**
 *
 * @author sanjeev
 */


class circlea{
    
   float b,a;
   
    public circlea(float a)
    {
     
        
        b=22/7*a*a;
        System.out.println("area ="+b);
        
     this.a=a;
    }
    
}


class circleb extends circlea{
    float c;
    
public circleb(float c){
    super(c);
   

  c=2*a;

  System.out.println("diameter is"+c);
  this.c=c;
 
}
}

class circlec extends circleb{

public circlec(float d)
{
 
    super(d);
    
    d=(float)22/7*c;

    System.out.println("the circumeference is"+d);

  
}



}











public class areacons {
    
     public static void main(String[] args){
         
         System.out.println("enter the radious");
        Scanner s1=new Scanner(System.in);
        
          float a=s1.nextFloat();
      
         
          circlec c =new circlec((float) a);
         
         
         
     }   
    
    
    
}
