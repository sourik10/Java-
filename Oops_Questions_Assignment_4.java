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
------------------------------------------------------
    // Create a class EMP having instance variable name and id. 
// Create its subclass (say Scientist) which has instance variable no_of_publication and 
// experience. 
// Now create its subclass, say Dscientist which has instance variable award. 
// Put a method: public String toString () { } in every class where you 
// describe about the class and from main create object of each class and print each object.

class EMP {
  String name;
  int id;
  EMP(String name,int id){
    this.name = name;
    this.id = id;
  }
  public String toString(){
    return name + " "+ id;
  }
}

class Scientist extends EMP{
  int no_of_publication;
  double experience;
  Scientist(String name,int id,int no_of_publication,double experience){
    super(name,id);
    this.no_of_publication = no_of_publication;
    this.experience = experience;
  }
  public String toString(){
    return name + " "+ id+" "+ no_of_publication+" "+experience;
  }
}

class Dscientist extends Scientist{
  String award;
  Dscientist(String name,int id,int no_of_publication,double experience,String award){
    super(name,id,no_of_publication,experience);
    this.award = award;
  }
  public String toString(){
    return name + " "+ id+" "+ no_of_publication+" "+experience+" "+award;
  }
}


//Create a class with a method void show () 
// and make 3 subclasses of it and all subclasses have void show () 
abstract class Shape{
    abstract void method(); //abstract method 
    public void run(){ int x = 10 ; System.out.println(x);}  //non-abstract method
}
class Rectangle extends Shape{
    void method(){System.out.println("Rectangle method called");}
}
public class Main {
  public static void main(String[] args) {
   Rectangle rc = new Rectangle();
   rc.method();
   rc.run();
  }
}

//interface :An interface in Java is a blueprint of a class. It has static constants and abstract methods.
// The interface in Java is a mechanism to achieve abstraction. 
// There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

// class - class -> extends 
// interface - class -> implements
// interface - interface -> extends

interface printable{  
void print();  
}  
class A6 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
 }  
}  
----------------------------------------------------------------------------------------

interface Bank{  
float rateOfInterest();   //non abstract method only
}

class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  
}  

class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  

public class Main{  
  public static void main(String[] args){  
  Bank b=new SBI();  
  System.out.println("ROI: "+b.rateOfInterest());  
  }
}
----------------------------------------------------------------------------------------
//Multiple inheritance in Java by interface
// If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

interface inter1{
  abstract void m1();
}
interface inter2{
  abstract void m2();
}
class multiple implements inter1,inter2{
    public void m1(){
      int x = 10;
      System.out.println(x);
    }
    public void m2(){
      int y = 20;
      System.out.println(y);
    }
}

public class Main{  
  public static void main(String[] args){  
    multiple object = new multiple();
    object.m1();
    object.m2();
  }
}




