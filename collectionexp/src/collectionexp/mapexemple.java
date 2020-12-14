/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexp;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sanjeev
 */
public class mapexemple {
    
    public static void main(String[] args) {
        
        
        HashMap hm = new HashMap();
        
        System.out.println("Enter number of student in class");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
         

        
        for(int i=0;i<n;i++)
        {
         Scanner s2 =new Scanner(System.in);
         Scanner s3 =new Scanner(System.in);
         
         System.out.println("enter roll no of student");  
          int rollno =s2.nextInt();
          System.out.println("enter name of student");  
          String name = s3.next();
          
         hm.put(rollno,name);
               
        }
        
        System.out.println(hm);
        
         System.out.println("1) DO YOU WANT TO REMOVE ANY VALUE  SELECT  \n2) DO YOU WANT TO Search THE VALUE YES/NO \n3) DO YOU WANT TO ADD MORE STUDENT ");
         
         Scanner x = new Scanner(System.in);
         int dis = x.nextInt();
         
         switch (dis)
         {
          case 1:
                
         Scanner s9 =new Scanner(System.in);
        
          System.out.println("enter roll no of student");  
          int rollnor =s9.nextInt();
          
          hm.remove(rollnor);
          
         System.out.println(hm);
          
         break;
             
        case 2:
            
        Scanner s8 = new Scanner(System.in);
            
            System.out.println(" 1) roll no name \n 2) name to roll no");
            int show = s8.nextInt();
            
            if(show==1)
            {      
                System.out.println("Enter roll no -");
             Scanner s5=new Scanner(System.in);
             int rno=s5.nextInt();
                
            System.out.println(hm.get(rno));
            }
            if(show==2)
            {
             
             System.out.println("Enter name");
             Scanner s5=new Scanner(System.in);
             String nam=s5.next();
             System.out.println(hm.containsValue(nam));
            }
            
            
        case 3:
             for(int i=0;i<n;i++)
        {
         Scanner s2 =new Scanner(System.in);
         Scanner s3 =new Scanner(System.in);
         
         System.out.println("enter roll no of student");  
          int rollno =s2.nextInt();
          System.out.println("enter name of student");  
          String name = s3.next();
          
         hm.put(rollno,name);
               
        }
            
         break;
         
       
         
          }
         
        
        
         
         
        
    }
    
   
    
        
    
    
    
}
