import java.lang.String;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      //uppercase-lowercase
      String s="Sourik";
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
      
      //trim method
      String a="   messi   ";
      System.out.println(a.trim());
      
      //boolean startswith && endswith
      String b="Sachin";    
    System.out.println(b.startsWith("Sa"));//true    
    System.out.println(b.endsWith("m"));//true   
    
    System.out.println(b.charAt(2));
    System.out.println(b.length());
    
    int c=20;
    System.out.println(String.valueOf(c));
    
    String ab="Messi-is-the-best-player-in-the-world";
    System.out.println(ab.replace("Messi","Ronaldo"));
    System.out.println(ab);
    
    }
}
