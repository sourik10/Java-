//OOPS Revision
//class & objects
//single level inheritance in Java
//method overriding
//final (variable/method/class)
//this,super keyword
//order of execution(static , nonstatic , constructor)
//collection framework (list/stack/map)
//runtime polymorphism
//https://www.javatpoint.com/runtime-polymorphism-in-java
//instanceof operator, downcasting
//abstraction (Abstract class & interface)
//Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
//inheritance of interfaces
//https://www.javatpoint.com/difference-between-abstract-class-and-interface


class Bike{
    Bike(){
        System.out.println("bikeConstructor");
    }
    void func1(){
        System.out.println("func1 called");
    }
    final void speed(){ //final method()
        System.out.println("MaxSpeed");
        }
}
class Honda extends Bike{
    Honda(){}
    void func1(){
        System.out.println("method overriding");
        }
    void func2(){
        System.out.println("func2 called");
    }
    //  void speed(){
    //    System.out.println("MinSpeed");
    //}
}
class FinalClass{
    final int x=10;
    //java:24: error: cannot assign a value to final variable x=20;
    //id methodFinal(){
      //x=20;
    //
}

class Student{
    int roll;
    String name;
    Student(){
        System.out.println("default constructor");
    }
    //parameterisedConstrutor
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    
    void funcStudent(){
        System.out.println(roll+" "+name);
    }
}
class Random{
    static int x=10;
    public static int f1(){
        x=15;
        return x; 
    }
}

//order of execution(static/nonstatic/constructor)
//1.static ; 2.nonstatic ; 3.constrcutor
class Parent{
    static{   //static method - compile time polymrphism 
        System.out.println("parentClass static block");
    }
    
    {   //nonStatic block
        System.out.println("parentClass non-staticBlock");
    }
    Parent(){
        System.out.println("parentClass constructor");
    }
}
class Child extends Parent{
    static{
        System.out.println("childClass static block");
    }
    
    {   //nonStatic block
        System.out.println("childClass non-staticBlock");
    }
    Child(){
        //super();
        System.out.println("childClass constructor");
    }
}
//runTime PolyMorphism(dynamic method dispacthing) - superclass reference variable refers to subclass(childclass) object
// superclassname obj = new subclassname()
class Teacher{
    void study(){
        System.out.println("teacher is best");
    }
}
class Stud extends Teacher{
    void study(){
        System.out.println("student is best");
    }
}

abstract class Animal{ //superclass
    abstract void running();
}
class Dog extends Animal{ //dog subclass
    void running(){
        System.out.println("Dog is running");
    }
}

abstract class Polygon{
    abstract void drawing();
}
class Square extends Polygon{
    void drawing(){
        System.out.println("Square");
    }
}
class Rectangle extends Polygon{
    void drawing(){
        System.out.println("rectangle");
    }
}

//interface to achieve abstraction
interface Print{
    void printing();
}
//inheritance of interfaces
interface Game extends Print{ 
    void gaming();
}
class Computer implements Print,Game{
    public void printing(){
        System.out.println("A4 PAGE");
    }
    public void gaming(){
        System.out.println("FIFA");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Honda h1=new Honda();
        h1.func1();
        h1.func2();
       // h1.speed();
        
        FinalClass f1=new FinalClass();
        //f1.methodFinal();
        
        Student s2=new Student();
        Student s1=new Student(3,"neymar");
        s1.funcStudent();
        System.out.println(Random.x); //static variable
        System.out.println(" "+Random.f1()); //static method()
        
        //Parent p1=new Parent();
       // new Parent();
        // new Child();
       // Child c1=new Child();
       System.out.println(" ");
      Teacher t1=new Stud(); //upcasting
      t1.study();
      
      Stud s007=new Stud();
      System.out.println(s007 instanceof Stud);
      System.out.println(s007 instanceof Teacher);
      
      //Stud s11=new Teacher();//downcasting
     // Stud s11=(Stud)new Teacher();//downcasting with typeconversion
      //java.lang.ClassCastException
      //System.out.println(s11 instanceof Teacher);
      
      Stud s10=null;
     // System.out.println(s10 instanceof Stud);
      //System.out.println(s10 instanceof Teacher);
      
      Animal abc=new Dog(); //upcasting
      abc.running();
      
      
      //abstraction using absrract class
     // Animal def=new Animal();
      //def.running();
     //error: Animal is abstract; cannot be instantiated
     
     Polygon poly=new Square();
     poly.drawing();
     Polygon polly=new Rectangle();
     polly.drawing();
     
     //interface
     Computer cc=new Computer();
     cc.printing();
     cc.gaming();
     
     
       
        
        
    }
}


/*
//Collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Stack;
//The Java collections framework provides a set of interfaces and classes toimplement various data structures and algorithms.
class CollectionFramework {
    public static void main(String[] args) {
        
        //arrayList
        ArrayList<Integer>ar=new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(12);
        ar.add(5);
        System.out.println(ar);
        System.out.println(" ");
        Collections.sort(ar);
        System.out.println(ar+" ");
        
        //List Interface -->arraylist class
        List<Integer>list=new ArrayList<Integer>();
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(list);
        System.out.println("size: "+ list.size()); 
        list.add(1,100);
        System.out.println(list);
        System.out.println(list.get(2));
        int rem=list.remove(3);
        System.out.println("removed element: "+rem);
        System.out.println("list :"+list);
        List<Integer>list2=new ArrayList<Integer>();
        list2.add(8);
        list2.add(0,9); 
        
        System.out.println(list2);
        list.removeAll(list2); 
        System.out.println("updated list "+list);
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(100));
        list.clear();
        System.out.println(list.isEmpty());
        
        //vector in collection framework
        Vector<String>v=new Vector<>();
        v.add("Ayan");
        v.add("messi");
        v.add("sourik");
        v.add("souvik");
        System.out.println(v.get(3));
        Iterator<String>it=v.iterator(); //iterator 
       while(it.hasNext()) {
            System.out.print(it.next());
            System.out.print(", ");
        }
        
        //stack interface
        Stack<Integer>st=new Stack<Integer>();
        st.push(10);
        st.push(11);
        st.push(12);
        boolean check=st.empty();
        System.out.println(st);
        System.out.println(check);
        
        
        //deque interface
        ArrayDeque<String>dq=new ArrayDeque<>();
        dq.add("a");
        dq.addLast("b");
        dq.addFirst("123");
        dq.addLast("c");
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        
        //map interface
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"TT");
        mp.put(2,"DD");
        mp.put(3,"KK");
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        
        
        
    }
}
*/
