public class test{
  public static void main(String[] args){
  try{
   throw new Throwable();
  }
  catch(Throwable t){
   System.out.println(t);
   }
  }
}
