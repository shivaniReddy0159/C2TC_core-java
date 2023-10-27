package accenture;

public class numberOfOccuranceOfElement {

	public static void main(String[] args) {
		int[] num= {1,2,3,2,5,6,7,3}; 
		int count=0;
		System.out.println("elements of array are");
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);	
		}

		for(int i=0;i<num.length;i++)
		{
			if(num[i]==3)
			{
		count++;
			}
			}
		System.out.println("number of times of occurance of element 3 is" +count+ "times");
		}
		}
		

	


