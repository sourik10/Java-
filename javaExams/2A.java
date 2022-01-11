import java.util.Scanner;
public class MyClass {
    
    static void countPrimes(int n) {
       // int ct=0;
       boolean[] prime=new boolean[n+1];
       for(int i=0;i<=n;i++){
            prime[i] = true;
       }
        prime[0]=false;
        prime[1]=true;
        
        for(int i=2;i<n;i++){
            if(prime[i]){
                //ct++;
                for(int j=2*i;j<=n;j=j+i){
                    prime[j]=false;
                }
            }
        }
        for(int i=1;i<=n;i++){
         if(prime[i]==true){
             System.out.println(i+" ");
         }
     }
       // return ct;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter range: ");
      int a=sc.nextInt();
      countPrimes(a);
    
    }
}
