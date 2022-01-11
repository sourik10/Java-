import java.util.*;
public class deletemethod{
	String delete(String str,int m){
		char[] ch = str.toCharArray();
		for(int i=m;i<str.length()-1;i++){
			ch[i]=ch[i+1];
		}
		ch[str.length()-1]= ' ';
		str=String.valueOf(ch);
		return str;		
	}
	public static void main(String args[]){		
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
   		String  str = sc.nextLine();
   		
		System.out.print("Enter the index - ");
   		int index = sc.nextInt();
   		
		deletemethod obj = new deletemethod();		
		String newstr=obj.delete(str,index);
		System.out.print(newstr);
	}
}
