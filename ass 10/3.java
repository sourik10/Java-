//Questions 46 b and 24b(almost)
class MyThread extends Thread{	
	public void run(){
		System.out.println(getName());		
	}
}
public class Driver{
	public static void main(String [] args){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.setName("Thread T1");
		t2.setName("Thread T2");
		t3.setName("Thread T3");
		
		t1.setPriority(3);
		t2.setPriority(4);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
