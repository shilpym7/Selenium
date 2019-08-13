package pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class fb2 {
	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		 * WebDriver dr=new ChromeDriver(); dr.get("http://www.facebook.com");
		 * //dr.findElement(By.id("email")).sendKeys("shilpymishra@rocketmail.com");
		 * //WebElement we=dr.findElement(By.id("email")); WebElement
		 * we1=dr.findElement(By.id("day")); Select s1=new Select(we1);
		 * s1.selectByVisibleText("17");
		 */
		System.setProperty("webdriver.ie.driver", "D://Drivers//IEDriverServer_x64_3.14.0//IEDriverServer.exe");
		  WebDriver dr1=new InternetExplorerDriver();
		  dr1.get("https://www.facebook.com");
		  System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  WebDriver dr2=new FirefoxDriver();
		  dr2.get("https://www.gmail.com");
	}
}
