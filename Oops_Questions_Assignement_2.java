//Add two numbers by taking input using Command Line Input, Scanner class
import java.util.Scanner ;
class Addition{
    public int a,b;
    Addition(){
        System.out.println("Add Object created");
    }
     public int sum(){
         return a+b;
     }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
      Addition obj = new Addition();
      obj.a = x ;
      obj.b = y;
      System.out.println(obj.sum());
    }
}

//Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input.
import java.util.Scanner;
class Cylinder {
    public double radius , height;
    Cylinder(){System.out.println("Cylinder object created");}
    
    public double areaCalculate(){
        return (3.14*radius*radius) + (3.14*radius*height); 
    }
    public double circumference(){
        return 6.28*radius*height;
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double h = sc.nextInt();
		Cylinder obj = new Cylinder();
		obj.radius = r;
		obj.height = h;
		System.out.println(obj.areaCalculate());
		System.out.println(obj.circumference());
	}
}

//Write a program to find Area and Volume of Cone Using Constructors - Keyboard Input or Command Line Input.
import java.util.Scanner;
class Cone {
    public double radius , height;
    Cone(){System.out.println("Cone object created");}
    
    public double areaCalculate(){
        return (3.14*radius*radius) + (3.14*radius*height); 
    }
    public double volume(){
        return 0.333 * 3.14* radius *radius *height;
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double h = sc.nextInt();
		Cone obj = new Cone();
		obj.radius = r;
		obj.height = h;
		System.out.println(obj.areaCalculate());
		System.out.println(obj.volume());
	}
}

//Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the instance variable and method from main.
import java.util.Scanner;
class First {
   int x = 10; 
   void show(){
       System.out.println(x);
   }
}

public class Main{
	public static void main(String[] args) {
	    First obj = new First();
	    obj.show();
	}
}

//Create a class, make method inside it and pass object as parameter of this method. (a. pass same class’s object, b) pass different class’s object)


