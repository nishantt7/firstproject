package lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Exceltest {
	public static void main(String[] args) throws Exception 
	{
		File src=new File("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		FileInputStream obj1=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(obj1);
		for (int k=0;k<wb.getNumberOfSheets();k++)
	 {
		XSSFSheet sheet1=wb.getSheetAt(k);
		String sheetname=sheet1.getSheetName();
		System.out.println(sheetname);
		int b=sheet1.getLastRowNum();
		System.out.println("no. of rows are" +b);
		for(int i=0;i<b;i++) 
		{
			Row row=sheet1.getRow(i);
			{	
			for(int j=0;j<row.getLastCellNum();j++)
			{
				if(sheetname.equalsIgnoreCase("Sheet1") && row.getCell(j).getStringCellValue().equalsIgnoreCase("user2"));
				System.out.print(row.getCell(j));
//				System.out.print(row.getCell(j,MissingCellPolicy.CREATE_NULL_AS_BLANK));
				System.out.print("||");
				break;
			}
			System.out.println();
		    }
		}
		System.out.println();	
      }
   }
}	
