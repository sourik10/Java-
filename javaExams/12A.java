class Parent{
     
    // Orderof execution --> Static > Non static >Constructor
    //Non-static Block 
    {
        System.out.println("Parent-1  Block");
    }
    {
        System.out.println("Parent-2 Block");
    }
  
    Parent(){
        System.out.println("Parent Constrcutor");
    }
}
class Child extends Parent{
    {
        System.out.println("Child-1  Block");
    }
    {
        System.out.println("Child-2 Block");
    }
  
    Child(){
        System.out.println("Child Constrcutor");
    }
}
public class Driver{
public static void main(String args[]) {
    
     Child obj=new Child();
    }
}
