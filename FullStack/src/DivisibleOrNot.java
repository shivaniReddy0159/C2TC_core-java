import java.util.Scanner;

public class DivisibleOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		
		if(number%2==0 && number%4==0 && number%6==0)
		{
			System.out.println("divisible by 2,4,6");
		}
		else
		{
			System.out.println("not divisible");
		}
		}

	

}
