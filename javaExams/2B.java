import java.util.*;

public class bank{
	String depositor;
 	int accountno;
 	String account;
 	int balance;

	bank(String s,int an,String a,int b){
		depositor=s;
    		accountno=an;
    		account=a;
    		balance=b;
  	}

  	void deposit(double depo){
    		balance+=depo;
  	}
  	void withdraw(double with){
    		if(balance>with)
     			balance-=with;
    		else
    			System.out.println("no balance");
  		}
  	void display(){
   		System.out.println(depositor);
   		System.out.println(balance);
  	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String cname=sc.nextLine();		
		System.out.println("Enter Account type as CA or SA:");
		String typeofaccount=sc.nextLine();
		System.out.println("Enter your account number:");
		int accountNumber=sc.nextInt();
     		bank bc=new bank(cname,accountNumber,typeofaccount,0);
		while(true){
				System.out.println("Account options:-");
				System.out.println("\n1.Deposit\n2.Balance\n3.Withdraw\n4.Exit\n");
				System.out.println("Enter your option: ");
				int n=sc.nextInt();
				switch(n){
					case 1:
						System.out.println("Enter the amount:-");
						double d=sc.nextDouble();
						bc.deposit(d);
						break;
					case 2:						
						bc.display();
						break;
					case 3:
						System.out.println("Enter the amount to withdraw:-");
						double d1=sc.nextDouble();						
						bc.withdraw(d1);
						break;
					case 4:						
						System.exit(0);
					default:
						System.out.println("Wrong choice");
				}
		}
	}
}
