class Test{
    //object class priority >>> parent class priority
    //exact match--->Highpriority 
     //object class = parent of every class
     
    void m1(String s){
        System.out.println("M1-String Version");
    }
     void m1(Object obj){
        System.out.println("M1-Object Version");        //String and Stringbuffer are in same child class 
    }
    void m1(StringBuffer obj){
        System.out.println("M1-Stringbuffer Version");
    }
}
public class MyClass {
    public static void main(String args[]) {
        Test t=new Test();
        t.m1("Sourik");
        t.m1(new Object());
        t.m1(new StringBuffer());
        
       // t.m1(null);
        
    }
}
