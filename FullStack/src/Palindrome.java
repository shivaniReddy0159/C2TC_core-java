
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12233221;
		int x=num;
		int reverse=0;
		while(num>0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		
		if(reverse==x)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");


	}
	}
	}
