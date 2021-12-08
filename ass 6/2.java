public class MyClass {
     
    // Orderof execution --> Static > Non static >Constructor
    //static Block --> at the time of class Loading
    static{
        System.out.println("1st Static Block");
    }
   static{
        System.out.println("2nd Static Block");
    }
    static{
        System.out.println("3rd Static Block");
    }
    MyClass(){
        System.out.println("MyClass Constrcutor");
    }
    public static void main(String args[]) {
    // MyClass o=new MyClass();
    }
}
