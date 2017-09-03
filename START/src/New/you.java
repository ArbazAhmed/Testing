package New;

import java.util.Scanner;

public class you {
	
	public static void main (String [] args){
		
		
	//	System.out.println("1"+2+3);
	//	System.out.println(1+2+"3");
	//  System.out.println(1+"2"+3);
		
	/*	int i=0;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i); */
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		
		int n = scn.nextInt();
		
		int r = n%2;
		if(r == 0){
			System.out.println("number is even");
		}else{
			System.out.println("number is odd");
		}
		
	
	}


}
