package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	                                              //checkedException
	public static void main(String[] args) throws IOException {
		
		//location of your excel sheet or data
		
		File f=new File("C:\\Users\\Sridhar\\eclipse-workspace\\FrameWorkProject\\testData\\facebook.xlsx");
		
		//to read the values- 
		FileInputStream fin =new FileInputStream(f);
		
		//mention the workbook as .xlsx file
		Workbook w= new XSSFWorkbook(fin);
		
		//select the sheet from the workbook
		
		Sheet s= w.getSheet("Greens");
		
		//select the row from the sheet
		
		Row r= s.getRow(3);
		
		//select the cell from the row
		
		Cell c= r.getCell(0);
		
		System.out.println(c);
	}

}
