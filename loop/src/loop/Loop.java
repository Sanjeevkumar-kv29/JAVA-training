/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author sanjeev
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here
        for (int i = 0; i<=5; i++)
        {
               
            for(int j=0;j<=5;j++)
            {
                if(i+j>=6)
                    System.out.print(" *");
                else
                    System.out.print(" ");
            }
            
            System.out.println("");
        }
}
}