 
package multithreding;


public class simple2 implements Runnable {
    
    public void run()
    {
        System.out.println("hello sanjeev ");
    }
    
    
    
    public static void main(String[] args) {
        simple2 s = new simple2();
        Thread t = new Thread(s);
        t.start();
        
    }
    
}
