package Mon5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KWDFWDriver {
	Data d;
public Data readExcel(int row)
{
	d=new Data();
	try {
		
		
		File path=new File("TestData.xlsx");
		FileInputStream f=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(f);
	 XSSFSheet sheet=wb.getSheet("Sheet1");
	 XSSFRow r=sheet.getRow(row);
		 XSSFCell c1=r.getCell(1);
		 XSSFCell c2=r.getCell(2);
		 XSSFCell c3=r.getCell(3);
      d.keyword=c1.getStringCellValue();
    d.path=c2.getStringCellValue();
   d.test_data=c3.getStringCellValue();
	
	}
	catch(IOException ee)
	{
		ee.getMessage();
	}
	return d;
}
public  void writeExcel(String res,int row)
{
	try {
		File path=new File("TestData.xlsx");
		FileInputStream f=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(f);
		 XSSFSheet sheet=wb.getSheet("Sheet1");
		 XSSFRow r=sheet.getRow(row);
		 XSSFCell c5=r.createCell(4);
		 FileOutputStream fos=new FileOutputStream(path);
		 c5.setCellValue(res);
		
		 wb.write(fos);
	     
		}
		catch(IOException ee)
		{
			ee.getMessage();
		}

}
public static void main(String[] args) {
	KWDFWDriver dri=new KWDFWDriver();
	Data d;
	String kw;
	for(int i=0;i<6;i++)
	{
		d=dri.readExcel(i+1);
		kw=d.keyword;
		switch(kw)
		{
		case "launchBrowser":
		All_Methods.launchBrowser(d.test_data);
		break;
		case "clickLink":
		All_Methods.clickLink(d.path);
		break;
		case "enterText":
		All_Methods.enterText(d.path, d.test_data);
		break;
		case "clickButton":
		All_Methods.clickButton(d.path);
		break;
		case "verify":
		d.test_res=All_Methods.verify(d.path, d.test_data);
		dri.writeExcel(d.test_res,6);
		break;
		default:
			System.out.println("Invalid Operation");
		}
   }
}
}
