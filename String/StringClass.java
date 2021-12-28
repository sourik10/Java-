class Main {
	public static void main(String args[]) {
	   
	   //equalMethod in JAVA
	   String s1=new String("Cristiano");
       String s2="Cristiano";
       System.out.println("IsEqual "+s1.equals(s2));

	   //equalsIgnoreCase in JAVA
	   String s3=new String("CRISTIANO");
	   System.out.println("IsEqual "+s1.equalsIgnoreCase(s3));

		//char array to String Converter
	   char[] ch={'a','b','c','d'};
	   //char[] ch="abcd"; error
	   String chS=new String(ch);
	   System.out.println(chS);

		//character at specific Index
		String j="JAVA";
		System.out.println(j.charAt(2));

		//String IndexOutOFBoundException
		//System.out.println(j.charAt(-1));

		//concatMethod in JAVA
		j=j.concat("Python");
		System.out.println(j);

		//SubstringPrint 
		//substring[staring,ending)
		System.out.println(j.substring(0,4));
		System.out.println(j.substring(4));

		System.out.println(j.length());
	
		//ReplaceMethod in JAVA
		j=j.replace("JAVA","RUBY");
		System.out.println(j);
		
		//UpperLowercase Method
		System.out.println(j.toUpperCase());
		System.out.println(j.toLowerCase());


		//compareTo Method in JAVA
		//a=97, A=65
		String c1="bbbA";
		String c2="bbba";
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));



	}
}
