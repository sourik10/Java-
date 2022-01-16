public class MyClass {
    public static void main(String args[]) {
        int ar[]=new int[5];
        String name="sourikPan";
        
     try{
        // System.out.println(name.charAt(15));
        System.out.println(ar[5]);
     }
     catch(StringIndexOutOfBoundsException e){
         System.out.println(e);
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
     }
     
    }
}
