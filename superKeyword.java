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
    //method overloading
    public void getParent(){
        System.out.println("child class-apple");
        super.getParent();  //super keyword to access parent class-methods and data members from child-class
    }
}
public class MyClass {
    public static void main(String args[]) {
     
     Apple a=new Apple();
     a.getParent();
     System.out.println(a.price);
    // System.out.println(super.weight);
    }
}
