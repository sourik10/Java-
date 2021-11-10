class Test{
    //object class priority >>> parent class priority
    //exact match--->Highpriority 
     //object class = parent of every class
     
    void m1(String s){
        System.out.println("M1-String Version");
    }
     void m1(Object obj){
        System.out.println("M1-Object Version");
    }
}
public class MyClass {
    public static void main(String args[]) {
        Test t=new Test();
        t.m1("Sourik");
        t.m1(new Object());
        t.m1(null);
        
    }
}
