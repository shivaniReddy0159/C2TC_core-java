package accenture;

public class countDigits {

	public static void main(String[] args) {
		int num=87469877;
		int count=0;
	 while(num>0)
	 {
		 int rem=num%10;
		 count++;
		 num=num/10;
	 }
	 System.out.println(count);
	 }

	}
/*
 * rem=87469877%10===7
 * count=0+1=1
 * num=87469877/10===8746987
 * 
 * rem=8746987%10====874698
 * count=1+1=2
 * num=8746987/10====874698
 */


