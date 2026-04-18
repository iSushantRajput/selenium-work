package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileUtility {
	public String getDataFromProperties(String key) throws IOException {
		// CONNECTION WITH PROPERTIES FILES
		FileInputStream FISP = new FileInputStream("./src/test/resources/CommonData.properties");

		Properties POBJ = new Properties();
		POBJ.load(FISP);

		String value = POBJ.getProperty(key);
		return value;
	}
	
	public String getDataFromExcel(String SheetName,int row, int cellNum) throws IOException  {
		
		FileInputStream FISE = new FileInputStream("./src/test/resources/testScriptData.xlsx");
		Workbook wb= WorkbookFactory.create(FISE);
	
		Sheet sh = wb.getSheet(SheetName);
		Row ro = sh.getRow(row);
		Cell cell = ro.getCell(cellNum);
		String Value = cell.getStringCellValue();
		
		return Value;
		
		
		

		
	}
}
