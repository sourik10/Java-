public class MyClass {
     
    // Orderof execution --> Static > Non static >Constructor
    static{
        System.out.println("Static Block");
    }
    //Non-static Block 
    {
        System.out.println("Ordinary Block");
    }
  
    MyClass(){
        System.out.println("MyClass Constrcutor");
    }
    public static void main(String args[]) {
     MyClass o=new MyClass();
    }
}
