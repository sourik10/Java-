// Questions - 16a ; 41a ; 65a 

class MyRunnable implements Runnable{
	MyRunnable(){
		super();
		System.out.println("Start - message ");
	}
	
	public void run(){
		for(int i = 1; i<= 3; i++){
			System.out.println(Thread.currentThread().getName());
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){}
		}
	}
}
public class Abc{
	public static void main(String [] args){
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
	}
}
