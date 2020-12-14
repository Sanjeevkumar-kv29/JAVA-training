import java.util.*;

class parent{

double radii;
Scanner s1 = new Scanner(System.in);

void get()
{

System.out.println("enter the radious of circle ");
 radii= s1.nextInt();
 

}


}

interface Inter{

double pi = 3.14;


}

class child extends parent  implements Inter
{
 
 void calculate()
 {
 
  get();

  double area;
  
  area=pi*radii*radii;
  
  System.out.println("area of circle is = "+area);
  
 
}


}




class interfacei{

public static void main(String kljhgj[])

{

child c = new child();

c.calculate();

}






}