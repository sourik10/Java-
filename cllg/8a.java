class Student{
    int roll;
    String name;
    String stream;
    String college;
    
    Student(int r,String n,String s,String c){
        roll=r;
        name=n;
        stream=s;
        college=c;
    }
    void display(){
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Stream: "+stream);
        System.out.println("College: "+college);
    }
    
}

public class StudentRecord{
public static void main(String[] args){
        Student abc=new Student(10,"Sourik","CSE","NIT");
        Student xyz=new Student(20,"Sourav","IT","IIT");
        System.out.println("Students records:  ");
        abc.display();
        System.out.println("\n");
        xyz.display();
}
}





