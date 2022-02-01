import java.lang.Math;
import java.util.*;

//basics in java(varible/datatype(primitive+non-primitive)
//typeCasting(implicit,explicit)
//String vs StringBufferClass in java
//CollectionFramework in java
//Stack/Queue/ArrayList/iterator
//Array(nonPrimitive dt) String(nonPrimitive dt)

public class basics {
    public static void main(String[] args){
        System.out.println("Sourik Coder");

        //Non primitive dataType (int/boolean/String/long/float/double)
        //primitive Datatype(String/Arrays)

        int a=10;
        System.out.println(a+10);


        //String datatype
        String s="Satyaki";
        String s2=new String("Ayan");
        System.out.println(s+" "+s2);

        //ArrayInJava
        int[] marks= new int[5];
        marks[0]=100;
        marks[1]=50;
        marks[2]=25;
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println("Age Array");
        int[] age={10,20,30};
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }

    //tyeCasting(Explicit Type Casting)
    int price = 100;
    float gst = 18.00F;
    int finalPrice = price + (int)gst;
    System.out.println(finalPrice);

        int m1=10,m2=23;
        System.out.println(Math.max(m1,m2));

        //taking input
        Scanner sc=new Scanner(System.in);
        sc.close();
        /*
        System.out.println("Enter a integer");
        int i=sc.nextInt();

        System.out.println("Enter a String");
        String s1=sc.nextLine();

        System.out.println(i+" "+s1);

        sc.close();
        */

        //CollectionFramework
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);

        System.out.println(l);
        int element =l.get(0);
        System.out.println(element);

        l.add(1,12);
        System.out.println(l);

        l.set(1,11);    
        System.out.println(l);
        System.out.println(l.size());

        l.remove(2);
        System.out.println(l);

        System.out.println(l.size());

        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }

        l.add(0,89);
        l.add(0,99);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        List<String> l2=new ArrayList<String>();
        l2.add("Souvik");
        l2.add("Arpan");
        l2.add("mayukh");

        l2.add(1,"jiten");
        System.out.println(l2);

        //iterator in list
        Iterator<String>it=l2.iterator();
        while(it.hasNext()==true){
            System.out.println(it.next());
        }

        //Stack in JAVA(fifo)
        Stack<Integer> s3=new Stack<>();
        s3.push(10);
        s3.push(20);
        s3.push(30);
        s3.push(40);
        Iterator<Integer> it2=s3.iterator();
        System.out.println("Stack");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        
        //Queue in JAVA(lifo)
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println("Queue");
        Iterator<Integer> itt=q.iterator();
        while(itt.hasNext()){
            System.out.println(itt.next());
        }
       
    //String VS StringBuilderClass in JAVA
    //StringBuilder CLASS
    StringBuilder sb=new StringBuilder("String vs StringBuilder");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
    sb.setCharAt(0, 'M');
    System.out.println(sb);

    //insert a character
    sb.insert(0, 'S');
    System.out.println(sb);

    //starting index inclusive
    //ending index exclusive
    sb.delete(0,2);
    System.out.println(sb);
    StringBuilder sbb=new StringBuilder("Sourik");
    sbb.append("pan");
    System.out.println(sbb);
    System.out.println(sbb.length());


    }
}
