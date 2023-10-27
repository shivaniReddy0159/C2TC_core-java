
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number whose digits need to be counted");
		int num=s.nextInt();
		int count=0;
		
		/*for(int i=1;num>0;i++) //or num!=0
		{
	    count++;
		num=num/10;
		}
		System.out.println(count);*/
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		
		
		
	
}
}
/*
 123!=0 true  123>0 
 count++  count=1
 num=123/10 =12
 
 12!=0; true  12>0
 count++  count=2
 num=12/10=1
 
 1!=0; true 1>0
 count ++  count=3
 num=1/10 =0
 
 0=0 false and looping stops
 
 */
