package accenture;

public class stringToStringArray {

	public static void main(String[] args) {
		String str="I am a Software developer";
		 String[] a= str.split(" ");
		 
		 System.out.println("String :" + str);
System.out.println("String array :[");

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+ ",");	
}
System.out.println("]");
}
	}


