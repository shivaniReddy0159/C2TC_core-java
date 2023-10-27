package accenture;

public class reverseArray {

	public static void main(String[] args) {
	/*	int[] num= {1,2,3,4,5};
		System.out.println("original array");
for(int i=0;i<num.length;i++)
{
	System.out.println(num[i]);
}
System.out.println("after reversing");
for(int i=num.length-1;i>=0;i--)
{
	System.out.println(num[i]);
}*/
		
		int[] num= {1,2,3,4,5};
		int n=num.length;
		int[] b= new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=num[i];
			j=j-1;
		}
		System.out.println("reversed array is");
		for(int k=0;k<n;k++)
		{
			System.out.println(b[k]);
		}
		}
}

	


