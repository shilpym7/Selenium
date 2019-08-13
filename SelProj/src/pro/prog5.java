package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.w3schools.com/html/html_tables.asp");
	int c=3,r=2;
	String xp="//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]";
	String data=dr.findElement(By.xpath(xp)).getText();
	for(int i=2;i<=7;i++)
	{
		for(int j=1;j<=3;j++)
		{
			xp="//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]";
			data=dr.findElement(By.xpath(xp)).getText();
			System.out.println(data+" ");
		}
	}
	
}
}
