//Overload the constructors for class Box for cube and cone and also display its volume.
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

