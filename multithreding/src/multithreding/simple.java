                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               /*
 * To change this license header, choose License Headers in Project Properties.                  
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreding;

/**
 *
 * @author sanjeev
 */
public class simple extends Thread{
    
    public void run(){
    
        System.out.println("hello sanjeev ");
 
} 
   
    
    
    public static void main(String[] args) {
        
        simple s1=new simple();
        s1.start();
        
    }
    
}

