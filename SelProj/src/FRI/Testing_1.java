package FRI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing_1 extends BaseClasses.BaseCl{
	WebDriver dr;
  @Test
  public void tc1() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
  }
  @Test
  public void tc2() {
	  System.out.println("in tc2");
	  String ac="shilpymishra788";
	 String ex=attempt_login("shilpymishra788","hannah",dr);
	  Assert.assertEquals(ac, ex);
  }
  @Test
  public void tc3() {
	  System.out.println("in tc3");
	  String ac="shilpymishra788@gmail.com";
	  String ex=attempt_login("shilpymishra788@gmail.com","hannah",dr);
	  Assert.assertEquals(ac, ex);
  }
 		  
	
}
