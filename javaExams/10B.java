import java.util.Scanner;
class circle{
    
    //data members
   public float r,h;
   public circle(){
        //default constructor
    }
    //methods 
    double circum(){
        return 2*3.14*r;
    }
    double surface(){
        return (3.14*r*r);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      circle c=new circle();
      float a=sc.nextFloat();
      
      c.r=a;
      //c.h=b;
      System.out.println("circumference "+c.circum());
      System.out.println("surface area "+c.surface());
    }
}
