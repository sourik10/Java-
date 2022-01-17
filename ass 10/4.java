class MyRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class MyClass {
    public static void main(String args[]) {
        Thread m1=new Thread(new MyRunnable());
        Thread m2=new Thread(new MyRunnable());
        Thread m3=new Thread(new MyRunnable());

        
        
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
