
class HelloWorld {
    public static void main(String[] args) {
        
      
      //integer,flaot,double
       int a=36;
       a=a>>2;
       System.out.println(a+" ");
       float f=a;
       System.out.println(f+" ");
       double d=76;
       System.out.println(d);
       
       
    
       //string datatype
                    
       String s1="rronaldor genjiir size ";  // 0-6
       System.out.println(s1+" ");
       
       String s2=new String("Messi");
       System.out.println(s2+" ");
      
       String output=s1+s2; //concatenation
       System.out.println(output+" ");
       
     //  System.out.println(s1.charAt(7)); //charAt
       System.out.println(s2.length()); //length method 
       System.out.println(s1.replace('r','R')); //replace method
       
       // substring(int startIndex, int endIndex):
       //startIndex included
       //endIndex excluded
       System.out.println(s1.substring(1,8));
       
  
       
       
       //array in java
       int [] marks=new int[10];
       marks[0]=78;
       marks[1]=90;
       marks[5]=98;
       for(int i=0;i<marks.length;i++){
           System.out.println(marks[i]);
       }
       
       
           */
       
    //implicit 
    float price = 100.00F;
    int gst = 18;
    float finalPrice = price + gst;
    System.out.println(finalPrice+" ");
    
    //explicit
    int pricee = 100; 
    float gstt = 18.00F; 
    int finalPricee = pricee + (int)gstt; 
    System.out.println(finalPricee);
    
    
        
 //input taking from user
 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      a+=10;
      System.out.println(a);
    }
}
        
        
        
        
       
       
       
    }
}
