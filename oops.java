class OOPS{
    //data members
    String name;
    int roll;
    int marks;
    
    //static keyword ----class property
    static int count;
    
    //this keyword---using this keyword u can call a constructor from a differnet constructor
    
    //default constructor
    public OOPS(){
        count++;
        System.out.println("Default constructor created");
    }
    
    //paramterised constructor <this> keyword
    public OOPS(int m,int rol){
        this();
        marks=m;
        roll=rol;
    }
    //parameterised constructor
    public OOPS(String nam,int rol,int m){
        count++;
        System.out.println("Parameteried constructor");
        name=nam;
        roll=rol;
        marks=m;
        
    }
    
    //methods---functions
    void play(int n){
        System.out.println(name+ " is playing Cricket with "+n+" runs");
    }
    //polymorphism---compile time polymorphism
    void play(){
        System.out.println("No play,only watching football ");
    }
    void eat(){
        System.out.println(name+" with roll "+roll+" is having biryani ");
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
    
     void display_this(){
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
    
    
}

//inheritance ---parent's property shifted to child's property
//<super> keyword access parent's property

//class childclassName extends parentclassName
class childClass extends OOPS{

    public childClass(){
        System.out.println("Default constructor childClass created");
    }
    
     public childClass(String name,int roll,int marks){
        super(name,roll,marks);
        System.out.println("Parameterised constructor childClass created");
    }
    
}
    
//encapsulation---a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
//access modifier: public,private,protected

class Mobile{
    private int price; //private access
    
    //public access: battery,name
    int battery;
    String name;
    
    //setter function to access private data members
    public void setPrice(int price){
         
        //if private data member accesed to  admin only
        boolean isAdmin=true;
        if(isAdmin){
            this.price=price;
        }
        else System.out.println("You are not the admin");
        
    }
    
    //getter function 
    public int getPrice(){
        return price; 
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Battery: "+battery);
        System.out.println("price: "+getPrice());
    }

}

//abstraction--- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//<abstract> keyword 
//child class 1: Ducati,parent: Bike
class Ducati extends Bike{
    @Override
    void speedKm(){
        System.out.println("Ducati >>>> Ktm");
    }
}

//child class2 Ktm, parent : Bike
class KTM extends Bike{
    @Override
    void speedKm(){
        System.out.println("KTM >>>> Ducati");
    }
}

//parent class: Bike
abstract class Bike{
    int price;
    abstract void speedKm();
}

public class MyClass {
    public static void main(String args[]) {
        
      //object1 created
      OOPS ob1=new OOPS();
      ob1.name="Sourik";
      ob1.roll=30;
      System.out.println(ob1.name+" "+ob1.roll);
      ob1.play(99);
    
      //object2 created
      OOPS ob2=new OOPS();
      ob2.name="Ayan";
      ob2.roll=55;
      ob2.eat();
      
      //object3 created using parametried constructor
      OOPS ob3=new OOPS("Sourav",69,99);
      ob3.display();
      
      OOPS ob4=new OOPS(98,42);
      ob4.display_this();
      
      System.out.println("number of objects: "+OOPS.count);
      childClass abc=new childClass("Subhransu",72,100);
      abc.display();
      
      
      System.out.println("\n");
      Mobile m1=new Mobile();
      
      m1.setPrice(100);//setter function
      m1.name="Apple";
      m1.battery=2300;
      m1.display();
      System.out.println("\n");
      
      //Bike b1=new Bike();
      //b1.speedKm();
      Ducati d1=new Ducati();
      d1.speedKm();
      KTM k1=new KTM();
      k1.speedKm();
      
      
    }
}
