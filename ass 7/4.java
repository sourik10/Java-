import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
     // System.out.println("Enter a String: ");
      String s= "University of Technology"; //takeInput String
     
    // String[] f=s.split(" ");
    // System.out.println(s.replace(" ","").length());
    //if(s.find("Tech"))
    
    if(s.contains("Tech")){
        System.out.println(s.indexOf("Tech"));
    }
    else{
        System.out.println("String not found");
    }
    }
}
