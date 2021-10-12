import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.println((int)n);
        n=n*100;
        System.out.println((int)n);
    }
}
