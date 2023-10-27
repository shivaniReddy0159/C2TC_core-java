package accenture;

public class StringS {

	public static void main(String[] args) {
String s1="shivani";
String z=s1.concat("software");
System.out.println(z);
		
		
String s2="banda";
String m=s2.toUpperCase();
System.out.println(m);
		
		
String s3=new String("Prends"); 
String s=s3.toLowerCase();
System.out.println(s);
		 
System.out.println(s1 + s2 + s3);
	
String b1="raja rani";
b1=b1.substring(4);
System.out.println(b1);
	
	
String b2="mahendra singh";
b2=b2.substring(0,5);
System.out.println(b2);

String b3="ram";
System.out.println(b3.length());
System.out.println(b3.isEmpty());

String b4="";
System.out.println(b4.isEmpty());


String b5="Andaman and Nicobar";
char []x=b5.toCharArray();
System.out.println(x);


}

}
