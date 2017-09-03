package New;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cellSkips {

	public static void main(String[] args) throws IOException {
		//Reading Workbook 
		File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
		FileInputStream ExcelFileToRead = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
        
		XSSFSheet sheet = wb.getSheetAt(0);
	    XSSFRow row;
		XSSFCell cell;
		

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			
			for(int i=0; i<row.getLastCellNum(); i++) {
				
				cell = row.getCell(i, row.CREATE_NULL_AS_BLANK);
				//System.out.println(cell.toString()+" ");
				String Data = cell.toString();
				if(Data.equals("User20")){
					
					System.out.println(Data+" is Value and Row is ");
				}
				
				//System.out.println(Data);
				
			}
		
		wb.close();
		
		

	}

}
}
