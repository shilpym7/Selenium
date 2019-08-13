package Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class copypaste {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com");
		/*
		 * WebElement we=dr.findElement(By.xpath("")); WebElement
		 * we=dr.findElement(By.xpath(""));
		 */
	WebElement we=dr.findElement(By.xpath("//input[@name='firstname']"));
	WebElement we1=dr.findElement(By.xpath("//input[@name='lastname']"));
	Actions act=new Actions(dr);
	Action set=act.moveToElement(we).click().sendKeys("Hannah").keyDown(Keys.CONTROL).sendKeys("a")
			.sendKeys("c").keyUp(Keys.CONTROL).build();
	set.perform();
	Action set2=act.moveToElement(we1).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build();
	set2.perform();
}
}
