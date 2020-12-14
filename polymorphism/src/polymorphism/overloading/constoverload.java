/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.overloading;

/**
 *
 * @author sanjeev
 */class cons{
     
     public cons(int a, int b){
         
         int c = a+b;
         System.out.println(c);
     }
         
      public cons(double a,double b){
          
          double c = a+b;
      }
          
      public cons(String a, String b) {
          
          System.out.println(a.concat(b));
      }
          
      } 
     
     
     
     
     
            


public class constoverload {
    
    public static void main(String[] args) {
        cons c =new cons(12,15);
      
        
        cons s=new cons("sanjeev","kumar");
        
        
        cons i=new cons(4.5,5.6);
                
        
    }
    
}
