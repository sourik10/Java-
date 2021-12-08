class P{
   int i=10;
   //non-static block
   {
       m1();
       System.out.println("Parent class nonStatic block");
   }
   P(){
       System.out.println("Parent Constructor");
   }
   public static void main(String[] args){
       P p=new P();
       System.out.println("Parent class-Main Method");
   }
   void m1(){
       System.out.println(j);
   }
   int j=20;
}
class C extends P{
    //nonStatic Block
    {
        m2();
        System.out.println("ChildClass Non-static Block");
    }
    C(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args){
        C c=new C();
        System.out.println("Child class main method");
    }
    void m2(){
        System.out.println(y);
    }
    {
                System.out.println("Child class Nonstatic Block");
    }
    int y=200;
}
