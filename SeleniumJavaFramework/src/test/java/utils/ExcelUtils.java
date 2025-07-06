package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		//getRowCount();
		//getCellData();
		//getCellDataNumeric(1,1);
	}
	
	public ExcelUtils(String excelPath,String SheetName ) throws IOException
	{
		 workbook = new XSSFWorkbook(excelPath);
		 sheet=workbook.getSheet(SheetName);
	}

	public static int getRowCount() throws IOException
	{
		/*workbook = new XSSFWorkbook("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");*/
		int rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		return rowCount;
		
	}
	
	public static int getColCount() throws IOException
	{
		/*workbook = new XSSFWorkbook("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");*/
		int ColCount= sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(ColCount);
		return ColCount;
		
	}
	
	public static String getCellData(int rowNum,int columnNum)
	{ 
		String cellData=null;
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			 cellData=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			System.out.println(cellData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellData;
		
	}
	
	public static int getCellDataNumeric(int rowNum,int columnNum)
	{
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			//double cellDataNum=sheet.getRow(1).getCell(1).getNumericCellValue();
			double cellDataNum=sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
			System.out.println(cellDataNum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnNum;
		
	}
}
