package New;

import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number");
		int num , flag = 0;
		num = scn.nextInt();
		
		for(int i=1;i<num;i++){
			
			if(i%num==0){
				flag=0;
			   break;	
			}
			else{
				flag=1;
			}
		}
		if(flag == 1){
			System.out.println(num+" is prime");
		}
		else{
			
			System.out.println(num+" is not prime");
		}

}
}