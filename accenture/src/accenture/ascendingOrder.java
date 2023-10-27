package accenture;

public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {5,98,56,34,4};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				}
			}
		}
		System.out.println("ascending order of elements is");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		

	}

}
