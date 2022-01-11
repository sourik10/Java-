import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        String s="JAVA";
        try{
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
}
