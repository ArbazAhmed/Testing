package New;

public class Exercise {

	public static void main(String[] args) {
		
	//String[] s = {};
	int [] a = {1,2,3,4,5,1,6,7,8,2};
	
	int count =0;
	for (int i=0;i<a.length;i++){
		
		for(int j =i+1;j<a.length;j++){
			
			
			if(a[i]==(a[j])){
				//count++;
				System.out.println("Duplicate"+a[i]);
			}
		}
			
		//System.out.println(s[i]+" is Duplicate"+count);
		
	}
	
	
	
	
	
	
}
}
