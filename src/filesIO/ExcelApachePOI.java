package filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApachePOI {
	
	public static void main1(String[] args) throws IOException {
		String filename = "src/testData/Vendors.xlsx";
		try (	FileInputStream file = new FileInputStream(new File(filename));
				XSSFWorkbook workbook = new XSSFWorkbook(file); ) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			for (int i=1; i <= sheet.getLastRowNum(); i++) {
				String name = sheet.getRow(i).getCell(0).getStringCellValue();
				String email = sheet.getRow(i).getCell(1).getStringCellValue();
				String phone = sheet.getRow(i).getCell(2).getStringCellValue();
				System.out.println(name + ", " + email + ", " + phone);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Message: " + e.getMessage());
		} 
	}

	// Pre-Java7 handling of FILENOTFOUNDEXCEPTION exception
	public static void main(String[] args) throws IOException {
		String filename = "src/testData/Vendors.xlsx";
		FileInputStream file = null;
		XSSFWorkbook workbook = null;
		
		try {
			file = new FileInputStream(new File(filename));
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			for (int i=1; i <= sheet.getLastRowNum(); i++) {
				String name = sheet.getRow(i).getCell(0).getStringCellValue();
				String email = sheet.getRow(i).getCell(1).getStringCellValue();
				String phone = sheet.getRow(i).getCell(2).getStringCellValue();
				System.out.println(name + ", " + email + ", " + phone);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Message: " + e.getMessage());
		} finally {
			if (file != null) { file.close(); }
			if (workbook != null) { workbook.close(); }
		}
	}
}
