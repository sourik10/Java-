import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        int ar[]=new int[5];
        try{
            System.out.println(ar[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        String s="Sourik";
        try{
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
}
