public class MyClass {
    public static void main(String args[]) {
     try{
         //risky code
         int a=10;
         int b=0;
         System.out.println(a/b);
     }
     catch(ArithmeticException e){
         //exception handling code
         System.out.println(e);
     }
    }
}
