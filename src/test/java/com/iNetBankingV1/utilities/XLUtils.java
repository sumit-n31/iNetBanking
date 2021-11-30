package com.iNetBankingV1.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static HSSFWorkbook wb;
	public static HSSFSheet ws;
	public static HSSFRow row;
	public static HSSFCell cell;
	
	public static int getRowCount(String xlfile, String xlSheet) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new HSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String xlfile, String xlSheet, int rowcount) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new HSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		row = ws.getRow(rowcount);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String xlfile, String xlSheet, int rowcount,int cellCount) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new HSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		row = ws.getRow(rowcount);
		cell=row.getCell(cellCount);
		String data;
		try {
		DataFormatter formatter = new DataFormatter();
		String cellData = formatter.formatCellValue(cell);
		return cellData;
		}catch (Exception e) {
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String xlfile, String xlSheet, int rownum,int colnum,String data) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new HSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		row = ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	

}
