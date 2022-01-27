package Org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTask\\src\\test\\resources\\Fb login.xlsx");
	
	FileInputStream fi=new FileInputStream(f);
	
	Workbook w= new XSSFWorkbook(fi);
	Sheet s = w.getSheet("Vijay");
	Row row = s.getRow(1);
	
	Cell cell = row.getCell(4);
	System.out.println(cell);
	
	int physicalNumberOfRows = s.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(physicalNumberOfCells);
	
	
//	for(int i=0;i<row.getPhysicalNumberOfCells();i++)
//	{
//	 Cell cell2 = row.getCell(i);
//	 System.out.println(cell2);
//}
//	System.out.println("--------");
//	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
//		Row row2 = s.getRow(i);
//		for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
//			Cell cell3 = row2.getCell(j);
//			System.out.println(cell3);
//		}
//		System.out.println("-----------------");
//	}
	
//	Single cell Check the Data type
//   int type = cell.getCellType();
//   System.out.println(type);
//   
//   if(type==1)
//   {
//	   String value = cell.getStringCellValue();
//	   System.out.println(value);
//   } else { 
//	   if(DateUtil.isCellDateFormatted(cell))
//	   {
//		   Date date = cell.getDateCellValue();
//		   SimpleDateFormat sd=new SimpleDateFormat();
//		   String value = sd.format(date);
//		   System.out.println(value);
//	   }
//	   else {
//		   double num = cell.getNumericCellValue();
//		   long l=(long)num;
//		   String value = String.valueOf(l);
//		   System.out.println(value);
//	   }
//   }
	   for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row2 = s.getRow(i);
			for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
				Cell cell3 = row2.getCell(j);
				//System.out.println(cell3);
				int type = cell3.getCellType();
				if(type==1)
				   {
					   String value = cell3.getStringCellValue();
					   System.out.println(value);
				   } else { 
					   if(DateUtil.isCellDateFormatted(cell3))
					   {
						   Date date = cell3.getDateCellValue();
						   SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
						   String value = sd.format(date);
						   System.out.println(value);
					   }
					   else {
						   double num = cell3.getNumericCellValue();
						   long l=(long)num;
						   String value = String.valueOf(l);
						   System.out.println(value);
					   }
			}
			
		}
			System.out.println("-----------------");
   }
   
}
}