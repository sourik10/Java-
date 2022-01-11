//Questions 9a) 34a) 58a) 
class MyThread extends Thread{
	MyThread(){
		super();
		System.out.println("Start-up Message :");
	}
	
	public void run(){
		for(int i = 1; i<= 3; i++){
			System.out.println(getName());
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){}
		}
	}
}
public class Driver{
	public static void main(String [] args){
		MyThread t = new MyThread();
		t.start();
	}
}
