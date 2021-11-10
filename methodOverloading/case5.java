/*
    CompileTimePolymorphism/StaticPolymorphism
    ----->ReferenceType
*/

class Duke{}  //Duke-parent class
class Ducati extends Duke{} //Ducati- childClass
class Test{
    void m1(Duke dk){
        System.out.println("Duke");
    }
    void m1(Ducati dc){
        System.out.println("Ducati");
    }
}
public class MyClass{
    public static void main(String[] args){
        Test t=new Test();
        Duke a=new Duke();
        t.m1(a);
        
        Duke b=new Ducati();
        t.m1(b);
        
        Ducati c=new Ducati();
        t.m1(c);
    }
}
