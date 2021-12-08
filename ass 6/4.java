//error
package pkgOne;
interface Inter1{
    public void m1();
    public void m2();
    public void m3();
}

package pkgTwo;
import pkgOne.*;
class Xyz implements Inter1{
    public void m1(){
        System.out.println("m1-method()");
    }
    public void m2(){
        System.out.println("m2-method()");
    }
    public void m3(){
        System.out.println("m3-method()");
    }
}
public class MyClass {
    public static void main(String args[]) {
     Xyz b=new Xyz();
     b.m1();
    }
}
