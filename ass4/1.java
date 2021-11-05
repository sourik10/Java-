abstract class Bike{
    void maxSpeed(){
        System.out.println("BikeMethod");
    }
}
class Ktm extends Bike{
    
}
public class MyClass {
    public static void main(String args[]) {
    
     Bike b=new Ktm();
     b.maxSpeed();
     
      Ktm k=new Ktm();
      k.maxSpeed();
    }
}
