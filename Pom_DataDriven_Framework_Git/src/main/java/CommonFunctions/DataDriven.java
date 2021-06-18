package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	static String Data[][]=new String[2][17];
	XSSFRow row;
	public static String[][] read_Data_from_Excel() throws IOException
	{
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/Data/Selenium_Data.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(1);
		    int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		    System.out.println(sheet.getLastRowNum());
		    System.out.println(sheet.getFirstRowNum());
		    System.out.println("row count is"+rowcount);
		    int cellcount=sheet.getRow(1).getLastCellNum();
		    System.out.println("col count is"+cellcount);
		    for(int i=1;i<=rowcount;i++)
		    {
		    	for(int j=0;j<cellcount;j++)
		    	{
		    		Data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		    		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		    	}
		    }
		    
		    return Data;
		    
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Data;
		
		
	}
	public static void main(String args[]) throws IOException
	{
		DataDriven dd=new DataDriven();
		dd.read_Data_from_Excel();
	}
	
}
