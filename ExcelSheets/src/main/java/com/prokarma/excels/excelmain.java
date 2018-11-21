package com.prokarma.excels;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelmain{
	
	public static String filename = System.getProperty("user.dir")+"\\Resources\\Sample.xlsx";
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	
	public static void main(String args[]) {
		System.out.println(filename);
		
	//Row count	
	excelfunctions xls = new excelfunctions(filename);
	System.out.println("row count :"+xls.getRowCount("Manohar"));
	
	
	//Column Count
	System.out.println("column count :"+xls.getColumnCount("Manohar", 1));
	
	//Get cell data using Rownow and columnname and SheetName
	System.out.println("Cell Data:"+ xls.getCellData("Manohar","Column3",2));
		

	
	//Get cell data using Rownow and column number and SheetName
	System.out.println("Cell Data:"+ xls.getCellData("Sheet2",4,3));
			
		}	
}