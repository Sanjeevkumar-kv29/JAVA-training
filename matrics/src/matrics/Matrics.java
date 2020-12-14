/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrics;

/**
 *
 * @author sanjeev
 */
import java.util.Scanner;
public class Matrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner s = new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner s2= new Scanner(System.in);
        
        int a,b;
        System.out.println("Enter no. of rows and coloum");
        a=s.nextInt();
        b=s1.nextInt();
        System.out.println("the rows you enter="+a);
        System.out.println("the coloum you enter="+b);
        
        int c[][]=new int[a][b];
         
        System.out.println("enter the element of matrics");
       for(int i=0;i<a;i++)
       {
         for(int j=0;j<b;j++)
         {
             c[i][j]= s2.nextInt();
         }
         
       }
         for(int i=0;i<a;i++)
         {
             for(int j=0;j<b;j++)
             {
                 System.out.print(c[i][j]);
                 System.out.print(" ");
             }
             System.out.println("");
         }
           
         
       }
       

        
        
        
        
        
        
        
    }
    


