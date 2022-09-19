package com.Api.utils;

import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public  ExcelUtils(String excelPath,String sheetName) 
	{
		try {
		workbook =new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet("Sheet1");
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	public static void getRowCount()
	{
		
	 int rowCount=sheet.getPhysicalNumberOfRows();
	 System.out.println("No. of rows" +rowCount);
	}
		
	public static Object getCellData(int rowNum,int colNum) throws IOException
	{
	 
	 DataFormatter formatter=new DataFormatter();
	 Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
	 return value;
	
}
}