package accenture;

public class SwapNumbers {

	public static void main(String[] args) {
		/*with using of temp vraiable
		 * 
		 * 
		 * int x=100;
		int y=200;
		System.out.println("before swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
	int temp=x;  //storing x in a temporary variable
	x=y;         //assigning y to x
	y=temp;  
	System.out.println("after swapping");//assigning x to y i.e temporary variable
	System.out.println("x="+x);
	System.out.println("y="+y);
	}

}*/
	int x=100;
	int y=200;
	System.out.println("before swapping");
	System.out.println("x="+x);
	System.out.println("y="+y);
	x=x-y;   //x=100-200=-100
	
	
	y=x+y;   //y=-100+200=100
	x=y-x;   //x=100-(-100)=200
	
	System.out.println("after swapping");
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}
		
	
