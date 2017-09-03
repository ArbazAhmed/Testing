package New;



class up{
	public void overload(int i,int j,int k){
		
		System.out.println(i+j+k);
		
		
	}
	
	public void overload(int i,int j){
		
		System.out.println(i*j);
		
	}
	

	
	
	
}





public class primeNumber extends up {
	
public void overload(int i,int j){
		
		System.out.println(i%j);
		
	}

	public static void main(String[] args) {
		
	    	
	    	
	   up u = new up();
	  
	   u.overload(2, 6);
	    		
       u.overload(3,5,7);	
	    	
	    
	    
		primeNumber pn = new primeNumber();
		pn.overload(2, 3);
		
		
		
		

	}

}
