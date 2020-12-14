/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanjeev
 */
public class mainstater {
    
    
    public static void main(String[] args) {
        
       
         stater s=new stater();
            s.setVisible(true);
         s.jLabel4.setVisible(false);
            
        try {
            
            for(int  i=0;i<=100;i++)
            {
                               
                Thread.sleep(60);
                if(i>15&&i<85)
                {
                    s.jLabel4.setVisible(true);
                    
                }
                else{
                    s.jLabel4.setVisible(false);
                }
                
            }
            s.setVisible(false);
             Main pa =new Main();
            pa.setVisible(true);
          
                
        } catch (Exception e) {
        }
           
            
           
            
        }
    }

