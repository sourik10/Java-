import java.lang.Math;
class Programming
{
    
    Programming(){
       System.out.println("I love Porgramming Languages");
    }
    Programming(String j){
       System.out.println("I love "+j);
    }
    /*
    void display(){
        System.out.println("Final Amount "+amount);
    }
    */
    
}

public class OverloadDemo2
{
    public static void main(String args[ ])
    {   
       Programming p=new Programming();
       Programming pp=new Programming("JAVA");
        
    }
}
