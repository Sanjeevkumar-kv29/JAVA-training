/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author sanjeev
 */
public class hashsetexp {
    
    
    public static void main(String[] args) 
    {
        LinkedHashSet  hs= new LinkedHashSet();
         TreeSet ts =new TreeSet();
          HashSet  ahs= new HashSet();
         
        hs.add("sanjeev");
        hs.add("kumar");
        hs.add("suryawanshi");
        hs.add("jecian");
        hs.add("star");
        
        System.out.println(hs);
        
      
        
        ahs.add("sanjeev");
        ahs.add("kumar");
        ahs.add("suryawanshi");
        ahs.add("jecian");
        ahs.add("star");
        
        System.out.println(ahs);
        
       
        
         ts.add("sanjeev");
        ts.add("kumar");
        ts.add("suryawanshi");
        ts.add("jecian");
        ts.add("star");
        System.out.println(ts);
        
    }
    
    
    
}
