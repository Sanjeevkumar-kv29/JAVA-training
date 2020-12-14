/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.overloading;

/**
 *
 * @author sanjeev
 */

class sampleoverload{
    
    public void sum(int a,int b)
    {
        int c=a+b;
        System.out.println(""+c);        
     }
    
    public void sum(double a,double b){ 
    
    float c=(float) (a+b);
    System.out.println(c);
    
    
        }

   


}









public class methodoverload {
    public static void main(String[] args) {
        
        sampleoverload s = new sampleoverload();
        s.sum(98,89);
        s.sum( 7.5,9.5);
        
        
    }
    
}
