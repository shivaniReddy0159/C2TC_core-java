import java.util.Scanner;

public class positiveNegativeOrZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		
		if(number>0)
		{
			System.out.println("positive number");
		}
		else if(number<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("zero");
		}
		}

	

}
