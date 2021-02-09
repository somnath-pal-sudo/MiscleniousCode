package apachePOI.apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelOperation {

	public static void main(String[] args) throws IOException {

		String excelFilePath = ".\\dataFolder\\ExcelOperaion-POI.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// using for loop//
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();

		
		  
		  for(int r=0; r<=rows; r++) {
		  
		  XSSFRow row=sheet.getRow(r); for(int c=0; c<col; c++) { XSSFCell
		  cell=row.getCell(c);//it describes type of a cell whether is it a boolean or string or integer 
		  switch(cell.getCellType()) {
		  case STRING: System.out.print(cell.getStringCellValue());break; 
		  case NUMERIC:System.out.print(cell.getNumericCellValue());break; 
		  case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
		  
		  
		  }
		  
		  System.out.println();
		  
		  }
		  
		  }
		//using iterator showingdata in excel file//  
		 

		Iterator it = sheet.iterator();
		while (it.hasNext()) {
			XSSFRow row = (XSSFRow) it.next();
			Iterator it2 = row.cellIterator();
			while (it.hasNext()) {
				XSSFCell cell = (XSSFCell) it.next();
				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				}
				System.out.println("|");

			}
		}

	}

}
