interface Shape{
    double area();
    double perimeter();
}

class Rectangle implements Shape{
    double length;
    double breadth;
    
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}

class Circle implements Shape{
    double radius;
    double pi=3.14;
    
    Circle(double radius){
        this.radius=radius;
    }
    
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return (2*pi*radius);
    }
}

public class MyClass {
    public static void main(String args[]) {
     Rectangle r=new Rectangle(10,20);
     System.out.println("Rectangle: ");
     System.out.println("Area "+r.area()+" Perimeter "+r.perimeter());
     
     Circle c=new Circle(10);
      System.out.println("circle: ");
     System.out.println("Area "+c.area()+" Perimeter "+c.perimeter());
     
    }
}
