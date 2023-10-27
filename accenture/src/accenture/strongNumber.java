package accenture;

public class strongNumber {

	public static void main(String[] args) {
		int z=145;
		int factorial=1;
		int i;
		int num=1;
		for(i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		
		
		int factorial1=1;
		int x;
		int numb=4;
		for(x=1;x<=numb;x++)
		{
			factorial1=factorial1*x;
		}
		

		
		int factorial2=1;
		int y;
		int number=5;
		for(y=1;y<=number;y++)
		{
			factorial2=factorial2*y;
		}
		
		int factorial3=factorial+factorial1+factorial2;
		System.out.println(factorial3);
		if(factorial3==z)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
		}
	}

