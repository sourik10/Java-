import java.util.*;
class Account{
	String cust_name;
	String acc_no;    
	String type_of_account;
	Account(String cust_name,String acc_no,String type_of_account){
		this.cust_name=cust_name;
		this.acc_no=acc_no;
		this.type_of_account=type_of_account;
    	}
}
class Current extends Account{
	double currBalance=0;
	Current(String cust_name,String acc_no,String type_of_account){
		super(cust_name,acc_no,type_of_account);	
	}
	void deposit(double d){
		currBalance+=d;
		System.out.println("Amount of rs."+d+"/=is deposited");
	}
	void balance(){
		System.out.println("Curretn balance:"+currBalance);	
	}
	void withdraw(double d){
		if(d>currBalance){
			System.out.println("Not having enough balance to withdraw");
			return;
		}else{
			System.out.println("Rs."+d+"/- is withdrawn from yout current account");
			currBalance-=d;
			if(currBalance<1000 && currBalance>100){
				currBalance-=100;
				System.out.println("Minimum balance must be >=1000");
			}
		}
	}
}
class savings extends Account{
	double savingsBalance=0;
	double t;
	double r=6/100;
	double n=2;
	savings(String cust_name,String acc_no,String type_of_account){
		super(cust_name,acc_no,type_of_account);	
	}
	void deposit(double d,double t){
		savingsBalance+=d;
		System.out.println("Amount of rs."+d+"/=is deposited");
		interest(t);
	}
	void interest(double t){
		double x=1+r/n;
		double y=Math.pow(x,n*t);
		savingsBalance=savingsBalance*y;
	}
	void balance(){
		System.out.println("Savings Balance:"+savingsBalance);	
	}
	void withdraw(double d){
		if(d>savingsBalance){
			System.out.println("Not having enough balance to withdraw");
			return;
		}else{
			System.out.println("Rs."+d+"/- is withdrawn from yout current account");
			savingsBalance-=d;			
		}
	}
}

class Bank{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String cname=sc.nextLine();
		
		System.out.println("Enter Account type as CA or SA:");
		String typeofaccount=sc.nextLine();

		System.out.println("Enter your account number:");
		String accountNumber=sc.nextLine();
		if(typeofaccount.equals("SA")){
			savings sa=new savings(cname,typeofaccount,accountNumber);
			while(true){
				System.out.println("Saving account options:-");
				System.out.println("\n1.Deposit\n2.Balance\n3.Withdraw\n4.Exit\n");
				System.out.println("Enter your option: ");
				int n=sc.nextInt();
				switch(n){
					case 1:
						System.out.println("Enter the amount:-");
						double d=sc.nextDouble();
						System.out.println("Enter the time period:-");
						double t=sc.nextDouble();
						sa.deposit(d,t);
						break;
					case 2:						
						sa.balance();
						break;
					case 3:
						System.out.println("Enter the amount to withdraw:-");
						double d1=sc.nextDouble();						
						sa.withdraw(d1);
						break;
					case 4:						
						System.exit(0);
					default:
						System.out.println("Wrong choice");
				}
			}			

		}
		if(typeofaccount.equals("CA")){
			Current ca=new Current(cname,typeofaccount,accountNumber);
			while(true){
				System.out.println("Current account options:-");
				System.out.println("\n1.Deposit\n2.Balance\n3.Withdraw\n4.Exit\n");
				System.out.println("Enter your option: ");
				int n=sc.nextInt();
				switch(n){
					case 1:
						System.out.println("Enter the amount:-");
						double d=sc.nextDouble();
						ca.deposit(d);
						break;
					case 2:						
						ca.balance();
						break;
					case 3:
						System.out.println("Enter the amount to withdraw:-");
						double d1=sc.nextDouble();						
						ca.withdraw(d1);
						break;
					case 4:						
						System.exit(0);
					default:
						System.out.println("Wrong choice");
				}
			}
		}
	}
}

