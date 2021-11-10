//Method-Overloading in JAVA
//var-arg
class Test{
    static void m1(int...i ){ 
        System.out.println("M1-No parameter");
    }
    static void m1(int a){
        System.out.println("M1-Integer parameter");
    }
   
}
public class MyClass {
    public static void main(String args[]) {
      Test t=new Test();
      t.m1();
      t.m1(20,49);
      t.m1(5);
      t.m1('m');
    }
}
