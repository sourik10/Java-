import java.util.Scanner;
class cylinder{
    
    //data members
   public float r,h;
   public cylinder(){
        //default constructor
    }
    //methods 
    double circum(){
        return 2*3.14*r;
    }
    double surface(){
        return (2*3.14*r*r) + (2*3.14*r*h);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      cylinder c=new cylinder();
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      c.r=a;
      c.h=b;
      System.out.println("circumference "+c.circum());
      System.out.println("surface area "+c.surface());
    }
}
