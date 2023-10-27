
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number whose factorial need to be founded");
		int num=s.nextInt();
		int factorial=1;
		
		for(int i=num;i>0;i--)
		{
		factorial=factorial*i;	
		}
		System.out.println(factorial);
}

}


/*
 * factorial of 5=5*4*3*2*1
 * 
 * i=5,5>0 true
   fact=    1*5=5
   i--
  
 * i=4; 
   4>0 true
   fact=   5*4=20
   i--
  
 * i=3; 3>0 true
  fact=   20*3=60
  i--
  
 * i=2;2>0 true
   fact=   60*2=120
   i--
    
 * i=1,1>0 true
   fact=  120*1=120
   i--
  
 * i=0 0!>0 false and looping stops
 * */
