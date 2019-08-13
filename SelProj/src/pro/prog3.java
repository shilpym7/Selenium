package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("shilpymishra788@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("hannah");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		/*
		 * String
		 * email=dr.findElement(By.xpath("//*[contains(text(),'gmail.com')]")).getText()
		 * ;
		 */
		//String email=dr.findElement(By.xpath("//a[@class='account']")).getText();
		String email=dr.findElement(By.className("account")).getText();
				System.out.println(email);
		
		if(email.equals("shilpymishra788@gmail.com"))
		System.out.println("Email id is displayed correctly.");
		else
		System.out.println("Email id is displayed incorrectly.");
		dr.findElement(By.className("ico-logout")).click();
		
	}

}
