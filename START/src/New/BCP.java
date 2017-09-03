package New;


import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class BCP {
  @Test
  public void f() throws FilloException {
	  
	  Fillo fillo = new Fillo();
	  Connection con = fillo.getConnection("/START/test-output/Excell.xlsx");
	  
	  String strQur = "Select * from Sheet";
	  Recordset rs = con.executeQuery(strQur);
	  
	  
	  
	  
	  
	  
  }
}
