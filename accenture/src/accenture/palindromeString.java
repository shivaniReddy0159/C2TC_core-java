package accenture;

public class palindromeString {

	public static void main(String[] args) {
		String s= "did";
		String n=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 char c=s.charAt(i);
			rev=rev+c;
			}
		
	if(rev.equals(n))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
	}

	


