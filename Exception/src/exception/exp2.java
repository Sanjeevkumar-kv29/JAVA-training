/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeev
 */
public class exp2 {
    
    public static void main(String[] args) {
        int a;
        try {
            a=25/0;
            System.out.println(a);
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
        System.out.println("hello");
        a=10+20;
        System.out.println(a);
    }
}
