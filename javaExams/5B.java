import java.util.Scanner;
public class MyClass {
    static int fibo(int n){
            if(n==1 || n==0) return n;
            return fibo(n-1)+ fibo(n-2);
        }
   
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range n");
       int n=sc.nextInt();
       for(int i=1; i<=n; i++)
       {
           System.out.print(fibo(i) +" "); 
           
       }


    }
}
