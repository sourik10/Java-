abstract class MyClass {
   public void display() {
      System.out.println("Method of abstract class");
   }
}

public class AbstractClass extends MyClass{
   public static void main(String args[]) {
	//MyClass().display();
	
	AbstractClass ob = new AbstractClass();
	ob.display();
   }
}
