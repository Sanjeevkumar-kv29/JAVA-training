/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digil;

/**
 *
 * @author sanjeev
 * 
 */
import java.util.Scanner;

public class Digil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int a,i=0;
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        
        while(a>0)
        {
            a=a/10;
            i++;
        }
        
        System.out.println("total digit is "+i);
        
    }
    
}
