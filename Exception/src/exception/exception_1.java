package exception;


public class exception_1{
    
    
    
    public static void main(String[] args) {
        int a;
        
        try {
            a=25/0;
        System.out.println(a);
        System.out.println("hello");
        a=10+20;
        System.out.println(a);
        } catch (Exception e) {
            
            System.out.println(" "+e);
        }
        
        
          
    }
}
