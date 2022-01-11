import java.util.*;
class Test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int arr[];
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        
        try{
            arr = new int[n];
            System.out.println("It's Alright!");
        }
        catch(NegativeArraySizeException nase){
            System.out.println("Array Size can't be -ve");
        }
    }
}
