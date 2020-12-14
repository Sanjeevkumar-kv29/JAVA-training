/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeev
 */
interface X
{
    void student(int s);
    
}

interface Y extends X
{
    void maths(int math);
    
  }

interface Z extends X
{
    void physics(int physics);
}

class res implements Y,Z
{

   
    
    public void physics(int x) {
           
        System.out.println("your marks in physics is ="+x);
       
    }


    @Override
    public void maths(int math) {
        
        
       System.out.println("your marks in maths is ="+math);
       
    }

    @Override
    public void student(int s) {
       System.out.println("roll no of student is ="+s);
    }

   
    
}

public class example2 {
    
    public static void main(String[] args) {
        
        res r= new res();
        r.physics(98);
        r.maths(100);
        r.student(10012);
        
        
        
    }
}
