package Mon5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
  
	public String email;
	public String pass;
	public String er;


	public login read_excel(int i) {
	login al =  new login();
	try {
	File f = new File("TestData.xlsx");
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
	XSSFRow row = sh.getRow(i);
	al.email = row.getCell(0).getStringCellValue();
	al.pass = row.getCell(1).getStringCellValue();
	al.er = row.getCell(2).getStringCellValue();
	}catch(Exception e) {
	e.printStackTrace();
	}
	return al;
	}

	}


