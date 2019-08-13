package BaseClasses;

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

public class BaseCl {

	public static String attempt_login(String email,String pass,WebDriver dr) {
	// TODO Auto-generated method stub
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
		
			}
			
	

		}
	}
		catch(Exception ee)
		{
			}
	return stat;
		}

	

	/*
	 * private static void update_data(String email, String stat,int i) { // TODO
	 * Auto-generated method stub try { FileInputStream input=new
	 * FileInputStream(file);
	 * 
	 * @SuppressWarnings("resource") XSSFWorkbook workbook=new XSSFWorkbook(input);
	 * XSSFSheet sheet=workbook.getSheetAt(0); XSSFRow row=sheet.getRow(i);
	 * 
	 * 
	 * FileOutputStream output=new FileOutputStream(file); XSSFCell
	 * cell1=row.createCell(3); XSSFCell cell2=row.createCell(4);
	 * cell1.setCellValue(email); cell2.setCellValue(stat);
	 * 
	 * 
	 * workbook.write(output);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * } public static void last_case() {
	 * System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	 * WebDriver dr=new ChromeDriver(); dr.get("http://demowebshop.tricentis.com");
	 * String stat;
	 * 
	 * try { dr.findElement(By.xpath(
	 * "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"
	 * )).click(); if(dr.findElement(By.xpath(
	 * "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div"
	 * )).isSelected()); { String err=dr.findElement(By.xpath(
	 * "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div"
	 * )).getText(); System.out.println("Not Logged In"); stat="fail";
	 * update_data(err,stat,5);
	 * 
	 * } } catch(Exception ee) {
	 * 
	 * } }
	 */	}
	


