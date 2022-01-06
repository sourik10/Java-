public class MyClass {
    public static void main(String args[]) {
      try{ 
         int[] arr=new int[-10];
      }
     catch(NegativeArraySizeException n){
         System.out.println(n);
     }
    }
}
