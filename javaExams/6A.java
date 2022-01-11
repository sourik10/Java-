//method-overloading
class Method{
    int overloading(int a,int b){
        System.out.println("Integer type");
        return (a*b);
    }
    double overloading(double a,double b){
        System.out.println("Double");
        // return 1;
        return a*b;
    }
}
public class MyClass {
    public static void main(String args[]) {
        Method obj=new Method();
        int x=obj.overloading(3,4);
        System.out.println(x);
        
        double y=obj.overloading(3.5,4.5);
        System.out.println(y);
    }
}
