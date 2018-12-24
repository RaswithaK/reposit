package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingexcel {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String value;
	public static String value1;
	public static FileInputStream fis;
	public static File src;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		value=setcelldata("autamation",2,2);
		 value1=setcelldata("automation",1,2);
		 System.out.println("ouput is" +value1);
		System.out.println("ouput is" +value);
	}
	public static String  setcelldata(String text,int rownum,int col) throws IOException
	{
		src=new File("C:\\Users\\Public\\Excel data\\Data.xlsx");
		fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("script");
		 row=sheet.getRow(rownum);
	    cell=row.getCell(col);
	    		cell.setCellValue(text);
		 return cell.getStringCellValue();
	}

}
