package polymorphism.polymorphism.overloading;
import java.util.Scanner;
abstract class A {
    int a,b;
    public void input(){}
    public void add() {}
}
class FF extends A{

public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number = ");
    a = sc.nextInt();
    System.out.println("enter second number");
    b = sc.nextInt();
}
public void add(){
    input();
    System.out.println("sum ="+(a+b));
}
}
public class NewClass extends FF
{
    public static void main(String[] args){
        NewClass f = new NewClass();
        f.add();
    }   
}