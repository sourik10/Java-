//Method-Overloading in JAVA
class Test{
    static void m1(){
        System.out.println("M1-No parameter");
    }
    static void m1(int a){
        System.out.println("M1-Integer parameter");
    }
    static void m1(double a){
        System.out.println("M1-Double parameter");
    }
    static void m1(int a,double b){
        System.out.println("M1-Int,Double Parameter");
    }
    static void m1(double a,int b){
        System.out.println("M1-Int,Double Parameter");
    }
    
}
public class MyClass {
    public static void main(String args[]) {
      Test t=new Test();
      t.m1();
      t.m1(5);
      t.m1(6.5);
     // t.m1(10,20.98);
      
      t.m1('m'); //Automatic Promotion in  Overloading
    }
}
