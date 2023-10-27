package accenture;

public class SpyNumber {

	public static void main(String[] args) {
		int n=1412;
		int x=n;
		int r,sum=0;
		int product=1;
		while(n>0)
		 {
		int rem=n%10;
		sum=sum+rem;
		
		product=product*rem;
		
		n=n/10;
		 }
		if(sum==product)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}
		
		
		
		
	}

}
