/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeev
 */
interface I1
{
    void sum(int i,int j);
    
}


interface I2
{
    void mult(int a,int b);
    
}


class C implements I1,I2{

    @Override
    public void sum(int i,int j) {
        
        int k=i+j;
        System.out.println(k);
        
    }   

    @Override
    public void mult(int a,int b) {
        int c=a*b;
        System.out.println(c);
    }
}
public class example1 {
    public static void main(String[] args) {
        I1 a=new C();
        I2 b=new C();
        
               a.sum(50, 99);
               b.mult(66,99);
                
                
                    
    }
    
}
