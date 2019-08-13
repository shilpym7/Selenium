package Wed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pro.Data;

public class Cases {
	static File file=new File("Login_data2.xlsx");
	static ArrayList<Datae> al=new ArrayList<Datae>();
	static Datae d=new Datae();

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	get_excel_data();

	Datae data2=new Datae();


	for(int i1=0;i1<al.size();i1++) {
		data2.email=al.get(i1).email.toString();
	data2.password=al.get(i1).password.toString();
	data2.expected_value=al.get(i1).expected_value.toString();
	System.out.println(data2.email);
	System.out.println(data2.password);
	System.out.println(data2.expected_value);
	}


	}

	private static void get_excel_data() {
	// TODO Auto-generated method stub
	try {
	FileInputStream input=new FileInputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(input);
	XSSFSheet sheet=workbook.getSheetAt(0);
	String email,pass;

	for(int i=1;i<=sheet.getLastRowNum();i++) {
	email=sheet.getRow(i).getCell(0).getStringCellValue();
	pass=sheet.getRow(i).getCell(1).getStringCellValue();
	d.email=email;
	d.password=pass;
	d.expected_value=sheet.getRow(i).getCell(2).getStringCellValue();
	attempt_login(email,pass,i);
	last_case();
	}



	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}

	public static String attempt_login(String email,String pass,int i) {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");

	dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
	dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);

	dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

		String stat="";
		try {
	  if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isDisplayed())
	  {
		String err=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
		System.out.println("Not logged in");
		System.out.println(err);
		stat="fail";
		update_data(err,stat,i);
	}
		}
		catch(Exception ee)
		{
			
		}
		try
		{
	if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).isSelected());
	{
			String err=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
           System.out.println("Not Logged In");
           stat="fail";
           System.out.println(err);
           update_data(err,stat,i);
		
	}
		}
catch(Exception ee)
		{
	
		}
try {
	if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).isDisplayed())
	{
		String verify=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();

		if(verify.equalsIgnoreCase(email)) {
		
	System.out.println("Login Successful");
	stat="pass";
	update_data(verify,stat,i);
		}
		
	dr.close();

	}
}
	catch(Exception ee)
	{
		}
return stat;
	}
	

	private static void update_data(String email, String stat,int i) {
	// TODO Auto-generated method stub
	try {
	FileInputStream input=new FileInputStream(file);
	@SuppressWarnings("resource")
	XSSFWorkbook workbook=new XSSFWorkbook(input);
	XSSFSheet sheet=workbook.getSheetAt(0);
	XSSFRow row=sheet.getRow(i);


	FileOutputStream output=new FileOutputStream(file);
	XSSFCell cell1=row.createCell(3);
	XSSFCell cell2=row.createCell(4);
	cell1.setCellValue(email);
	cell2.setCellValue(stat);


	workbook.write(output);

	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}
     public static void last_case()
     {
    	 System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
 		WebDriver dr=new ChromeDriver();
 		dr.get("http://demowebshop.tricentis.com");
 		String stat;
 	
    	 try
 		{
    		 dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
 	if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isSelected());
 	{
 			String err=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
            System.out.println("Not Logged In");
            stat="fail";
            update_data(err,stat,5);
 		
 	}
 		}
 catch(Exception ee)
 		{
 	
 		}
     }
	}
	


