/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.BitSet;

/**
 *
 * @author sanjeev
 */
public class bitsatDS {
    
    public static void main(String[] args) {
        BitSet bit1 =new BitSet();
        BitSet bit2 =new BitSet();
        
        for(int i=0;i<=6;i++)
        {
            if(i%2==0){
                bit1.set(i);
            }
            
            
            if(i%2!=0){
                bit2.set(i);
            }
        }
        
        System.out.println(bit1);
        System.out.println(bit2);
        
        
        bit2.flip(0,2);
        
        
        System.out.println(bit2);
        
        
    }
    
    
    
}
