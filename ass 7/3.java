import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String: ");
      String s=sc.nextLine(); //takeInput String
     
    // String[] f=s.split(" ");
     System.out.println(s.replace(" ","").length());
      
    }
}
