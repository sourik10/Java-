/*
static keyword------
class property
this static keyword can be accesed using class_name.variable_name
*/
class Test{
    static int id=100;
    Test(){
        id++;
        System.out.println(id);
        System.out.println("constructor called");
    }
    static{
        System.out.println("Static method");
    }
}

public class MyClass {
    public static void main(String args[]) {
     Test o1=new Test();
     Test o2=new Test();
     Test o3=new Test();
     
    }
}
