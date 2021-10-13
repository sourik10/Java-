class DiffClass{
    int x=50;
}

class TEST{
    int y=10;
    void method(TEST t1,DiffClass d1){
        System.out.println("Same class object: "+t1.y);
        System.out.println("Diferent class object: "+d1.x);
    }
}
public class UNIVERSAL{
    public static void main(String args[]){
    TEST abc=new TEST();
    DiffClass pqr=new DiffClass();
    abc.method(abc,pqr);
}
}
