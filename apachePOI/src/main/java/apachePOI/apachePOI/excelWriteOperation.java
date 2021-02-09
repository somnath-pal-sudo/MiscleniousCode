package apachePOI.apachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWriteOperation {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("EmpInfo");
		
		
		
		ArrayList<Object[]> arraylist= new ArrayList<Object[]>();
		arraylist.add(new Object []{"EmpID","EmpName","Job"});
		arraylist.add(new Object []{101,"David","Job"});
		arraylist.add(new Object []{102,"Smith","Scientist"});
		arraylist.add(new Object []{103,"Peter","Analyst"});
		
		
		
		
		//using for..each loop//
		
		
		int rowNumber=0;
		for(Object[]emap:arraylist) {
			XSSFRow row=sheet.createRow(rowNumber++);
			
			int cellNumber=0;
			for(Object value:arraylist ) {
				XSSFCell cell=row.createCell(cellNumber++);
				
				if(value instanceof Boolean)
					cell.setCellValue((boolean) value);
				if(value instanceof Integer)
					cell.setCellValue((Integer) value);
				if(value instanceof String)
					cell.setCellValue((String) value);
				
				
			}
			
		}
		
		
		Object empdata[][]= {
				{"EmpID","EmpName", "Job"},
				{101,"David","Engineer"},
				{102,"Smith","Scientist"},
				{103,"Peter","Analyst"}
		};
		int rows= empdata.length;
		int columns= empdata[0].length;
		
		System.out.println("No. of rows" + rows);
		System.out.println("No. of columns" + columns);
		
		
		
		for(int r=0; r<rows; r++) {
			
			XSSFRow row=sheet.createRow(r);//craeting row from Sheet
			
			for(int c=0; c<columns; c++){
				XSSFCell cell= row.createCell(c);//creating cell from XSSFRow.
				Object value=empdata[r][c];// putting same data into excel file
				
				if(value instanceof Boolean)
					cell.setCellValue((boolean) value);
				if(value instanceof Integer)
					cell.setCellValue((Integer) value);
				if(value instanceof String)
					cell.setCellValue((String) value);
				
				
				
				
			}
		}
		
		//using foreach loop//
		
		int rowCount=0;
		for (Object emp[]:empdata)
		{
			XSSFRow row=sheet.createRow(rowCount++);
			int coulumCount=0;
			for(Object value:emp) {
				XSSFCell cell=row.createCell(coulumCount++);
				if(value instanceof Boolean)
					cell.setCellValue((boolean) value);
				if(value instanceof Integer)
					cell.setCellValue((Integer) value);
				if(value instanceof String)
					cell.setCellValue((String) value);
				
				
				
				
			}
		}
		
		
		
		
		
		String filePath=".\\dataFolder\\emp.xlsx";
		FileOutputStream fos= new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		
		System.out.println("file written suceesfully");
	}

}
