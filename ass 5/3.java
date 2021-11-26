interface Inter1{
    public void m1();
    public void m2();
}
interface Inter2{
    public void m1();
    public void m2();
}
interface Inter3 extends Inter1,Inter2{
    public void m3();
}
abstract class Parent implements Inter3{
    public void m1(){
        System.out.println("m1-method called");
    }
    public void m2(){
        System.out.println("m2-method called");
    }
}
class Child extends Parent implements Inter3{
    public void m3(){
        System.out.println("m3-method called");
    }
}
public class MyClass {
    public static void main(String args[]) {
        Child abc=new Child();
        abc.m1();
        abc.m2();
        abc.m3();
    
    }
}
