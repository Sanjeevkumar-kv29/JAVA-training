
package abstraction;

import java.util.Scanner;



 abstract class perent
{

 abstract void input();

 abstract void sum();
 
 abstract void output();
 }     
        
class child extends perent{

        Scanner s1 = new Scanner(System.in);
       
       int a;
       int c;
       int b;
     
    @Override
    void input() {
        System.out.println("Enter two no. to add - \n\n");
       a= s1.nextInt();
        b= s1.nextInt();
    }

    @Override
    void sum() {
       c=a+b;
    }

    @Override
    void output() {
        System.out.println("sum of number is = " +c);
    }

      
    
    
}

public class abstractexampclg
{
    
    public static void main(String[] args) {
        perent p1 = new child();
        
        p1.input();
        p1.sum();
        p1.output();                                                                                                                                       
        
    }
}
