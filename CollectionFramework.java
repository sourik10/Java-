//Java Collection Framework 
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
      //creating an array in JAVA
      int[] marks=new int[3];
      marks[0]=99;
      marks[1]=100;
      marks[2]=102;
      for(int i=0;i<marks.length;i++){
          System.out.print(marks[i]+" ");
      }System.out.println();
      
      //alternative method
      int[] number={87,88,89};
      for(int i=0;i<number.length;i++){
          System.out.print(number[i]+" ");
      }System.out.println();
      
      //ArrayList in JAVA
      ArrayList<Integer> roll=new ArrayList<Integer> ();
      roll.add(10);
      roll.add(20);
      roll.add(30);
      System.out.println(roll);
      
      //List in JAVA
      List<String>l=new ArrayList<String> ();
      l.add("Sourik");
      l.add("Shiva");
      l.add("Sayan");
      l.add("Sadiq");
      l.add(2,"Ayan");      //l.add(index,val);
      System.out.println(l);
      
      //get(i) method in JAVA
      for(int i=0;i<l.size();i++){
          System.out.print(l.get(i)+" ");
      }System.out.println();
      
      l.remove(2); //remove element at index 2
      System.out.println(l);

     // l.clear(); //empty list l
      //System.out.println(l);
      
        l.set(2,"Satyaki"); //update element at index 2
        System.out.println(l);
        
        //Print every element in list 
        for(String s:l){
            System.out.println(s);
        }
        
        //iterator in list 
        Iterator<String>it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
      //Stack in JAVA
       Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
                System.out.println(s);
                System.out.println(s.peek());
      
      //Queue in JAVA
       Queue<Integer> q=new LinkedList<>();
       q.offer(10);
       q.offer(20);
       q.offer(30);
       q.offer(40);
      // System.out.println(q);
       //System.out.println(q.peek());
       
       Iterator<Integer>it=q.iterator();
       while(it.hasNext()){
           System.out.print(q.peek()+" ");
           q.poll();
       }
       System.out.println("Size: "+ q.size());
       
       
      
    }
}
