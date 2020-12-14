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
public class loopthread implements Runnable {
    
    public void run()
    {
       
             for (int i=0;i<5;i++)
            System.out.print(i);
    }
    
    
    
    public static void main(String[] args) {
        loopthread s = new loopthread();
        loopthread s1 = new loopthread();
        Thread t = new Thread(s);
        Thread t1= new Thread(s1);
        t.start();
       t1.start();
        
    }
    
}
