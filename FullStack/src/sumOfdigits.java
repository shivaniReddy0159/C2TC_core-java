
 import java.util.Scanner;
 public class sumOfdigits {

	public static void main(String[] args) {
		System.out.println("enter number whose sum of digits needed to be found");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0,rem=0;
		
		/*for(int i=1;num>0;i++)
		{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		System.out.println(sum);*/
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		

	}

}
