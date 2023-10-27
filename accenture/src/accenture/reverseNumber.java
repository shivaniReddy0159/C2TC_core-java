package accenture;

public class reverseNumber {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>0)
		{
			int rem=num%10; //getting last digit 
			rev=rev*10+rem; 
			num=num/10;
		}
		System.out.println(rev);
		}
		}

	/*
	 123>0  true
	 123%10=3
	 rev=0*10+3   =3
	 123/10=12
	 
	 12>0true
	 12%10=2
	 rev=3*10+2   =32
	 12/10=1
	 
	 
	1>0 true
	1%10=1
	rev=32*10+1   321
	1/10=0
	
	0>0 false and looping stops
	  
	  
	 
	 */


