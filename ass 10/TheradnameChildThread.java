class ThreadName extends Thread{
    public void run(){
        System.out.println("Name of child thread: "); //extending ThreadClass 
        System.out.println(Thread.currentThread().getName()); //getting ChildThreadName Thread-0
    }
}
public class MyClass {
    public static void main(String args[]) {
      ThreadName t=new ThreadName();
      System.out.println("Name of main thread is");  
	  System.out.println(Thread.currentThread().getName());
	  
	  t.start();
    }
}
