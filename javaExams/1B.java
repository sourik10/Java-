import java.util.Scanner;
public class oneB {
    public static void main(String args[]) {
        
        //String str = "Good Boy";

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Sentence:");
        String str=scan.nextLine();

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Printing content of array
        /*for (char c : ch) {
            System.out.println(c);
        }*/
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array in reverse order: ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
