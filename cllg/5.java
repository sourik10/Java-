public class First(){
        int x=10;
        void show(){
            System.out.println(x);
        }
    }
public class Second(){
    public static void main(String[] args){
        First xyz=new First();
        xyz.show();
    }
}
