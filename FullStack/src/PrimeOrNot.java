
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to be checked");
		int num=s.nextInt();
		int factors=0;
		
		for(int i=num;i>0;i--)
		{
			if(num%i==0)
			{
				factors++;
			}
		}
		if(factors==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		
}
}

	


