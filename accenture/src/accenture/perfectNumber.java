package accenture;

public class perfectNumber {

	public static void main(String[] args) {
		int num=6;
		int sum=0;
		int temp=sum;
		for(int i=1;i<6;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
		}
	}


