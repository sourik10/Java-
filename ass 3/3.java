class box{
	void cal(int s){
		int vol = s * s * s;
		System.out.println("Volume of cube is:" +vol);
	}
	void cal(int r, int h){
		double vol = (3.14 * r * r * h)/3;
		System.out.println("Volume of cone is:" +vol);
	}
}
class driver{
	public static void main(String args[]){
		int s = 5;
		int r = 3;
		int h = 7;
		box b = new box();
		b.cal(s);
		b.cal(r,h);
	}
}
