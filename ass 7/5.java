import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     
     String s=sc.nextLine();
     char[] ch=s.toCharArray();
     System.out.println("Before sorting: "+ch);
     
     //selectionSort algorithm
     for(int i=0;i<ch.length-1;i++){
         int minIndex=i;
         for(int j=i+1;j<ch.length;j++){
             if(ch[minIndex]>ch[j]){
                 minIndex=j;
         }
     }
     char t=ch[i];
     ch[i]=ch[minIndex];
     ch[minIndex]=t;
    }
     System.out.println("After sorting: "+ch);
    }
}
