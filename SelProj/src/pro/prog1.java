package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com");
	String tt=dr.getTitle();
	if(tt.equalsIgnoreCase("Demo Web Shop"))
		System.out.println("Title verified");
	else
		System.out.println("Title not verified");
	dr.findElement(By.className("ico-register")).click();
	String regt=dr.findElement(By.className("ico-register")).getText();
	if(regt.equalsIgnoreCase("Register"))
		System.out.println("Register text verified");
	else
		System.out.println("Register text not verified");
	dr.findElement(By.id("gender-male")).click();
	dr.findElement(By.id("Email")).sendKeys("poiuytr@gmail.com");
	dr.findElement(By.id("FirstName")).sendKeys("Neha");
	dr.findElement(By.id("LastName")).sendKeys("Singh");
	dr.findElement(By.id("Password")).sendKeys("abcdef");
	dr.findElement(By.id("ConfirmPassword")).sendKeys("abcdef");
	dr.findElement(By.id("register-button")).click();
	dr.findElement(By.className("ico-logout")).click();
	dr.close();
	System.out.println("Run successful");
	
}
}
