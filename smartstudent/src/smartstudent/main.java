/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartstudent;

/**
 *
 * @author sanjeev
 */
public class main {
    
   
    public static void main(String[] args) {
        
        
   student_splash sp = new student_splash();
   
   sp.setVisible(true);
   
   sp.load.setVisible(false);
   
   

   
        try {
            
            for(int i=0;i<=100;i++)
            {
             
                if(i>=10&i<85)
                sp.load.setVisible(true);
                
                else
                  sp.load.setVisible(false);
                
                Thread.sleep(65);
                
                
                
            }
            
            sp.setVisible(false);
            
           new smart_student_login().setVisible(true);
            
            
            
            
        } catch (Exception e) {
        }
   
     
        
        
        
        
    }
   
    
    
    
}
