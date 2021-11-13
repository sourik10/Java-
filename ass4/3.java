import java. util. Scanner;

class Account{
    String custName;
    String accNumber;
    String typeAc;
    
    Account(String custName,String accNumber,String typeAc){
        this.custName=custName;
        this.accNumber=accNumber;
        this.typeAc=typeAc;
    }
}
class CurrAc extends Account{
    double currBalance=0;
    CurrAc(String custName,String accNumber,String typeAc){
        super(custName,accNumber,typeAc);
    }
    void deposit(double d){
        currBalance+=d;
        System.out.println("Amount deposited Rs."+d);
    }
    void balance(){
        System.out.println("Amount Balance is Rs."+currBalance);
    }
    void withdraw(double w){
        if(w>currBalance){
            System.out.println("Having insufficient balance");
            return;
        }
        else{
            System.out.println("Amount withdrawn RS. "+w);
            currBalance-=w;
            if(currBalance <1000 && currBalance>100){
                currBalance=currBalance-100;
                System.out.println("minimum balance must be >= Rs.1000");
            }
        }
    }
}
class SavingAc extends Account{
    double savingBalance=0;
    double rate=8; //percent
    
    SavingAc(String custName, String accNumber,String typeAc){
       super(custName,accNumber,typeAc);
    }
    void interest(int t){
        double x=(1+(rate/100));
        double y=Math.pow(x,t);
        savingBalance=savingBalance*y;
    }
    void deposit(double d,int t){
        savingBalance=savingBalance+d;
        System.out.println("Amount deposited Rs."+d);
        interest(t);
    }
    void balance(){
        System.out.println("Savings balance: "+savingBalance);
    }
    void withdrawl(double w){
        if(w>savingBalance){
            System.out.println("Sorry Insuficient balance");
            return;
        }
        else{
            System.out.println("Amount Deposited from a/c: "+w);
            savingBalance=savingBalance-w;
        }
    }
   
}
class driver{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer name");
        String cname=sc.nextLine();
        
        System.out.println("Enter account no");
        String acNumber=sc.nextLine();
        
        System.out.println("type of Account");
        System.out.println("CA FOR CURRENT AC && SA FOR SAVINGS ACCOUNT");
        String type=sc.nextLine();
        
        if(type.equals("SA")){
            SavingAc sa=new SavingAc(cname,acNumber,type);
            
            while(true){
                System.out.println("AC TYPE= SAVINGS ACCOUNT ");
                System.out.println("1.Deposit");
                System.out.println("2.Balance");
                System.out.println("3.Withdrawl");
                System.out.println("4.Exit");
                
                System.out.println("Enter ur option ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1: System.out.println("Enter deposit ammount value:");
                            double depo=sc.nextDouble();
                            System.out.println("Enter time ");
                            int t=sc.nextInt();
                            sa.deposit(depo,t);
                            break;
                            
                    case 2: sa.balance();
                            break;
                    case 3: System.out.println("Amount to withdraw: ");
                            double d=sc.nextDouble();
                            sa.withdrawl(d);
                            break;
                    //case 4: exit(0);
                }
            }
        }
        
        if(type.equals("CA")){
            CurrAc ca=new CurrAc(cname,acNumber,type);
            
            while(true){
                System.out.println("AC TYPE= CURRENT ACCOUNT ");
                System.out.println("1.Deposit");
                System.out.println("2.Balance");
                System.out.println("3.Withdrawl");
                System.out.println("4.Exit");
                
                System.out.println("Enter ur option ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1: System.out.println("Enter deposit ammount value:");
                            double depo=sc.nextDouble();
                            ca.deposit(depo);
                            break;
                            
                    case 2: ca.balance();
                            break;
                    case 3: System.out.println("Amount to withdraw: ");
                            double d=sc.nextDouble();
                            ca.withdraw(d);
                            break;
                    //case 4: exit(0);
                }
            }
        }
      
    }
}
