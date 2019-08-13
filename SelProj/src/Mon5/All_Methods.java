package Mon5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class All_Methods {
     static WebDriver dr;
	 public static void launchBrowser(String url)
	 {
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
			dr=new ChromeDriver();
			dr.get(url);
	 }
	 public static void enterText(String path,String text)
	 {
		 	dr.findElement(By.xpath(path)).sendKeys(text);
	 }
	 public static void clickButton(String path)
	 {
		
			dr.findElement(By.xpath(path)).click();
	 }
	 
	 public static String verify(String path,String ev)
	 {
		 String ar=dr.findElement(By.xpath(path)).getText() ;
		 System.out.println(ar);
		 Assert.assertEquals(ar,ev);
		 return ar;
	 }
	public static void clickLink(String path) {
		// TODO Auto-generated method stub
		dr.findElement(By.xpath(path)).click();
	}
}
