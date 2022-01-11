class driver{
  void m1(){ 
    System.out.println("i am king");
  }
}

public class test{
  public static void main(String[] args){
   driver d=null;
   try{ 
    d.m1();
   }
  catch(NullPointerException npe){
   System.out.println("refernce variable is not instantiated");
  }
 }
}
