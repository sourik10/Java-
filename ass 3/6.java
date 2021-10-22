class Parent{
   void show(){
       System.out.println("ParentClass method called");
   }
}
class First extends Parent{
    void show(){
        System.out.println("FirstClass method called");
    }
}
class Second extends Parent{
    void show(){
        System.out.println("SecondClass method called");
    }
}
class Third extends Parent{
    void show(){
        System.out.println("ThirdClass method called");
    }
}

public class driver
{
   public static void main(String args[])
   {
       Parent s=new Parent();
       s.show();
       
       s=new First();
       s.show();
       s=new Second();
       s.show();
       s=new Third();
       s.show();
    }
}
