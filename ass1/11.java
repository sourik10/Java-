import java.util.Scanner;
public class MyClass {
    static int fibo(int n){
            if(n==1 || n==0) return n;
            return fibo(n-1)+ fibo(n-2);
        }
   
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(fibo(n));
    }
}
