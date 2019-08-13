package FRI2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_2 extends BaseClasses.BaseCl{
	WebDriver dr;
 
  @BeforeMethod
  public void BM()
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
  }
  @AfterMethod
  public void AM()
  {
	  dr.close();
  }
  @Test(priority=3)
  public void A()
  {
	  String res=attempt_login("shilpymishra788@gmail.com","hannah",dr);
      Assert.assertEquals(res,"pass");	 
	  // System.out.println("In A");
  }
  @Test(priority=1)
  public void z()
  
  {
	  String res=attempt_login("shilpymishra788@gmail.com","hanh",dr);
	  Assert.assertEquals(res,"fail");	
	  //System.out.println("In z");
  }
  @Test(priority=2)
  public void a()
  {
	  String res=attempt_login("shilpymishra788@gmail","hannah",dr);
	  Assert.assertEquals(res,"fail");	
	  //System.out.println("In a");
  }

}
