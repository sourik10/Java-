//abstraction -> abstract class + interface

//abstract class 
abstract class Bike{
    abstract void run();
}
class KTM extends Bike{
  void run(){System.out.println("run method called");}
}
public class Main {
  public static void main(String[] args) {
    KTM k1 = new KTM();
    k1.run();
  }
}

//interface :An interface in Java is a blueprint of a class. It has static constants and abstract methods.
// The interface in Java is a mechanism to achieve abstraction. 
// There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
