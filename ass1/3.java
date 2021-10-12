import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        System.out.println("f: "+f);
        float c=(f-32)*5/9;
        System.out.println("c: "+c);
    }
}
