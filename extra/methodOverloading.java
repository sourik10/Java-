import java.lang.Math;
class Overload
{
     // volume of cube
    double volume (int x)                
    {
           return (x*x*x);
    }

     // area of cube
    double area(int a){
        return 6*a*a;
    }
    
    //volume of cone
    double volume(int r,int h){
        return 3.14*r*r*h;
    }
    
    //area of cone
    double area(int r,int h){
        double l=r*r + h*h;
        l=Math.sqrt(l);
        double ans=(3.14*r*r) + (3.14*r*l);
        return ans;
    }
}

public class OverloadDemo2
{
    public static void main(String args[ ])
    {   
        Overload v=new Overload();

        System.out.println("Volume of a cube = "+v.volume(10));
        System.out.println("Area of a cube= "+v.area(10));
        
        System.out.println("Volume of a cone = "+v.volume(10,20));
        System.out.println("Area of a cube= "+v.area(10,20));
        
    }
}
