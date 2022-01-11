import java.util.*;
import java.lang.*;

public class sumOfSeries{
	public static void main(String[]args){
		double eve=0.0;
		double odd=0.0;
		double sum;
		System.out.println("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i%2==0){		
				eve = eve + 1/Math.pow(i,2);
			}else{
				odd = odd + 1/Math.pow(i,2);
			}
		}
		sum = odd - eve;
		System.out.println("sum of the seires :" + sum);
	}
}
