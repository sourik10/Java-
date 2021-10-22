/*
method hiding
---both child & parent class are "static"
---it is also called early binding
---static polymorphism
---method reservation based on reference type by compiler
*/
class P{ //parent class
    public static void method(){
        System.out.println("Parent");
    }
}
class C extends P{ //child class
    public static void method(){
        System.out.println("Child");
    }
}
    public class MyClass {
    public static void main(String args[]) {
      P a=new P();
      a.method();
      
      C b=new C();
      b.method();
      
      P c=new C();
      c.method();
    }
}
