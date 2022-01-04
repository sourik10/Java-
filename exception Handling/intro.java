public class MyClass {
    public static void main(String args[]) {
        
     try{
          //Arithmetic Exception
         int a=10,b=0;
         int c=a/b;
     }
      
      try{
        //Array index out of bound
        int a[]=new int[5];
        a[10]=20;
      }
      
      try{
        //Null Pointer Exception
        String n=null;
        System.out.println(n.length());
      }
      
     catch(Exception e){
         System.out.println(e);
     }
     
    }
}
