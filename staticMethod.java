class Test{
   int normalvar=10;
   static int staticvar=20;
   public void normalMethod(){
       System.out.println("Normal Method");
   }
   public static void staticMethod(){
    //staticvar=21;
    System.out.println("Static method");
   }
}


public class MyClass {
    public static void main(String args[]) {
    Test.staticMethod();
     System.out.println(Test.staticvar);
     //Test.normalMethod(); non-static method or variable cant be refernced from a static context
     Test obj=new Test();
     System.out.println(obj.normalvar);
     System.out.println(obj.staticvar);
     
    }
}
