package accenture;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayToArrayList {

	public static void main(String[] args) {
	String[] array=new String[] {"android","jsp","java","hibernate"};
ArrayList<String> list=new ArrayList<String>(Arrays.asList(array));
System.out.println(list);
	}
		
		
	}