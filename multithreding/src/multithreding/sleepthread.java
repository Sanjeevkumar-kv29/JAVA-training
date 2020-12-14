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
public class sleepthread extends Thread{
    
    public void run()
    {
        int i;
        for( i=0;i<5;i++){
            
            try {
                Thread.sleep(200);
                
            } catch (Exception e) {
                
                System.out.println(e);
            }
            
            
        
        System.out.println(i);
        
        }
    }
    
    
    public static void main(String[] args) {
       sleepthread t=new sleepthread();
       sleepthread st=new sleepthread();
       
       t.start();
       st.start();
    
    
    }
    
    
}
