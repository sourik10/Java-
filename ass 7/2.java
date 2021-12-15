import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String: ");
      String s=sc.nextLine(); //takeInput String
      System.out.println("Enter a character array: ");
      char[] a = sc.next().toCharArray();

      //char[] ch=new char[5];//takeCharacter array
     // for(int i=0;i<5;i++){
       //   ch[i]=sc.next().charAt(0);
     // }
      System.out.print(s+a);
      
    }
}
