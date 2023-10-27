
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number whose factors needed to be founded");
		int num=s.nextInt();
		for(int i=1;num>=i;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
		
		
		

	}

} 
/*
 * factors of 25=1,5,25
 * 
 
*/
