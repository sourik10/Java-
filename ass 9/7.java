class FirstExp extends RuntimeException{
    FirstExp(String s){
        super(s);
    }
}

class SecondExp extends RuntimeException{
    SecondExp(String s){
        super(s);
    }
}

class TwoMethods{
    
    public static void g(){
        throw new FirstExp("First exception");
    }
    
    
    public static void f(){
        try{
            g();
        }
        catch(FirstExp e){
            e.printStackTrace();
            throw new SecondExp("Second exception");
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
     TwoMethods.f();
    }
}
