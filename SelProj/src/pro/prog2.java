package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		
		  String tt=dr.getTitle(); 
		  if(tt.equals("Online Bookstore"))
		  System.out.println("Title verified");
		  else
		  System.out.println("Title not verified");
		  WebElement we=dr.findElement(By.name("category_id")); 
		  Select s1=new Select(we);
		  s1.selectByVisibleText("Databases");
		  dr.findElement(By.name("DoSearch")).click();
		  dr.close();
		  
	}

}
