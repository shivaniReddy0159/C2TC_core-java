import java.util.Scanner;

public class BiggestAmongThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbers to compare");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is bigger");
		}
		else if(b>c)
		{
			System.out.println("b is bigger");
		}
		else
		{
			System.out.println("c is bigger");
		}
		}
		}

	


