//Mobile- superclass
class Mobile{
    int weight=10;
    public void getParent(){
        System.out.println("Parent Class-Mobile");
    }
}
//extends keyword to inherit superclass from subclass
//Apple- subclass
class Apple extends Mobile{
    int weight=15;
    int price=99;
    //method overriding
    public void getParent(){
        System.out.println("child class-apple");
    }
}
public class MyClass {
    public static void main(String args[]) {
     Mobile m=new Mobile();
     m.getParent();
     System.out.println(m.weight);
     
     Apple a=new Apple();
     a.getParent();
     System.out.println(a.price);
    }
}
