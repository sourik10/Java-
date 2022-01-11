import java.util.Scanner;
class PayOutOfBoundsException extends RuntimeException{
    PayOutOfBoundsException(String s){
	super(s);
      }
 }

public class test{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the salary: ");
      int salary=sc.nextInt();
      if(salary>10000){
 	throw new PayOutOfBoundsException("monthly salary is overlimit");
       }
      System.out.println("Salary of Person is: "+salary);
    }
}
 
