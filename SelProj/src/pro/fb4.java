package pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class fb4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.ericmmartin.com/code/jquery/checkbox.html");
		/*
		 * //1================================================= List<WebElement>
		 * rb=dr.findElements(By.name("sex")); for(int i=0;i<rb.size();i++)
		 * System.out.println(rb.get(i).getAttribute("id"));
		 */
		/*
		 * List ll=dr.findElements(By.name("sex")); ((WebElement)ll.get(0)).click();;
		 */
	//2=================================================
	dr.findElement(By.id("test-1")).click();
	boolean cs=dr.findElement(By.id("test-1")).isSelected();
	boolean fs=false;
	System.out.println(cs);
	if(cs==false) {
		if(fs==true)
			dr.findElement(By.id("test-1")).click();
	}
	else
	{
		if(fs==false)
			dr.findElement(By.id("test-1")).click();
	}
	}
}

