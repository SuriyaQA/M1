package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFileUtility {

	/**
	 * This method is used to Fetch the single Data 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String fetchSingleData(String sheet,int row,int column) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(column);
		String data = c.toString();
		return data;
	}
	
	/**
	 * This Method will give all the data present in the excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static void fetchAllData() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("");
		Workbook w = WorkbookFactory.create(fis);
		 Sheet s = w.getSheet("sheet1");
		 for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			 for(int j=0;j<s.getRow(0).getPhysicalNumberOfCells();j++) {
				 
				  String data = s.getRow(i).getCell(j).toString();
				
			 }
			 
			
		}
		 
	}
}
