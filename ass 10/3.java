class Mythread extends Thread{
    public void run(){
        System.out.println(getName());
    }
}

public class MyClass {
    public static void main(String args[]) {
        Mythread m1=new Mythread();
        Mythread m2=new Mythread();
        Mythread m3=new Mythread();
        
        m1.setName("First");
        m2.setName("Second");
        m3.setName("Third");
        
        m2.setPriority(9);
        m1.setPriority(7);
        m3.setPriority(8);
        
        m1.start();
        m2.start();
        m3.start();
    }
}
