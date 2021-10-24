//abstract keyword 
abstract class Bike{
    int price=100;
    abstract void speedCount();
}
class KTM extends Bike{
    void speedCount(){
        System.out.println("KTM");
    }
}

//final keyword
class Mobile{
    final int price=80;
   public final void method(){
        System.out.println("FinalKeyword");
    }
}
class Apple extends Mobile{
    /* can't override as method in superclass declared as final
    public void method(){
        System.out.println("FinalKeyword Overridden");
    }
    */
    final int price=99;
}
public class MyClass {
    public static void main(String args[]) {
        
      //no object can be created for abstract classes
      //Bike b=new Bike(); 
      
      KTM k=new KTM();
      k.speedCount();
      System.out.println("price: "+k.price);
      
      Apple a=new Apple();
      a.method();
     // a.price=101;  -->wrong can't assign value
      System.out.println(a.price);
    }
}
