package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOI{

	public static void main(String[] args) throws Exception {
		
	try{	
	File src= new File("C://Users//nikhil.harde//Practice//testdata.xlsx");
	FileInputStream fis= new FileInputStream(src);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sh= wb.getSheetAt(0);
	
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue().toString());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue().toString());
		
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
}