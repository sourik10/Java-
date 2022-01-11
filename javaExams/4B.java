import java.util.*;

public class sumOfSeries{
	public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
		double sum=1.0;
		System.out.println("Enter range n: ");
		int n = sc.nextInt();
		System.out.println("Enter val of x: ");
		int x = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			sum = sum + Math.pow(x,i);
		}
		System.out.println("sum of the seires :" + sum);
	}
}
