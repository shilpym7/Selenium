package Wed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com");
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * WebDriverWait wdw=new WebDriverWait(dr,10);
		 * wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 * dr.findElement(By.xpath("")).click();
		 */
	dr.navigate().back();
	dr.navigate().forward();
	dr.navigate().refresh();
	dr.navigate().to("https://www.gmail.com");
}
}
