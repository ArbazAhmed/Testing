package New;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

class abcdefg {
	
	
	public static void main (String[]args) throws FilloException{
		
		
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\c5248056\\Desktop\\Return.xlsx");
				
		
		String strQ = "Select * from Sheet";
		Recordset rs = connection.executeQuery(strQ);
		
		while(rs.next()){
			
			System.out.println(rs.getField("Name"));
			//System.out.println("test");
			
		}
		
		rs.close();
		connection.close();
		
		
	
}
		
}	