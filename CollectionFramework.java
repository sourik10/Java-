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

//Collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Stack;
//The Java collections framework provides a set of interfaces and classes toimplement various data structures and algorithms.
class CollectionFramework {
    public static void main(String[] args) {
        
        //arrayList
        ArrayList<Integer>ar=new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(12);
        ar.add(5);
        System.out.println(ar);
        System.out.println(" ");
        Collections.sort(ar);
        System.out.println(ar+" ");
        
        //List Interface -->arraylist class
        List<Integer>list=new ArrayList<Integer>();
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(list);
        System.out.println("size: "+ list.size()); 
        list.add(1,100);
        System.out.println(list);
        System.out.println(list.get(2));
        int rem=list.remove(3);
        System.out.println("removed element: "+rem);
        System.out.println("list :"+list);
        List<Integer>list2=new ArrayList<Integer>();
        list2.add(8);
        list2.add(0,9); 
        
        System.out.println(list2);
        list.removeAll(list2); 
        System.out.println("updated list "+list);
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(100));
        list.clear();
        System.out.println(list.isEmpty());
        
        //vector in collection framework
        Vector<String>v=new Vector<>();
        v.add("Ayan");
        v.add("messi");
        v.add("sourik");
        v.add("souvik");
        System.out.println(v.get(3));
        Iterator<String>it=v.iterator(); //iterator 
       while(it.hasNext()) {
            System.out.print(it.next());
            System.out.print(", ");
        }
        
        //stack interface
        Stack<Integer>st=new Stack<Integer>();
        st.push(10);
        st.push(11);
        st.push(12);
        boolean check=st.empty();
        System.out.println(st);
        System.out.println(check);
        
        
        //deque interface
        ArrayDeque<String>dq=new ArrayDeque<>();
        dq.add("a");
        dq.addLast("b");
        dq.addFirst("123");
        dq.addLast("c");
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        
        //map interface
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"TT");
        mp.put(2,"DD");
        mp.put(3,"KK");
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        
        
        
    }
}
