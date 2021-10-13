class qns{
	int x=20;
}

class Test{
	int x=80;
	//returning to same class
	Test sameRef(){
		return new Test();
	}
	
	//returning to differnt class
	qns difRef(){
		return new qns();
	}
}

public class Main{
	public static void main(String[] args){
		Test t=new Test();
		Test same=t.sameRef();
		qns diff=t.difRef();

		System.out.println(diff.x);
		System.out.println(same.x);
	}
}
