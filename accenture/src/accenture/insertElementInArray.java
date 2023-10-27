package accenture;



public class insertElementInArray {

	public static void main(String[] args) {
		
		int [] a=new int[5+1];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		a[4]=1;
		int n=6;
		
		
		
		
		 int x=3;
		 int pos=2;
		 //int n=a.length+1;
		 for(int i=(n-1);i>=(pos-1);i--)
		 {
			 a[i+1]=a[i];
		 }
		 a[pos-1]=x;
		 System.out.println("after inserting");
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]+",");
		 }
		 System.out.println(a[n-1]);
		 }
		 

	

}
