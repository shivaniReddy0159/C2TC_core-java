package accenture;

public class StringToChararray {

	public static void main(String[] args) {
		String str="shivani";
		
		
		/*char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		for(char c :ch)
		{
			System.out.println(c);
		}*/
		
		
		char[] c=str.toCharArray();  //for converting string to char array use "toCharArray" method which is inbuilt
		
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		
		
		
		}
		}
	


