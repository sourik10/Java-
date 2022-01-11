package pOne;
public class Sample{
	public int v1 = 10;
	public int v2 = 20;
	public void m1(){
		System.out.println("M1 method in Sample Class of pOne package");
	}
	public static void main(String[] args){
		Sample s = new Sample();
		s.m1();
	}
}

----------------------------------------------------------------------------------------
  package pTwo;
import pOne.Sample;
public class Sample2 extends Sample{
	public void m2(){
		System.out.println(v1);
		System.out.println(v2);
		m1();
		System.out.println("M2 method in Sample2 Class of pTwo package");
	}
	public static void main(String args[]){
		Sample2  h = new Sample2();
		h.m2();
	}
}

-------------------------------------------------------------------------------
  import pTwo.Sample2;
class a3{
	public static void main(String[] args){
		Sample2  k = new Sample2();
		k.m2();
	}

}

