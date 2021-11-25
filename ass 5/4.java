interface Aclass{
   void inner();
}
class Parent implements Aclass{
    public void inner(){
        System.out.println("Parent-method");
    }
}
class Child extends Parent implements Aclass{
    public void inner(){
        System.out.println("Child-class");
    }
}

public class MyClass {
    public static void main(String args[]) {
        Child abc=new Child(){
            super.inner();
        }
       // abc.inner();
        
    }
}
