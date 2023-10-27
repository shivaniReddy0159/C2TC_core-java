package accenture;

import java.util.Arrays;

public class maxDifferecnceArray {

	public static void main(String[] args) {
		/*int[] num= {45,69,75,63,55,74};
		System.out.println("elements of array are");
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);	
		}
		System.out.println("after sorting");
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);	
		}
		System.out.println("max difference is");
		System.out.println(num[4]-num[0]);
		}*/
		

	int[] a= {5,8,7,4};
	int n=a.length;
	int diff,greatest_diff;
	greatest_diff=0;
	int a1=0,a2=0;
	for(int i=0;i<n;i++)
	{
	  for(int j=i+1;j<n;j++)
	  {
	    diff=Math.abs(a[i]-a[j]);
	      if(diff>greatest_diff)
	      {
		     greatest_diff=diff;
		     a1=i;
		     a2=j;
		
	}
	}
	}
  System.out.println("greatest difference:"+ greatest_diff);
 
	}
	
}
