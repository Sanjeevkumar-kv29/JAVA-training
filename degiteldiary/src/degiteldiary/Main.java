/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degiteldiary;

/**
 *
 * @author sanjeev
 */
public class Main {
    
    public static void main(String[] args) {
        
         jecsplash js = new jecsplash();
    
         js.setVisible(true);
         
         try {
             for(int i=0;i<100;i++)
             {
                 Thread.sleep(15);
                 
             }
             
          new Optionpage().setVisible(true);
       
         
           js.setVisible(false);
             
             
             
        }
         
        
         
         catch (Exception e) {
            
            
            
        }
    
        
    
        
   
         
         
    }
    
    
    
}
