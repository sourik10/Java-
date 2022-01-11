class Base {
    Base() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Exception is thrown.");
    }
}

public class Derived extends Base {

   Derived() throws CloneNotSupportedException {
   super();

//    try { 
//      super(); 
//    } catch (CloneNotSupportedException e) {
//      System.out.println("We have indeed caught an exception from the "+
//           "base-class constructor!");
//    }

}

public static void main(String[] args) {
        try {
            Derived d = new Derived();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Catching exception");
        }
        catch(RuntimeException re){}
    }
}
