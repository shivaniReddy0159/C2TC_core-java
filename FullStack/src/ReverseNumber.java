import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int num=s.nextInt();
		
		int rem=0,reverse=0;
		
		while(num>0)
		{
			 rem=num%10; //getting last digit
			 reverse=reverse*10+rem;
			 num=num/10;
		}
		System.out.println(reverse);
		}

	}


