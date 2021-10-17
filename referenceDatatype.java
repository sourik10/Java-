class Refer{
    int a=20;
   void change(){
       a=30;
   }
}
public class MyClass {
    public static void main(String args[]) {
     int x=10;
     int y=x; //by value
     System.out.println("Before----");
     System.out.println(x);
     System.out.println(y);
     
     y=15;
     System.out.println("After----");
     System.out.println(x);
     System.out.println(y);
     
     Refer abc=new Refer();
     Refer pqr=abc; //by refercne 
      System.out.println("before");
      System.out.println(abc.a);
      pqr.change();
       System.out.println("after");
     System.out.println(abc.a);
     
        
    }
}
