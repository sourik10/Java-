//package pOne;
class Parent{
	int x=10;
	void m1(){
	System.out.println("Parent method called");
	}
}

//import pOne.Parent;
//package pTwo;
class Child extends Parent{
	int y=20;
	void m2(){
	System.out.println("Child method called");
	}
}

public class Driver{
	public static void main(String[] args){
	Child abc=new Child();
	abc.m2();
	System.out.println(abc.y);
	
	//parent
	abc.m1();
	System.out.println(abc.x);
	}
}

