package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide path of file
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh = wb.getSheet("Sheet1");//get into sheet
		Row row = sh.getRow(5);//get the desired row
		Cell cell = row.getCell(1);//get the desired column/cell
		String data = cell.getStringCellValue();//read the data from that cell
		System.out.println(data);//print the data			
	}
}
