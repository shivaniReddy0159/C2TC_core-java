package accenture;

public class Strong2 {

	public static void main(String[] args) {
		int num=145;
		int fact=1;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+rem;
			num=num/10;
		}
		if(sum==num)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		}

	}


