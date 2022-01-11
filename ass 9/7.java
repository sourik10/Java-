class Exception1 extends RuntimeException{
  Exception1(String s){
    super(s);
  }
}

class Exception2 extends RuntimeException{
  Exception2(String s){
    super(s);
  }
}

class test{
  static void g(){
    throw new Exception1("u created this exception first");
   }
   static void f(){
     try{
       g();
     }
    catch(Exception1 e1){
        e1.printStackTrace();
	throw new Exception2("u created this exception second");
     }
   }
 }

public class driver {
    public static void main(String[] args){
	test.f();
     }
 }
    
