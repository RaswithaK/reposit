package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exelwork {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String value;
	public static String value1;
	public static FileInputStream fis;
	static FileOutputStream outFile = null;
	public static File src;
	
public static  void main(String[] args) throws IOException {
	
	 /*value=getcelldata(2,2);
	 value1=getcelldata(1,2);
	 System.out.println("ouput is" +value1);
	System.out.println("ouput is" +value);*/
	exelwork udateexcel=new exelwork();
udateexcel.UpdateExcel();
}

/*public String getcelldata(int rownum,int cellnum)
{
	
}*/
public void UpdateExcel()
{
	src=new File("C:\\Users\\Public\\Excel data\\Data.xlsx");
	try {
		fis=new FileInputStream(src);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wb=new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sheet=wb.getSheet("Sheet1");
	/*Iterator rows=sheet.rowIterator();
	while(rows.hasNext())
		
		row=(XSSFRow) rows.next();*/ //SIMILARY FOR Columns
	cell=sheet.getRow(0).getCell(1);
	cell.setCellValue("test123");
	cell=sheet.getRow(1).getCell(2);
	cell.setCellValue("123456");

	try {
		
		outFile = new FileOutputStream(new File("C:\\Users\\Public\\Excel data\\Data2.xlsx"));
		wb.write(outFile);
		outFile.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
	
	 /*row=sheet.getRow(rownum);
	 System.out.println(sheet.getLastRowNum());
	 System.out.println(row.getLastCellNum());
	
    cell=row.getCell(col);*/
    
   
	 //return cell.getStringCellValue();
	 
}
}
