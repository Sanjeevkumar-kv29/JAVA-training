/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author sanjeev
 */
class failexcep extends Exception{
    
    public failexcep(String s){
        super(s);
        
    }
    
   
}

public class sample{
    
    public void marks (int p,int c,int m,int e,int h) throws failexcep
           
           
    {
        
        if ((p+c+m+e+h)>=165&&p>32&&c>32&&m>32&&e>32&&h>32)
        
            System.out.println("you are pass in all sub");
        
        else
            throw new failexcep("you are fail");
    }
            
    
    
    public static void main(String[] args)throws failexcep {
        
        sample samp =new sample();
        int a,b,c,d,e;
        
        System.out.println("enter your 5 sub marks");
        
        
        Scanner s1=new Scanner(System.in);
            a=s1.nextInt();
            
            
            
        samp.marks(100,95,92,91,80);
        
    }
    
}
