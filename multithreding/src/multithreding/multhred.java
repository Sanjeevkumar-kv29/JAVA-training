
package multithreding;

import java.util.logging.Level;
import java.util.logging.Logger;



public class multhred extends Thread{
    
   
 
    public void run()
    {
        try {
             
        for(int i=0;i<=10;i++)
        {
            System.out.println("a");
            Thread.sleep(2000);
        }
        } catch (Exception e) {   
            
            System.out.println(""+e);
        }
    }
    

   public void example()
   {
       try {
           for(int i=0;i<=10;i++)
       {
           System.out.println("b");
               Thread.sleep(2000);
       }} 
           catch (Exception e) {
       }
   }
   
    public static void main(String[] args) {
        
        multhred t= new multhred();
        
        t.start();
        
        t.example();
    }
    
    
    
    
    
    
    
    
    
    
    
}
