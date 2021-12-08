//error
package pOne;
class P{
    int x=10;
    public void pm(){
        System.out.println("Parent class method");
    }
}

package pTwo;
import pOne.*; 
public class C extends P{
    int y=20;
    public void cm(){
        super.pm();
        System.out.println("Child class method");
    }
    //System.out.println(super.x);
     public static void main(String args[]) {
     C abc=new C();
     abc.cm();
    }
}
