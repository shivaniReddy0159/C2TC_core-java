import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of days/n1.365/n2.366");
		int days=s.nextInt();
		
		if(days==366)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("normal year");
		}
		}
	

}
