/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date7jun;

/**
 *
 * @author sanjeev
 */
import java.util.Scanner;
class Sanjeev{
    
    public void sanjeevk (int a)
    {
        int i;
     for(i=0;i<=a;i++)
     {
         for(int j=0;j<=i;j++)
         {
             System.out.print(" *");
         }
         System.out.println(" ");
     }
    }
    
}
/*
class some{
    
    
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
   
   while(int b<a)
    {
        b=b+a;
        System.out.println(""+b);
        
        b++;
    } 
    
    
    
} */
public class Date7jun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
      
        
        System.out.println("enter a number");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();      
                
        Sanjeev s2=new Sanjeev();
        s2.sanjeevk(a);
       
        
        
        
        
        
        
        
    }
    
}
