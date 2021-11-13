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
    double time;
    double rate=8; //percent
    SavingAc(String custName, String accNumber,String typeAc){
        this.custName=custName;
        this.accNumber=accNumber;
        this.typeAc=typeAc;
    }
    void deposit(double d){
        currBalance+=d;
        System.out.println("Amount deposited Rs."+d);
        interest(d);
    }
    void balance(){
        System.out.println("Savings ")
    }
   
   
}
public class driver{
    public static void main(String[] args){
        
    }
}
