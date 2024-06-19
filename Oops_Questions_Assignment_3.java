//Method overloading for class Box for cube and cone and also display its volume.
import java.util.Scanner;
class Box{
  
  // public int coneradius,coneHeight;
  // public int cubeSide;
  // Box(int r,int h){
  //   this.coneradius = r;
  //   this.coneHeight = h;
  // }
  // Box(int s){this.cubeSide = s;}
  
  public double volume(int coneradius,int coneHeight){
    return 0.333*coneradius*coneradius*coneHeight;
  }
  public int volume(int cubeSide){
    return cubeSide*cubeSide*cubeSide;
  }
}
public class Main{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int h = sc.nextInt();
    int s = sc.nextInt();
  
   Box obj = new Box();
   System.out.println("cone volume: "+ obj.volume(r,h));
   System.out.println("cube volume: "+ obj.volume(s));
   sc.close();
  }
}


//Contructor overloading for class Box for cube and cone and also display its volume.
class Box{
  public int height,radius,side;

  Box(int h,int r){
    this.height = h;
    this.radius = r;
  }
  Box(int s){
    this.side = s;
  }
  double volumeCube(){
    return side*side*side;
  }
  double volumeCone(){
    return 3.14*radius*radius*height;
  }

}
public class Main {
  public static void main(String[] args) {
      Box cube = new Box(10);
      System.out.println(cube.volumeCube());

      Box cone = new Box(5,6);
      System.out.println(cone.volumeCone());

  }
}

//Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable no_of_publication and experience. 
//Now create its subclass, say Dscientist which has instance variable award. 
//Put a method: public String toString () {} in every class where you describe about the class and from main create object of each class and print each object.
//EMP -> Scientist -> Dscientist 
// Create a class EMP having instance variable name and id. 
// Create its subclass (say Scientist) which has instance variable no_of_publication and 
// experience. 
// Now create its subclass, say Dscientist which has instance variable award. 
// Put a method: public String toString () { } in every class where you 
// describe about the class and from main create object of each class and print each object.

class EMP {
  String name;
  int id;
  EMP(String name,int id){
    this.name = name;
    this.id = id;
  }
  public String toString(){
    return name + " "+ id;
  }
}

class Scientist extends EMP{
  int no_of_publication;
  double experience;
  Scientist(String name,int id,int no_of_publication,double experience){
    super(name,id);
    this.no_of_publication = no_of_publication;
    this.experience = experience;
  }
  public String toString(){
    return name + " "+ id+" "+ no_of_publication+" "+experience;
  }
}

class Dscientist extends Scientist{
  String award;
  Dscientist(String name,int id,int no_of_publication,double experience,String award){
    super(name,id,no_of_publication,experience);
    this.award = award;
  }
  public String toString(){
    return name + " "+ id+" "+ no_of_publication+" "+experience+" "+award;
  }
}
public class Main {
  public static void main(String[] args) {
    EMP e1=new EMP("RAM",10);
       System.out.println(e1.toString());
       Scientist e2=new Scientist("Shyam",20,5,15);
       System.out.println(e2.toString());
       Dscientist e3=new Dscientist("Sourav",30,8,20,"BALLON D'OR");
       System.out.println(e3.toString());

  }
}


//Create a class with a method void show () 
// and make 3 subclasses of it and all subclasses have void show () method overridden and call those methods using their class references.\
class Root{
  public void show(){
    System.out.println("Root method called");
  }
}
class First extends Root{
  public void show(){
    System.out.println("First method called");
  }
}
public class Main {
  public static void main(String[] args) {
    Root r1 = new Root();
    r1.show();
    First f1 = new First();
    f1.show();
  }
}

//

