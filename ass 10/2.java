class MyRunnable implements Runnable{
    
    MyRunnable(){
        super();
        System.out.println("Start-up message");
    }
    
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i+" "+ Thread.currentThread().getName());
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
        }
    }
}

public class MyClass {
    public static void main(String args[]) {
        
    // MyRunnable my=new MyRunnable();
      Thread my=new Thread(new MyRunnable());
      my.start();
    }
}
/*
MyClass.java:12: error: unreported exception InterruptedException; must be caught or declared to be thrown
            Thread.sleep(100);
                        ^
*/
