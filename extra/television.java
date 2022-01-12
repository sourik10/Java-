import java.lang.Math;
class Television
{
    String name;
    double size;
    String date;
    boolean color;
    
    void display(){
        System.out.println(name);
        System.out.println(size);
        System.out.println(date);
        System.out.println(color);
        
    }
}

public class OverloadDemo2
{
    public static void main(String args[ ])
    {   
        Television t=new Television();
        t.name="JAVA";
        t.size=99.99;
        t.date="20/2/22";
        t.color=true;
        
        t.display();
        
    }
}
