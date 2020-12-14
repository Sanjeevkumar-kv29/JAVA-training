/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author sanjeev
 */

abstract class Sample{
    
    public void sum(int a,int b)
            
            
    {
        int c=a+b;
        System.out.println(c);
            
           
    
}abstract void print();
    {
        
    }
    
    
    
}

class test extends Sample{
    
    public void print(){
        System.out.println("hello");
    }
}



public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Sample s=new test();
         s.sum(10,20);
         s.print();
        
        
    }
    
}
    
