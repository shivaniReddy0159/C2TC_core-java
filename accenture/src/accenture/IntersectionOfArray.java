package accenture;

import java.util.HashSet;

public class IntersectionOfArray {

	public static void main(String[] args) {
		/*int[] numOne= {1,4,3,2,5};
		int[] numTwo= {6,7,10,8,9};
		System.out.println("elements of first array are");
for(int i=0;i<numOne.length;i++)
{
	System.out.println(numOne[i]);
}
System.out.println("elements of second array are");
for(int i=0;i<numOne.length;i++)
{
	System.out.println(numTwo[i]);
}


System.out.println("intersection of two arrays is");
for(int i=0;i<numOne.length;i++)
	for(int j=0;j<numTwo.length;j++)
	{
		if(numOne[i]==numTwo[j])
		{
		System.out.println(numTwo[j]);	
		}
		
		}*/
		
		String s1[]= {"one","two","three","four","five","four"};
		String s2[]= {"three","four","five","six","seven","four"};
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
		   for(int j=0;i<s2.length;j++)
		{
			if(s1[i].equals(s2[j]))
			{
				set.add(s1[i]);
			}
			}
		
		}
		}
	}
		
	
	

	


