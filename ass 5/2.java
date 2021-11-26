//Create a class which contains an inner class. 
//Show that inner class can use member of outer class directly, 
//but Outer class can use member of Inner class only through its object. Check the name of class file, you created.

class Outside{
    public void m1(){
            System.out.println("Outside class method ");
        }
    class Inside{
        public void m2(){
            System.out.println("Inside class method ");
            m1();
        }
    }
    
}
public class MyClass {
    public static void main(String args[]) {
    
    new Outside().new Inside().m2();
    
    }
}
