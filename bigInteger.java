public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        java.math.BigInteger b1=sc.nextBigInteger();
        java.math.BigInteger b2=sc.nextBigInteger();
        
        java.math.BigInteger b3,b4;
        b3=b1.add(b2);
        b4=b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
