class student{
   
   //instance variable---number,f_name,l_name
   int number;
   String f_name;  
   String l_name;
 
 /*  
   student(String f_name,String l_name,int number){ //using this keyword---->parameterised constructor
       this.f_name=f_name;
       this.l_name=l_name;
       this.number=number;
   }
 */
   student(String f,String l,int n){ //parameterised constructor
      //local variable----f,l,n
       f_name=f;   
       l_name=l;
       number=n;
   }
   
   student(int n){
       this("anybody","anyone",n); //this constructor
   }
   
   void display(){
       System.out.println(f_name);
       System.out.println(l_name);
        System.out.println("marks: "+number);
   }
}
public class MyClass {
    public static void main(String args[]) {
    student s1=new student("sourik","pan",99);
    s1.display();
    
    System.out.println();
    student s2=new student(90);
    s2.display();
    }
}
