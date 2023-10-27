package accenture;

public class armstrongNumber {

	public static void main(String[] args) {
		int sumOfCube=0,a,temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			a=number%10;  //getting last digit
			number=number/10;//removing last digit
			sumOfCube=sumOfCube+(a*a*a);
		}
		if(temp==sumOfCube)
		{
			System.out.println(temp+ "is an armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
		}
		}
	


