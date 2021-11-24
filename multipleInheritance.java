interface P1{
  void method();
}
interface P2{
    void method();
}
interface C extends P1,P2{
}

class Example implements C{
     public void method(){
         System.out.println("Multiple inheritance --- By Interface");
     }
 }
public class MyClass {
    public static void main(String args[]) {
    Example x=new Example();
    x.method();
     
    }
}
