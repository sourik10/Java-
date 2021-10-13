class Add{
    //data members
    int a,b;
   public Add(){
        //default constructor
    }
    
    //methods inside class
    int sum(){
        return a+b;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Add xy=new Add();  //object xy created inside add-class
      xy.a=10;
      xy.b=20;
      System.out.println(xy.sum());
    }
}
