abstract class Parent{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
class Child extends Parent{
    void m1(){
        System.out.println("m1-method");
    }
    void m2(){
        System.out.println("m2-method");
    }
    
}
public class MyClass {
    public static void main(String args[]) {
        Child c=new Child();
        c.m1();
        
        // Parent p=new Child();
         //p.m1();
    }
}
