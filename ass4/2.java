abstract class Parent{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
class Child extends Parent{
    void m1(){
        System.out.println("m1-method");
    }
    void m2(){
        System.out.println("m2-method");
    }
/*
    void m3(){
        System.out.println("m3-method");
    }
 */
  
}
 public class driver{
    public static void main(String args[]) {
        Child c=new Child();
        c.m1();
        
        // Parent p=new Child();
         //p.m1();
    }
}


/*
day4_2.java:6: error: Child is not abstract and does not override abstract method m3() in Parent
class Child extends Parent{
^
1 error
*/
