package Mon5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
	ArrayList<login> al = new ArrayList<login>();
	WebDriver dr;

	@BeforeMethod
	public void bm() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	dr = new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com");
	dr.findElement(By.linkText("Log in")).click();

	}

	@AfterMethod
	public void am() {
	dr.quit();
	}

	@Test(dataProvider = "dp")
	public void f(String email, String pass, String er) {
	dr.findElement(By.id("Email")).sendKeys(email);
	dr.findElement(By.id("Password")).sendKeys(pass);
	dr.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	String ar = dr.findElement(By.linkText(email)).getText();
	Assert.assertEquals(ar, er);
	}

	@DataProvider
	public String[][] dp() {
	login lg = new login();
	String[][] data = new String[4][3];
	for(int i=1; i<5; i++) {
	al.add(lg.read_excel(i));
	}
	for(int i=0;i<4;i++) { 
	data[i][0] = al.get(i).email;
	data[i][1] = al.get(i).pass;
	data[i][2] = al.get(i).er;

	}

	   return data;
	}
}
