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


class circleA{
    
   float b;
   int a;
    public void area(int x)
    {
        this.a=x;
        
        b=(float)22/7*a*a;
        System.out.println("area ="+b);
        
    
    }
    
}


class circleB extends circleA{
    
int c;
    
public void diameter(){
  c=(2*a);

  System.out.println("diameter is"+c);
  
 
}
}

class circleC extends circleB{

public void circumeferance()
{
 
 
float d=(float)22/7*c;

    System.out.println("the circumeference is"+d);

  
}



}











public class AREA {
    
     public static void main(String[] args){
         
         System.out.println("enter the radious");
        Scanner s1=new Scanner(System.in);
        
          int a=s1.nextInt();
      
         
          circleC c =new circleC();
          c.circumeferance();
          c.diameter();
          c.area(a);
         
         
         
     }   
    
    
    
}
