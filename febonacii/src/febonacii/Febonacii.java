/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febonacii;

/**
 *
 * @author sanjeev
 */
import java.util.Scanner;
public class Febonacii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int a,b=1,c=0,d,i;
     System.out.println("enter the no. of terms till print febonacii series");
    Scanner s= new Scanner(System.in);
    a=s.nextInt();
    
       for(i=0;i<=a;i++)
       {
           d=b+c;
           b=c;
           c=d;
           
           System.out.println(" "+d);
           
       }
        
    
    
    
    }
    
    
    
}
