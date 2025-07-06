package utils;

import java.io.IOException;

public class ExcelUtilDemo {

	public static void main(String[] args) throws IOException {
		ExcelUtils excel= new ExcelUtils("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx","Sheet1");
		excel.getCellDataNumeric(1,1);
		excel.getColCount();
	}

}
