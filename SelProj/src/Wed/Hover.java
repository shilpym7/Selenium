package Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/");
	WebElement we=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
	WebElement we1=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a"));
	Actions act=new Actions(dr);
	Action set=act.moveToElement(we).build();
	set.perform();
	Action set1=act.moveToElement(we1).click(we1).build();
	set1.perform();
}
}
