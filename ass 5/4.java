interface Interaf{
   void function();
}
class Parent{
    void inner(){
        System.out.println("Method");
    }
}
public class MyClass {
    public static void main(String args[]) {
    
        Parent p=new Parent(){
            void inner(){
                System.out.println("implemented-anonymous");
            }
        };
        p.inner();
        
        Interaf intf=new Interaf(){
            public void function(){
                System.out.println("Interface object");
            }
        };
        
        intf.function();
    }
}
