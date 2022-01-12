import java.lang.Math;
class AddAmount
{
    double amount=50;
    AddAmount(){
       
    }
    AddAmount(double a){
        amount=a+amount;
    }
    void display(){
        System.out.println("Final Amount "+amount);
    }
}

public class OverloadDemo2
{
    public static void main(String args[ ])
    {   
       AddAmount abc=new AddAmount();
       abc.display();
       AddAmount ab=new AddAmount(500);
       ab.display();
        
    }
}
