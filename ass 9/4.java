import java.util.Scanner;
class method{
    void m1(){
        System.out.println("m1 created under method class ");
    }
}
public class MyClass {
    public static void main(String args[]) {
      method abc=null;
     try{
        abc.m1();
     }
     catch(NullPointerException e){
        System.out.println(e);
     }
    }
}

//java.lang.NullPointerException: Cannot invoke "method.m1()" because "<local1>" is null
