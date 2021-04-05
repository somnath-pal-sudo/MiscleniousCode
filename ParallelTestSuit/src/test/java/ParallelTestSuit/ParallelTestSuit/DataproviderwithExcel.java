package ParallelTestSuit.ParallelTestSuit;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataproviderwithExcel {
	
	@DataProvider(name="excel-data")
	
	public Object[] xlDP() {
		
		
		Object[][] arrayobj=getExcelData("Location of the excel file in your local system","Name of the excel sheet where your data is placed");
		
    	return arrayobj;
		
		
	}

	private Object[][] getExcelData(String filename, String sheetname) {
		String data=null;
		FileInputStream fis= new FileInputStream(filename);
		XSSFWorkbook xb= new XSSFWorkbook(fis);
		XSSFSheet sheet=xb.getSheet(sheetname);
		int noofrows= sheet.getLastRowNum();
		int noofcols= sheet.getRow(1).getLastCellNum();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return data;
	}
	
	

}
