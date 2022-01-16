import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       // int ar[];
        System.out.println("enter array size: ");
        int n=sc.nextInt();
        
     try{
         //risky code
        int ar[]=new int[n];
        System.out.println("array size of "+n+" is created ");
     }
     catch(NegativeArraySizeException e){  //exception handling code
         System.out.println(e);
     }
    
    }
}
