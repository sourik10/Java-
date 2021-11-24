interface Cycle{
    void speedUp(int increment);
    void brakeDown(int decrement);
}
class Hero implements Cycle{
    
    int speed=90;
    public void speedUp(int i){
        speed+=i;
    }
    public void brakeDown(int d){
        speed-=d;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Hero abc=new Hero();
      abc.speedUp(40);
       System.out.println(abc.speed);
       
      abc.brakeDown(20);
      System.out.println(abc.speed);
    }
}
