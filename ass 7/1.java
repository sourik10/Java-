import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String: ");
      String s=sc.nextLine(); //takeInput String
      
        //char[] ch=s.toCharArray();
      char[] ch=new char[s.length()];
      for(int i=0;i<s.length();i++){
          ch[i]=s.charAt(i);    //String to char[]
      }
      
      //print charArray[]
      for(char x:ch){
          System.out.print(x+",");
      }
    }
}
