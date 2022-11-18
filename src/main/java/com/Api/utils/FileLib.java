package com.Api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib
{
	public String getKeyPropertyvalue(String propPath,String key) throws Throwable
	{
		FileInputStream fis =new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}
	
	public String getCellValue(String excelPath, String sh, int row, int cel) throws Throwable
	{
		FileInputStream fil=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fil);
		String excelvalue=wb.getSheet(sh).getRow(row).getCell(cel).toString();
		
		return excelvalue;

	}
	public int getRowCount(String excelPath,String sheet) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(sheet).getLastRowNum();
		return rowCount;
		
	}
	
	public void setCellData(String excelPath, String sheet, int row, int cell, String value) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		//wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}

	public Cell getnumericcellValue (String excelPath, String sh, int row, int cel) throws Throwable
	{		
		FileInputStream fil=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fil);
		Sheet sheet=wb.getSheet(sh);
		Row r=sheet.getRow(row);
		Cell c=r.getCell(cel);
		return c;
	}
	
	public  void deleteDirectory(File file)
    {
        // store all the paths of files and folders present
        // inside directory
        for (File subfile : file.listFiles())
        {
  
            // if it is a subfolder
            // recursiley call function to empty subfolder
            if (subfile.isDirectory())
            {
                deleteDirectory(subfile);
            }
  
            // delete files and empty subfolders
            subfile.delete();
        }
    }

	public void createFolder(String path)
	{
		File createDownloadFolder = new File(path);  
	      //Creating a folder using mkdir() method  
	      boolean bool = createDownloadFolder.mkdir();  
	      if(bool)
	      {  
	         System.out.println("Folder is created successfully");  
	      }else
	      {  
	         System.out.println("Error Found!");  
	      }  
		
	}
	
}