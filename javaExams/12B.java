//javac -d . filename.java

//package pkgTwo;
interface One{
    public void m1();
    public void m2();
    public void m3();
}

//import pkgOne.One;
class Two implements One{
public Two(){
	System.out.println("Two-Default constructor");
}
public void m1(){
System.out.println("m1-method");
}
public void m2(){
System.out.println("m2-method");
}
public void m3(){
System.out.println("m3-method");
}

}


//import pkgTwo.Two;
public class Xyz extends Two{
    public static void main(String[] args){
        Two obj=new Two();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
