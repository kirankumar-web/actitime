package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata implements autoconstants
{
   public static String getdata(String filepath,String sheet,int rc,int cc)
   {
	   try 
	   {
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb = WorkbookFactory.create(fis);
		Cell cn = wb.getSheet(sheet).getRow(rc).getCell(cc);
		String data = cn.toString();
		return data;
		} 
	   catch (Exception e) 
	   {
		   return " ";
	   }
   }
	   public static  int getrownum(String filepath,String sheet)
	   {
		   try 
		   {
			FileInputStream fis=new FileInputStream(new File(filepath));
			Workbook wb = WorkbookFactory.create(fis);
			int rn1 = wb.getSheet(sheet).getLastRowNum();
			return rn1;
			} 
		   catch (Exception e) 
		   {
			   return 0;
		   }
	   }
		   public static  short getcellnum(String filepath,String sheet,int rc)
		   {
			   try 
			   {
				FileInputStream fis=new FileInputStream(new File(filepath));
				Workbook wb = WorkbookFactory.create(fis);
				short cn1 = wb.getSheet(sheet).getRow(rc).getLastCellNum();
				
				return cn1;
				} 
			   catch (Exception e) 
			   {
				   return 0;
			   }
   }
}
