/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeev
 */


interface A 
{
    void string();
    void print ();
    
           
}

 class B implements A
{

    
    String name="sanjeev";
    
    public void string() {
        System.out.println("hello");
        
    }

    @Override
    public void print() {
        
        System.out.println(name);
    
    
    }
    
   
    
 }

public class simple{
    
    public static void main(String[] args) {
         A a=new B();
      a.print();
      a.string();
      
    }
    
    
    
    
    
    
   
}
 

