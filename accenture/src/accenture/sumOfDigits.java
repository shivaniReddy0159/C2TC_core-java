package accenture;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,sum=0;
		while(n>0)
		 {
		 r=n%10;
		 sum=sum+r;
		 n=n/10;
		 }
		System.out.println(sum);
		}
		


	}


