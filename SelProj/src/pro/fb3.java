package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
	 String str=dr.findElement(By.cssSelector("input#u_0_q")).getTagName();
	 System.out.println(str);
	 String str2=dr.findElement(By.cssSelector("input[value='Log In']")).getAttribute("type");
	 System.out.println(str2);
	 String str3=dr.findElement(By.xpath("//*[text()='Birthday']")).getTagName();
	 System.out.println(str3);
	 String str4=dr.findElement(By.xpath("//*[contains(text(),'Create an')]")).getText();
	 System.out.println(str4);
	 String str5=dr.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).getAttribute("name");
	 System.out.println(str5);
	 String str6=dr.findElement(By.xpath("//*[text()='Birthday']//ancestor::div[2]")).getAttribute("class");
	 System.out.println(str6);
}
}