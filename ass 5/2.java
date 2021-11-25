//Create a class which contains an inner class. 
//Show that inner class can use member of outer class directly, 
//but Outer class can use member of Inner class only through its object. Check the name of class file, you created.
class Outside{
    public void m1(){
            System.out.println("Outside method ");
        }
    class Inside{
         
    public Outside getter(){
        return Outside.this;
    }
        public void m2(){
            System.out.println("Inside method ");
        }
    }
    
}
public class MyClass {
    public static void main(String args[]) {
    
    Outside out=new Outside(); //Outer class object
    Outside.Inside in=out.new Inside(); //Inner class object
    in.m2();
    
   // in.gettter.m1();
    
    }
}
