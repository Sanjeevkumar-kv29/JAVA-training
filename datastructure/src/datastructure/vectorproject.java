/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author sanjeev
 */
public class vectorproject { 
 
    
    public static void main(String[] args) {
        
        Vector vect = new Vector();
        
        System.out.println("select your choice \n 1) A \n 2) U \n 3) R \n 4) Q \n");
        
        int x;
        Scanner s =new Scanner(System.in);
        
        x=s.nextInt();
        
        while(x==1|x==2|x==3)
            
       {
            switch (x) {
                case 1:
                    System.out.println("enter the no of value you want to add ");
                    Scanner n =new Scanner(System.in);
                    Scanner s1=new Scanner(System.in);
                    int N=n.nextInt();
                    for(int j=0;j<N;j++)
                    {
                        String ad =s1.next();
                        
                        vect.add(ad);
                        
                    }           System.out.println(vect);
                    break;
                case 2:
                    System.out.println("enter the index and value to update value");
                    Scanner index=new Scanner(System.in);
                    Scanner value=new Scanner(System.in);
                    int ind =index.nextInt();
                    String val = value.next();
                    vect.add(ind,val);
                    System.out.println(vect);
                    break;
                case 3:
                    System.out.println("enter the endex no. to remove its value");
                    Scanner remove=new Scanner(System.in);
                    int rem =remove.nextInt();
                    System.out.println(vect.remove(rem));
                    break;
                
                case 4:
                    break;
            }
        
          System.out.println("select your choice \n 1) A \n 2) U \n 3) R \n 4) Q \n");
           x=s.nextInt();
       }
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    

