class Mythread extends Thread{
    Mythread(){
        super();
        System.out.println("Mythread Constructor");
    }
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i+" "+ getName());
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Mythread my=new Mythread();
      my.start();
    }
}
