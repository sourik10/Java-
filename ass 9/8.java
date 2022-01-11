import java.util.Scanner;
class LeftIndexOutOfBoundsException extends RuntimeException{
	LeftIndexOutOfBoundsException(String s){
		super(s);
	}
}

class RightIndexOutOfBoundsException extends RuntimeException{
	RightIndexOutOfBoundsException(String s){
		super(s);
	}
}

class LeftIndexRightIndexException extends RuntimeException{
	LeftIndexRightIndexException(String s){
		super(s);
	}
}

public class test{
 static String reverse(String original){
  String curr="";
  int i=original.length()-1;
  while(i>=0){
   char x=original.charAt(i);
   curr=curr+x;
   i--;
 }
return curr;
}

 public static void main(String[] args){
      int l,r;
      String name,substr;
      Scanner sc=new Scanner(System.in);
      name=sc.nextLine();
      l=sc.nextInt();
      r=sc.nextInt();
      try{
	if(l<0)throw new LeftIndexOutOfBoundsException("left index is less than 0");
        else if(r>name.length())throw new RightIndexOutOfBoundsException("right index is more than string length");
	else if(l>r)throw new LeftIndexRightIndexException("left index is gretaer than right index");
      }catch(LeftIndexOutOfBoundsException lioobe){
	System.out.println("Exception for left index out of bounds");
      }
      catch(RightIndexOutOfBoundsException rioobe){
         System.out.println("Exception for right index out of bounds");
       }
      catch(LeftIndexRightIndexException lirie){
	System.out.println("Exception for right index is smaller than left indexout of bounds");
       }
      substr=name.substring(l,r);
      String ReverseStr=reverse(substr);
      System.out.println("Substring after reversal is: "+ReverseStr);
    }
}
       
